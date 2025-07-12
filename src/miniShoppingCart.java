import java.util.Scanner;

public class miniShoppingCart {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';

        System.out.print("What item would you like to buy: ");
        item = sc.nextLine();

        System.out.print("How much does it cost: ");
        price = sc.nextDouble();

        System.out.print("How many would you like to buy: ");
        quantity = sc.nextInt();

        double total = calc(price, quantity);
        System.out.println("You have bought " + quantity + " " + item + "/s");
        System.out.println("That will cost you " + currency + total); //could also directly put calc(price, quantity) instead of using total variable

    sc.close();

    }
    
    static double calc (double price, int quantity ) {
        double result = price*quantity;
        return result;
    }
}
