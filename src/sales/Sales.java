package sales;

import java.util.Scanner;

public class Sales {

    public static void main(String[] args) {
        int salesPeople;
        int sum, cutOffAmnt;
        int salePersAmnt = 0;
        double avg;
        int maxSale = Integer.MIN_VALUE;                    //Min/max value used as we do not know the minimum and maximum sales that can be done.
        int minSale = Integer.MAX_VALUE;
        int maxSaleIndex = -1;                              //indexed to -1 as who do know know the index of the minimum and maximum sales as yet
        int minSaleIndex = -1;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("How many Sales People would you like to check?:  ");
        salesPeople = scan.nextInt();
        int[] sales = new int[salesPeople];
        
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();

        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i = 0; i < sales.length; i++) {
            System.out.println(" " + (i + 1) + " " + sales[i]);
            sum += sales[i];
            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxSaleIndex = i + 1;
            }
            if (sales[i] < minSale) {
                minSale = sales[i];
                minSaleIndex = i + 1;
            }
        }
        System.out.println("\nTotal sales: " + sum);

        avg = (double) sum / salesPeople;                   //casting sum to a double for more precision.
        System.out.println("\nAverage Sales " + avg);

        System.out.println("Sales Person ID: " + maxSaleIndex + " Had the highest sales with the Amount of: " + maxSale);
        System.out.println("Sales Person ID: " + minSaleIndex + " Had the highest sales with the Amount of: " + minSale);

        System.out.print("Enter Cut off sales amount: ");
        cutOffAmnt = scan.nextInt();
        System.out.println("");

        for (int y = 0; y < sales.length; y++) {
            if (sales[y] > cutOffAmnt) {
                System.out.println("Sales Person: " + (y + 1) + " Exceeded the cut off amount and has a sales amount of: " + sales[y]);
                salePersAmnt++;
            }
            
        }
        System.out.println("Total amount of people who exceed the sales amount is " + salePersAmnt);
    }
}
