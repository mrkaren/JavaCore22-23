package chapter6.stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(4);
        myStack.push(7);
        myStack.push(88);
        myStack.push(83);
        myStack.push(83);
        myStack.push(83);
        myStack.push(83);
        myStack.push(83);
        myStack.push(77);
        myStack.push(22);
        myStack.push(44);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        System.out.println(myStack.pop());

    }
}
