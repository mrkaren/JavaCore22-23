package homework.homework1;

public class FigurePainter {

    void figureOne(int n, char c, boolean isNewLine) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        if (isNewLine) {
            System.out.println();
        }
    }

    void figureTwo(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void figureThree() {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
