package homework.bracechecker;

public class Stack {

    private int[] array = new int[10];
    private int tos;

    public Stack() {
        tos = -1;
    }

    public void push(int item) {
        if (tos == 9) {
            System.out.println("Ստեկում տեղ չկա");
        } else {
            array[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            return 0;
        }
        return array[tos--];
    }

    public boolean isEmpty() {
        return tos == -1;
    }
}
