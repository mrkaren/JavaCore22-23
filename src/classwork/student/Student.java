package classwork.student;

public class Student {

    String name;
    String surname;
    int age;
    String phoneNumber;
    String email;
    String courseName;

    Student(String name, String surname, String phoneNumber, String courseName){
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.courseName = courseName;
    }

    Student(){

    }

    Student(String name, String surname, int age, String phoneNumber, String email, String courseName){
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.courseName = courseName;
        this.age = age;
        this.email = email;
    }



}
