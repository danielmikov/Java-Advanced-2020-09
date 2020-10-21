package Exercies.Ex04_ReverseNumbersWithAStack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex05_Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] robots = scanner.nextLine().split(";");
        String[] robotsDetailed = new String[robots.length * 3];
        int breakdownIndex = 0;
        Deque<String> robotsWaiting = new ArrayDeque<>();
        for (int i = 0; i < robotsDetailed.length; i += 3) {
            String[] breakdown = robots[breakdownIndex].split("-");
            robotsDetailed[i] = breakdown[0];         //robot's name
            robotsDetailed[i + 1] = breakdown[1]; //robot's work time
            robotsDetailed[i + 2] = "0"; //robot's remaining work time
            breakdownIndex++;
            String robotsWaitingS = String.format("%s %s %s", robotsDetailed[i], robotsDetailed[i + 1], robotsDetailed[i + 2]);
            robotsWaiting.offer(robotsWaitingS);
        }
        Deque<String> robotsWorking = new ArrayDeque<>();

        String[] timeStart = scanner.nextLine().split(":");
        int timeHours = Integer.parseInt(timeStart[0]);
        int timeMinutes = Integer.parseInt(timeStart[1]);
        int timeSeconds = Integer.parseInt(timeStart[2]);
        int timeElapsed = 0;

        boolean working = true;
        while (working) {
            String job = scanner.nextLine();
            if (job.equals("End")) {
                working = false;
                break;
            }

            timeElapsed++;
            timeSeconds++;
            if (timeSeconds > 59) {
                timeSeconds = 0;
                timeMinutes++;
            }
            if (timeMinutes > 59) {
                timeMinutes = 0;
                timeHours++;
            }
            if (timeHours > 24) {
                timeHours = 0;
                timeSeconds++;
            }


            if (!robotsWaiting.isEmpty()) {
                String[] robotCurrent = robotsWaiting.poll().split("\\s+");
                int robotWorkTime = Integer.parseInt(robotCurrent[1]);
                int robotRemainingTime = robotWorkTime - 1;

                String robotsWorkingS = String.format("%s %s %s", robotCurrent[0], robotWorkTime, robotRemainingTime);
                System.out.printf("%s - %s [%02d:%02d:%02d]%n", robotCurrent[0], job, timeHours, timeMinutes, timeSeconds);
                robotsWorking.offer(robotsWorkingS);
            } else {
                while (robotsWaiting.isEmpty()) {
                    for (int i = 0; i < robotsWorking.size(); i++) {
                        String[] robotCurrent = robotsWorking.poll().split("\\s+");
                        int robotWorkTime = Integer.parseInt(robotCurrent[1]);
                        int robotRemainingTime = Integer.parseInt(robotCurrent[2]);
                        if (robotRemainingTime <= 1) {
                            String robotsWaitingS = String.format("%s %s %s", robotCurrent[0], robotWorkTime, "0");
                            robotsWaiting.offer(robotsWaitingS);
                        } else {
                            String robotsWaitingS = String.format("%s %s %s", robotCurrent[0], robotWorkTime, robotRemainingTime - 1);
                            robotsWorking.offer(robotsWaitingS);
                        }
                    }
                    timeElapsed++;
                    timeSeconds++;
                    if (timeSeconds > 59) {
                        timeSeconds = 0;
                        timeMinutes++;
                    }
                    if (timeMinutes > 59) {
                        timeMinutes = 0;
                        timeHours++;
                    }
                    if (timeHours > 24) {
                        timeHours = 0;
                        timeSeconds++;
                    }

                }
                if (!robotsWaiting.isEmpty()) {
                    String[] robotCurrent = robotsWaiting.poll().split("\\s+");
                    int robotWorkTime = Integer.parseInt(robotCurrent[1]);
                    int robotRemainingTime = robotWorkTime - 1;

                    String robotsWorkingS = String.format("%s %s %s", robotCurrent[0], robotWorkTime, robotRemainingTime);
                    System.out.printf("%s - %s [%02d:%02d:%02d]%n", robotCurrent[0], job, timeHours, timeMinutes, timeSeconds);
                    robotsWorking.offer(robotsWorkingS);
                }
            }
        }
    }
}
