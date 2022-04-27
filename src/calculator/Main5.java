package calculator;

public class Main5 {

    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();
        int[] myArray = op.populateArrayToNumber(5);

        op.printArray(myArray);

//        int[] testArray = {12,3,6765,123,6,856};
//        int sum = myArray[0];
//        sum = sum + myArray[1];
//        sum = sum + myArray[2];
//        sum = sum + myArray[3];
//        sum = sum + myArray[4];
//
//        System.out.println(op.getAverageFromArray(myArray));
//        System.out.println(op.getAverageFromArray(testArray));

        // ex2
        int[] arrayToOneHundreed = new int[100];
        op.ex2PopulateArrayToOneHundreed(arrayToOneHundreed);
        op.printArray(arrayToOneHundreed);


        // ex3
        int[] evenArray = new int[50];
        op.ex3PopulateArrayEvenNumber(evenArray);
        op.printArray(evenArray);
        System.out.println();


        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 0; i<arr.length; i++)
            System.out.println("Element at index " + i + " : " + arr[i]);
    }




}
