import java.util.Scanner;

public class miniShoppingCart {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String item;
        double price;
        int quantity;

        System.out.print("What item would you like to buy: ");
        item = sc.nextLine();

        System.out.print("How much does it cost: ");
        price = sc.nextDouble();

        System.out.print("How many would you like to buy: ");
        quantity = sc.nextInt();

        //double total = 
        System.out.println("You have bought " + quantity + " " + item + "/s");
        System.out.println("That will cost you $" + calc(price, quantity));

    }

    static double calc (double price, int quantity ) {
        double result = price*quantity;
        return result;
    }
}
