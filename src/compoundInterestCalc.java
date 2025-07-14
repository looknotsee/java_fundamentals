import java.util.Scanner;

public class compoundInterestCalc {
    public static void main(String[] args) {
        //Compound Interest Calculator

        Scanner sc = new Scanner(System.in);

        double principal; //principal amount: original investment
        double rate; //interest rate
        int timesCompound; //how often does our interest compound; yearly(1), quarterly(4), monthly(12)
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter the interest rate (in % form): ");
        rate = sc.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompound = sc.nextInt();

        System.out.print("Enter the number of years: ");
        years = sc.nextInt();

        amount = principal * Math.pow((1 + (rate/timesCompound)), (timesCompound*years));

        System.out.printf("The amount after %d is $%.2f", years, amount);

        /*
         example data:
         10000 dollars
         3% interest rate
         1 (yearly)
         1 (year)
         output: $10300.0
         */

        sc.close();
    }
}
