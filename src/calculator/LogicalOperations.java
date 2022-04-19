package calculator;


public class LogicalOperations {

    public static void main(String[] args) {
    }


    public void forExerciseOne(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void forExerciseTwo(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void forExerciseThree(int biggest, int smallest) {
        for (int i = biggest; i >= smallest; i--) {
            System.out.println(i);
        }
    }

    //ex4

    public void forExerciseFive() {
        int numberXFive = 100;
        for (int i = 1; i <= numberXFive; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void forExerciseSix() {
        int numberXSix = 100;
        for (int i = 1; i <= numberXSix; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public void forExerciseSeven(int from, int to){
        int sum = 0;
        for (int i = from; i <= to; i++){
            sum = i + sum;
        }
        System.out.println("The sum is: " + sum);
    }


    public void forExerciseEight(int from, int to){
        int sum = 0;
        for(int i = from; i <= to; i++){
            sum = i + sum;
        }
    System.out.println("The average is: " + sum / (to - from + 1f));
    }


    public void forExerciseNine() {
        int i, j, row = 7;
        for (i = row-1; i >=0; i--) {
            for (j = 0; j <= i; j++) {
                System.out.print("* " + "");
            }
            System.out.println();
        }


    }

    public int[] populateArrayToNumber(int max){
        int[] myArray = new int[max];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i + 1;
        }
        return myArray;
    }

    public void printArray(int[] array){
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i]+", ");
        }
    }

    public double sumOfArray(int[] array){
        float sumArray = array[0];
        for (int i = 1; i < array.length; i++){
            sumArray = sumArray + array[i];
        }
        return sumArray;
    }

    public double getAverageFromArray(int[] array){
        return sumOfArray(array)/array.length;
    }



//    public int populateArrayWithEvenNumbers(int[] evenArray){
//        int pos = 0;
//        for (int i = 0; i <=100; i++){
//            if(i%2==0){
//                evenArray[pos] = i;
//                System.out.println(evenArray[i]);
//            }
//            pos++;
//
//        }
//        return evenArray;
//    }


}