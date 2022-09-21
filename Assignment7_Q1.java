//2021PGCACA062 Assignment 7 Program 1

import static java.lang.Thread.sleep;

class AtoZ implements Runnable {
    Thread t;

    AtoZ() {
        t = new Thread(this, "Printing A to Z");
        t.start();
    }

    public void run() {
        try {
            for (char i = 'a'; i <= 'z'; i++)
                System.out.println(i);
            Thread.sleep(1000);

        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }

}

class Assignment7_Q1 {

    public static void main(String[] args) {

        new AtoZ(); // start threads

    }


}