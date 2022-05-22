package step1;

import java.util.Scanner;

public class firstApp {
    /*public static void main(String[] args) {

    //Lesson1:

    //printThreeWords();
    //checkSumSign();
    //printColor();
    //compareNumbers();

    }*/

    //Lesson 1:

    public static void printThreeWords() {
        System.out.println("Orange\n"+"Banana\n"+"Apple\n");
    }

    public static void checkSumSign() {

        System.out.println("Check Sum. Positive or negative ?");

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number A: ");
        int a= in.nextInt();

        System.out.print("Input a number B: ");
        int b= in.nextInt();

        //in.close();

        int c = a + b;
        System.out.println("Sum:"+ c );

        if (c > 0) {
            System.out.print("Sum is positive");
        }
        if (c == 0) {
            System.out.print("Sum = null");
        }
        if (c < 0) {
            System.out.print("Sum is negative");
        }

    }

    public static void printColor() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nInter your number: ");
        int value = in.nextInt();

        if (value <= 0) {
            System.out.print("Red\n");
        }
        if (0 < value && value <= 100) {
            System.out.print("Yellow\n");
        }
        if (value > 100) {
            System.out.print("Green\n");
        }
    }

    public static void compareNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number A: ");
        int a= in.nextInt();

        System.out.print("Input a number B: ");
        int b= in.nextInt();

        if (a >= b) {
            System.out.print("A >= B");
        }
        else {
            System.out.print("A < B");
        }
    }

    //Lesson 2:

    public static void main(String[] args) {

        /*System.out.println(summ(7, 5));
        System.out.println(posOrNeg(-8));
        negOrPos(9);
        paternKlon("Lesson 2 ", 20);*/
        //yaerAnalis();

    }

    // Задание №1

    public static int summ(int a, int b) {

        if (a + b >= 10 && a + b <= 20) {
            System.out.println ("True");
        }
        else {
            System.out.println ("False");
        }
        return a + b;
    }

    // Задание №2

    public static int posOrNeg(int c) {

        if (c >= 0) {
            System.out.println("positive");
        }
        else {
            System.out.println("negative");
        }
        return c;
    }

    // Задание №3

    public static int negOrPos(int c) {

        if (c < 0) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        return c;
    }

    // Задание №4

    public static int paternKlon(String txt, int num) {

        for (int i = 0; i < num; i++ ) {
            System.out.print(txt);
        }
        return num;
    }

    // Задание №5

    /*public static void yaerAnalis() {

        int leapYear = 2020;

        for (int i = 0; i / 4; i++ ) {
            if (leapYear / i) {
                System.out.println(leapYear + i);
            }
        }
    }*/

}
