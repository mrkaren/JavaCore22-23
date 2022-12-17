package group1.chapter3;

public class ArrayExample {

    public static void main(String[] args) {
        double[] array = {6, 7, 8, 9};
        for (int i = 0; i < 4; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int[] myArray = new int[10];
        //add numbers to array
        for (int i = 0; i < 10; i++) {
            myArray[i] = i + 1;
        }
        //print numbers from array
        for (int i = 0; i < 10; i++) {
            System.out.println(myArray[i]);
        }
    }
}
