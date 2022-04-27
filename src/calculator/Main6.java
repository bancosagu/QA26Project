package calculator;

import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("Sum \n" + calculator.sum(12, 3));
        System.out.println(calculator.sum(1.22, 26.7));
        System.out.println(calculator.sum(223.4f, 44.1f, 3.5f));
        System.out.println(calculator.sum(1.2, 2.3, 3.4, 4.5)+ "\n");

        System.out.println("Substract \n"+ calculator.substract(12, 3));
        System.out.println(calculator.substract(3.22f, 26f));
        System.out.println(calculator.substract(223.4f, 44.1f)+ "\n");

        System.out.println("Multiply \n" + calculator.multiply(3, 5));
        System.out.println(calculator.multiply(12.2f, 3));
        System.out.println(calculator.multiply(12.2f,22.4f, 12.3f)+ "\n");

        System.out.println("Divide \n" + calculator.divide(15.6f, 3));
        System.out.println(calculator.divide(15, 3, 2));


        Lists lists = new Lists();

        List<Integer> listOne = lists.listOne(15);
        lists.printListOne(listOne, 1);











//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//
//        System.out.println(myList);
//
//        myList.add(0,10);
//        System.out.println(myList);
//        myList.add(15);
//        myList.add(15);
//        System.out.println(myList);
//
//        System.out.println(myList);




        }



    }

