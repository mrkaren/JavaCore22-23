package chapter5;

public class SwitchExample {

    public static void main(String[] args) {
        int n = 9;
        int a = 5;
        switch (n) {
            case 1:
                System.out.println("n-ն 1 է");
                break;
            case 2:
                System.out.println("n-ն 2 է");
                break;
            case 3:
                switch (a) {
                    case 1:
                        System.out.println("a-ն մեկ է");
                        break;
                    case 2:
                        System.out.println("a-ն 2 է");
                        break;
                    default:
                        System.out.println("a-ն ոչ մեկ է ոչ երկուս");
                }
                break;
            case 4:
                System.out.println("n -ը կամ 3 է կամ 4");
            case 7:
                System.out.println("n-ն 7 է");
                break;
            case 9:
                System.out.println("n-ը 9 է");
                break;
            default:
                System.out.println("n-ն ոչ 1 է ոչ 2 է ոչ 7");
                break;
        }
    }
}
