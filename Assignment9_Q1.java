//Write a program to use ArrayList to implement railway ticket booking operations

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment9_Q1 {
    public static void main(String[] args) {
        class RailwayTicketOp {
            ArrayList<String> A;
            int max;
            RailwayTicketOp(int max){
                this.A =new ArrayList<>() ;
                this.max=max;
            }
            void BookTicket(){
                if(this.A.size()>=this.max)
                {
                    System.out.println("no ticket available! " + '\n');
                }
                else{
                    System.out.print("Enter name of the candidate : ");
                    Scanner in=new Scanner(System.in);
                    String name=in.next();
                    A.add(name);
                    System.out.println("Ticket booked");
                }
            }
            void CancelTicket(){
                System.out.println("Enter Candidate name whose ticket you want to cancel :");
                Scanner sc=new Scanner(System.in);
                int index=-1;
                String name=sc.next();
                for(int j = 0; j<this.A.size(); j++){
                    String t= A.get(j);
                    if(name.equals(t)==true){
                        A.remove(j);
                        index=j;
                        break;
                    }
                }
                if(index==-1)
                    System.out.println("No data found \n please enter a valid name ");
                else
                    System.out.println("Ticket canceled");
            }
            void TicketLeft(){
                int lef=max- A.size();
                System.out.println("Ticket left : "+lef);
            }
            void DisplayTicket(){
                for(int i = 0; i<this.A.size(); i++){
                    System.out.println("Displaying Tickets : " + this.A.get(i));
                }
            }
        }

        System.out.print("Enter the number of ticket for booking : ");
        Scanner in=new Scanner(System.in);
        int max=in.nextInt();
        RailwayTicketOp r=new RailwayTicketOp(max);

        int choice=0;
        while(choice!=6){

            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Ticket Left");
            System.out.println("4. Display Ticket");
            System.out.println("5. Exit");
            System.out.println('\n'+"--Enter your choice--");
            choice=in.nextInt();
            switch(choice){
                case 1:
                    r.BookTicket();
                    break;
                case 2:
                    r.CancelTicket();
                    break;
                case 3:
                    r.TicketLeft();
                    break;
                case 4:
                    r.DisplayTicket();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid! Please enter valid choice!");

            }
        }
    }
}