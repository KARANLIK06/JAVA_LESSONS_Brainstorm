package day42_Exceptions;

import static java.lang.Thread.sleep;

public class MorningWorkOut {
    public static void main(String[] args) {
        System.out.println("-------------Push-Up Started--------------");
/*
        for (int i = 1; i <= 30; i++) {
            System.out.print("\rPush-Up "+i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

 */
        for (int i = 1; i <= 30; i++) {
            System.out.print("\rPush-Up " + i);
            sleep(1.5);

        }
        System.out.println("-------------Push-Up Completed--------------");

        System.out.println("-------------Pull-Up Started--------------");
/*
        for (int i = 1; i <= 20; i++) {
            System.out.print("\rPull-Up "+i);
            try {
                sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

 */
        for (int i = 1; i <= 20; i++) {
            System.out.print("\rPull-Up " + i);
            sleep(2.5);
        }
            System.out.println("-------------Pull-Up Completed--------------");


    }

        public static void sleep ( double second){
            try {
                Thread.sleep((long) (second * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

/*
MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each
			2. Do 20 Pull-ups and try pausing 2.5 seconds in each

 */