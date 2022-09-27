//2021PGCACA062 Assignment 9 Question 3

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Assignment9_Q3 {

    //Use arraylist to store the cards and hashmap to store the player details.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> loginMap = new HashMap<String, String>();


        ArrayList<Integer> cards = new ArrayList<Integer>();
        Random random = new Random();
        int card1 = random.nextInt(11);
        int card2 = random.nextInt(11);
        int total = card1 + card2;
        System.out.print("First cards: " + card1 + ", " + card2 + "\n");
        System.out.print("Total: " + total + "\n");
        if (total == 22) total = 12;
        boolean loop = true;

        while (loop) {
            if (total >= 21) {
                if(total == 21) System.out.println("Winner");
                else System.out.println("Your score more than 21 so you lose\n");
                break;
            }
            System.out.println("Total: " + total);
            System.out.print("Do you want another card?(y/n): ");
            String input = sc.next();
            char reDo = input.charAt(0);
            if (reDo == 'y' || reDo == 'Y') {
                int card = random.nextInt(11);
                total += card;
                System.out.print("Card: " + card + "\n");
                // System.out.print("Total: " + total1 + "\n");
            }
            else if (reDo == 'n' || reDo == 'N') {
                loop = false;
            }
        }
    }
}

