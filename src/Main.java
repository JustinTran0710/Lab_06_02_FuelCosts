import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Declarations
        double gas = 0;
        double mpg = 0;
        double price = 0;
        double distance = 0;
        double cost = 0;
        String trash ="";

        System.out.println("How many gallons in your tank?");
        if (in.hasNextDouble() )
        {
            gas = in.nextDouble();
            in.nextLine();

        }
        else
        {
            trash = in.nextLine();
            System.out.println("Your Input is Invalid, Try again.");
            System.exit(0);
        }
        System.out.println("How many Miles a Gallon?");

        if (in.hasNextDouble())
        {
            mpg = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Your input is invalid, Try again.");
            System.exit(0);
        }
        System.out.println("How much per gallon?");

        if (in.hasNextDouble())
        {
            price = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Your Input is invalid, Try again.");
            System.exit(0);
        }

       distance = mpg * gas;
       cost = (100/mpg) * price;

       System.out.printf("Every 100 miles it will cost you $%.2f",cost);
       System.out.printf("\nThe Distance the car can travel is%8.2f miles",distance);


    }

}