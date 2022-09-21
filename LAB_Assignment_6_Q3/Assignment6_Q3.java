package LAB_Assignment_6_Q3;

public class Assignment6_Q3 {
    public static void main(String[] args) {

        MyStack myStack = new MyStack();
        myStack.add(50);
        myStack.add(60);
        myStack.displayElement();
        System.out.println("Pop: " + myStack.remove());

        MyQueue myQueue = new MyQueue();
        myQueue.add(50);
        myQueue.add(60);
        myQueue.displayElement();
        System.out.println("Pop: " + myQueue.remove());

    }
}
