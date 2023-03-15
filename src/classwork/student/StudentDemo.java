package classwork.student;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input student's name");
        String name = scanner.nextLine();
        System.out.println("Please input student's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input student's phone number");

        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student's course name");

        String course = scanner.nextLine();

        Student student = new Student(name, surname, phoneNumber, course);

        System.out.println("Student " + student.name +" registered!");
    }
}
