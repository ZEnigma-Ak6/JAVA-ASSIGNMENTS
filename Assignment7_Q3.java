//2021PGCACA062 Assignment 7 Program 3

class Inventory {

    int Stock_value;

    Inventory() {
        Stock_value = 0;
    }

    synchronized void Stock_Add() {
        if (Stock_value > 20) {
            System.out.println("Overflow");
        }
        System.out.println("Stock Added, Updated stock:" + (Stock_value++));
    }

    synchronized void StockRemove() {
        if (Stock_value < 0) {
            System.out.println("Underflow");
        }
        System.out.println("Stock Remove, Updated stock: " + (--Stock_value));
    }
}

class Add implements Runnable {
    Thread t;
    int n;
    String str;
    Inventory inventory;

    Add(int n, Inventory inventory) {
        t = new Thread(this, "Add thread");
        this.n = n;
        this.inventory = inventory;
        t.start();
    }

    @Override
    public void run() {

        for (int i = 0; i < n; i++) {
            inventory.Stock_Add();
        }

    }
}

class Remove implements Runnable {
    Thread t;
    int n;
    String s;
    Inventory inventory;

    Remove(int n, Inventory inventory) {
        t = new Thread(this, "Remove thread");
        this.n = n;
        this.inventory = inventory;
        t.start();
    }

    @Override
    public void run() {

        for (int i = 0; i < n; i++) {
            inventory.StockRemove();
        }

    }
}

class Assignment7_Q3 {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        new Add(20, inventory);
        new Remove(20, inventory);

    }

}
