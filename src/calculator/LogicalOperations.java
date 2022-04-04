package calculator;

public class LogicalOperations {

    public static void main(String[] args) {

        // Moodle exercise 4
        System.out.println("Moodle exercise 4");
        System.out.println(verifyTextFastTrack("FastTrack") + "\n");


        // Moodle exercise 5
        System.out.println("Moodle exercise 5");
        String text = "FastTrack";
        int numberEx5 = 6;

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
//        int numberEx8 = 3;
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
        System.out.println("The greater number is " + whichNumberIsGreater(number1, number2, number3) + "\n");




//        System.out.println(numberEx3(number));
//        System.out.println(getMax(12,41));
    }

    // Moodle exercise 4

    public static String verifyTextFastTrack(String text) {
        if (text.equals("FastTrack")) {
            return "learning text comparison";
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
//        switch (numberEx8) {
//            case 1:
//                System.out.println("The number is 1");
//                break;
//            case 2:
//                System.out.println("The number is 2");
//                break;
//            case 3:
//                System.out.println("The number is 3");
//                break;
//            default:
//                System.out.println("The number is not 1, 2 or 3");
//
//
//        }
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
//    public static int numberEx3(int number) {
//        if (number >= 2 && number < 8) {
//            return number;
//        } else {
//            return 0;
//        }
//    }


//    public static int getMax(int first, int second) {
//        if (first > second) {
//            return first;
//        } else {
//            return second;
//        }
//    }





}
