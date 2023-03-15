package homework.homework6;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        int[] array = {6, 34, 21, 77, 88, 35};
        ArrayUtil au = new ArrayUtil();
        int x = au.maxOfArray(array);

        System.out.println("Max: " + x);
        System.out.println("Max * 2 = " + x * 2);
        System.out.println(x % 2 == 0 ? "Զույգ" : "Կենտ է");
    }

}
