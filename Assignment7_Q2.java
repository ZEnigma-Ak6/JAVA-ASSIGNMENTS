//2021PGCACA062 Assignment 7 Program 2

class print implements Runnable {

    Thread t;
    int n;
    String str;

    print(int priority, int n) {
        t = new Thread(this, "Print Thread " + n);
        t.setPriority(priority);
        t.start();

        this.n = n;

    }

    @Override
    public void run() {

        for (int i = 1; i <= n; i++)
            System.out.println(t.getName() + " " + i);

    }
}

public class Assignment7_Q2
{

    public static void main(String[] args) {
        new print(5, 100);
        new print(10, 50);
    }

}
