package chapter12;

import java.util.Scanner;

public class UserDemo {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User user = new User();
        user.name = "poxos";
        user.surname = "poxosyan";
        Language[] values = Language.values();
        System.out.println("please choose language from: ");
        for (Language value : values) {
            System.out.println(value);
        }
        String langStr = scanner.nextLine();
        try {
            user.language = Language.valueOf(langStr);
            System.out.println(user.language);
            System.out.println("You choose " + user.language.getCountry() + " country");
            System.out.println("Ordinal " + user.language.ordinal() );
        }catch (IllegalArgumentException e){
            System.out.println("Please choose correct language!");
        }
    }
}
