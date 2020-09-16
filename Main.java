import java.util.Scanner;

/**
 * Calculates subtotal, total, and taxes for the 
 * purchase of chromebook charges, motherboards, 
 * and mice
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // asks user for amount of chromebook chargers
    System.out.println("How many chromebook chargers?");

    // Declare and initialize amout of chromebook chargers
    int chrome = input.nextInt();

    // asks user for amount of motherboards
    System.out.println("How many motherboards?");

    // Declare and initialize amount of motherboards
    int moth = input.nextInt();

    // asks user for amount of mice
    System.out.println("How many mice?");

    // Declare and initialize amount of mice
    int mice = input.nextInt();

    // Declare and initialize price for chromebook chargers
    final double chromePrice = 34.99;

    //Declare and initialize price for motherboards
    final double mothPrice = 127.5;

    //Declare and initialize price for mothPrice
    final double micePrice = 18.0;

    // Declare and initialize price add on for tax
    final double tax = 0.13;

    // total chromebook charger price
    double chromeTot = chrome * chromePrice;

    // total motherboard price
    double mothTot = moth * mothPrice;

    //total mice price
    double miceTot = mice * micePrice;

    // chromebook charger tax
    double chromeTax = chromeTot * tax;

    // motherboard tax
    double mothTax = mothTot * tax;

    // mice tax
    double miceTax = miceTot * tax;

    // calculates subtotal
    double sub = chromeTot + mothTot + miceTot;

    // calculates taxes
    double taxTot = chromeTax + mothTax + miceTax;

    //calculates total
    double total = chromeTot + chromeTax + mothTot + mothTax + miceTot + miceTax;

    // Displays subtotal to user
    System.out.println("Sutotal = $" + sub);

    // Displays total tax to user
    System.out.println("Taxes = $" + taxTot);

    // Displays total cost to user
    System.out.println("Total = $" + total);
    
    
  }
}
