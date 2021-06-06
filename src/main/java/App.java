//UCF COP3330 Summer 2021 Assignment 10 Solution
// *  Copyright 2021 Igli Spaho

//Working with multiple inputs and currency can introduce some tricky precision issues.
//
//Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.
//
//Example Output
//Enter the price of item 1: 25
//Enter the quantity of item 1: 2
//Enter the price of item 2: 10
//Enter the quantity of item 2: 1
//Enter the price of item 3: 4
//Enter the quantity of item 3: 1
//Subtotal: $64.00
//Tax: $3.52
//Total: $67.52
//Constraints

//Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building, and then print out the output.
//Be sure you explicitly convert input to numerical data before doing any calculations.




import java.util.Scanner;
public class App {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of item 1:");
        Double item1 = in.nextDouble();

        System.out.print("Enter the quantity of item 1:");
        Integer quantity1 = in.nextInt();

        System.out.print("Enter the price of item 2:");
        Double item2 = in.nextDouble();

        System.out.print("Enter the quantity of item 2:");
        Integer quantity2 = in.nextInt();

        System.out.print("Enter the price of item 3:");
        Double item3 = in.nextDouble();

        System.out.print("Enter the quantity of item 3:");
        Integer quantity3 = in.nextInt();

        double subtotal = item1*quantity1+item2*quantity2+item3*quantity3;
        System.out.println("Subtotal: "  +  subtotal);

        double tax =  subtotal*0.055;
        System.out.println("Tax: "+ tax);

        double total = subtotal+tax;
        System.out.println("Total " + total);
    }
}
