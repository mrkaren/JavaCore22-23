package homework.homework1;

public class IfForExample {

    public static void main(String[] args) {
        int a = 40;
        int b = 60;

        if (a > b) {
            System.out.println("max: " + a);
        } else {
            System.out.println("max: " + b);
        }

        if (a > b) {
            for (int i = b; i <= a; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        char c1 = (char) a;
        char c2 = (char) b;
        System.out.println(c1);
        System.out.println(c2);

        if (a == b) {
            System.out.println("ա-ն հավասար է բ-ին");
        } else {
            System.out.println("ա-ն հավասար Չէ բ-ին");

        }
    }

}
