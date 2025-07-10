import java.util.Scanner;

public class syn2 {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    //scanner object

    System.out.print("Enter your name: ");
    String name = sc.nextLine(); //.next won't read anything after a space
    
    System.out.println("Welcome, " + name);

    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    System.out.println("Your age of " + age + " has been taken note of.");

    sc.close();
    }
}
