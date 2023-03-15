package chapter12;


public class WrapperClassExample {

     public static void main(String[] args) {
        Integer a = 900;

        Integer b = new Integer(900);

        System.out.println(a.equals(b));
    }
}
