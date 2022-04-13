package TemaLab3;

import java.util.Collections;
import java.util.Arrays;


public class TemaLab3Main {
    public static void main(String[] args) {

        // Moodle exercise 4
        System.out.println("Moodle exercise 4");
        System.out.println(verifyTextFastTrack("FastTrack") + "\n");


        // Moodle exercise 5
        System.out.println("Moodle exercise 5");
        String text = "FastTrack";
        int numberEx5 = 3;

        System.out.println(verifyTextAndNumber(text,numberEx5) + "\n");

        // Moodle exercise 6
        System.out.println("Moodle exercise 6");
        int snow = 6;
        System.out.println(snowAmount(snow) + "\n");

        // Moodle exercise 7
        System.out.println("Moodle exercise 7");
        int numberEx7 = 5;
        System.out.println(verifyNumberToThree(numberEx7) + "\n");

        // Moodle exercise 8
//        System.out.println("Moodle exercise 8");
//        int numberEx8 = 5;
//        System.out.println(showTheNumber(numberEx8) + "\n");

        // Moodle exercise 9
        System.out.println("Moodle exercise 9");
        int numberEx9 = 4;
        System.out.println(isNumberEven(numberEx9) + "\n");

        // Moodle exercise 10
        System.out.println("Moodle exercise 10");
        int age = 17;
        System.out.println(isEligibleToVote(age) + "\n");

        // Moodle exercise 11
        System.out.println("Moodle exercise 11");
        int number1 = 5;
        int number2 = 10;
        int number3 = 7;
        System.out.println("The greatest number is " + whichNumberIsGreater(number1, number2, number3) + "\n");

        // Assignment 1
        System.out.println("Assignment 1");
        int numberAs1x = 5;
        int numberAs1y = 8;
        System.out.println("The greatest number is " + printGreaterNumber(numberAs1x, numberAs1y) + "\n");

        // Assignment 2
        System.out.println("Assignment 2 is the same as Moodle exercise 4" + "\n");

        // Assignment 3
        System.out.println("Assignment 3");
        int numberAs3 = 5;
        System.out.println(isNumberBetweenTwooAndEight(numberAs3) + "\n");

        // Assignment 4
        System.out.println("Assignment 4");
        System.out.println("Assignment 4 is the same as Moodle exercise 5" + "\n");


        // Assignment 5
        System.out.println("Assignment 5");
        System.out.println("Assignment 5 is the same as Moodle exercise 6" + "\n");

        // Assignment 6
        System.out.println("Assignment 6");
        System.out.println("Assignment 6 is the same as Moodle exercise 7" + "\n");

        // Assignment 7
        System.out.println("Assignment 7");
//. If the user pressed number keys( from 0 to 9), the program will tell the number that is
//pressed, otherwise, program will show "Not allowed”. (use a switch case for this)

        // Assignment 8
        System.out.println("Assignment 8");
        System.out.println("Assignment 8 is the same as Moodle exercise 9" + "\n");


        // Assignment 9
        System.out.println("Assignment 9");
        System.out.println("Assignment 9 is the same as Moodle exercise 10" + "\n");

        // Assignment 10
        System.out.println("Assignment 10");
        System.out.println("Assignment 10 is the same as Moodle exercise 11" + "\n");

        // Assignment 11
//        System.out.println("Assignment 11");
//        int[] arrayAs11 = {1, 2, 3,};


        // Assignment 16
        System.out.println("Assignment 16");
        int[] numbersAs16 = {3, 7, 4,};

        System.out.println("Minimum = " + numbersAs16[0]);
        System.out.println("Maximum = " + numbersAs16[numbersAs16.length - 1]);


        //Assignment 17
        System.out.println("Assignment 17");
        int numberAs17x = 5;
        int numberAs17y = 8;
        System.out.println("The greater number of the two is: " + sortTwoNumbers(numberAs17x, numberAs17y));


    }



    //Methods

    // Moodle exercise 4

    public static String verifyTextFastTrack(String text) {
        if (text.equals("FastTrack")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    // Moodle exercise 5
    public static String verifyTextAndNumber(String text, int numberEx5) {
        if (text.equals("FastTrack") && numberEx5 <= 3) {
            return  text + numberEx5;
        } else if (!text.equals("FastTrack") && numberEx5 >= 4) {
            return numberEx5 + text;
        } else {
            return "Error";
        }
    }

    // Moodle exercise 6
    public static String snowAmount(int snow){
        if (snow > 8 && snow == 6){
            return "The amount of snow this winter was: " + snow + "cm";
        } else {
            return "The forecast snow is: " + snow + "cm";
        }
    }


    // Moodle exercise 7
    public static String verifyNumberToThree(int numberEx7) {
        if (numberEx7 > 3 && numberEx7 != 4){
            return "The number is greater than 3 and not equal to 4";
        } else if (numberEx7 == 4) {
            return "The number is equal to 4";
        } else if (numberEx7 < 3) {
            return "The number is lower than 3";
        }else{
            return "Error";
        }
    }

    // Moodle exercise 8
//    public static int showTheNumber(int numberEx8) {
//        switch(numberEx8) {
//            case 1:
//                return Integer.parseInt("The number is 1");
//
//            case 2:
//                return Integer.parseInt("The number is 2");
//
//            case 3:
//                return Integer.parseInt("The number is 3");
//
//            default:
//                return Integer.parseInt("The number is not  1, 2 or 3");
//
//
//        }
//
//    }


    // Moodle exercise 9
    public static boolean isNumberEven(int numberEx9) {
        if (numberEx9 % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }



    // Moodle exercise 10
    public static boolean isEligibleToVote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // Moodle exercise 11
    public static int whichNumberIsGreater(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            return number2;
        } else {
            return number3;
        }
    }

    // Assignment 1
    public static int printGreaterNumber(int numberAs1x, int numberAs1y){
        if (numberAs1x > numberAs1y){
            return numberAs1x;
        } else if (numberAs1y > numberAs1x){
            return numberAs1y;
        } else {
            return numberAs1x;
        }
    }

    // Assignment 3
    public static int isNumberBetweenTwooAndEight(int numberAs3) {
        if (numberAs3 >= 2 && numberAs3 < 8) {
            return numberAs3;
        } else {
            return 0;
        }
    }

    // Assignment 11
////    public static int sortNumbers(int arrayAs11) {
////
//
//
//
//
//    }


    // Assignment 16
    public static int getMinAndMax(int[] numbersAs16) {

        Arrays.sort(numbersAs16);
        return numbersAs16[0] * numbersAs16[numbersAs16.length - 1];
    }


    // Assignment 17
    public static int sortTwoNumbers(int numberAs17x, int numberAs17y) {
        if (numberAs17x > numberAs17y) {
            return numberAs17x;
        } else {
            return numberAs17y;

        }

    }
}
