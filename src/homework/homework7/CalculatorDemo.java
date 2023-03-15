package homework.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.plus(5, 6));
        System.out.println(calc.minus(6, 5));
        System.out.println(calc.multiply(5, 5));
        System.out.println(calc.divide(8, 0));
        System.out.println(calc.plus(50,50));
    }
}
