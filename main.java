import  java.util.Scanner;
class MVC {
    public static void main(String[] args) {
        PenController penController = new PenController();
        int flag = 1;
        while (flag == 1) {
            System.out.println("-Menu-");
            System.out.println();
            System.out.println("1.Buy Pen ");
            System.out.println("2.Exit");
            System.out.println("Enter Choice :");
            int choice;
            Scanner mvc = new Scanner(System.in);
            choice = mvc.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("Enter number of pens you want to buy?");
                    int noOfPen = mvc.nextInt();

                    PenMVC pen = new PenMVC();
                    PenView penView = new PenView();
                    penController.setPen(pen);
                    penController.setPenView(penView);

                    penController.setPenName("Parker");
                    penController.setPenBrand("");
                    penController.setPenPrice(100);
                    penController.setPenColor("Blue");

                    int sold = penController.sellPen(noOfPen);
                    if (sold == -1) {

                        System.out.println("No of pen sold: " + noOfPen);
                        penController.updateView();

                        System.out.println("Here's your bill");
                        System.out.println(pen.getPrice() + " * " + noOfPen + " = ₹" + pen.getPrice() * noOfPen);
                        System.out.println();
                    } else {
                        System.out.println("Out of Stock");
                        System.out.println("Pen left in stock: " + sold);
                        System.out.println();
                    }

                    break;
                case 2:
                    flag = 0;
                    System.out.println("Thanks you ");
                    break;
                default:
                    System.out.println("Input not valid");
                    break;
            }

        }

    }
}
