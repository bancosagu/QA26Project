package calculator;


import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {

        int[] numbersAs16 = {3, 7, 4,};

        System.out.println("Minimum = " + numbersAs16[0]);
        System.out.println("Maximum = " + numbersAs16[numbersAs16.length - 1]);
    }

    public static int getMinAndMax(int[] numbersAs16) {
        Arrays.sort(numbersAs16);
        return numbersAs16[0] * numbersAs16[numbersAs16.length - 1];
    }
}