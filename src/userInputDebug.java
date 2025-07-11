import java.util.Scanner;

public class userInputDebug {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in); 

    System.out.println("Enter your age: ");
    int age = sc.nextInt(); //accepting integer
    sc.nextLine(); //to get rid of extra newline character

    System.out.println("Enter your name: ");
    String name = sc.nextLine(); //accepting string of text

    System.out.println("You are " + name + ", a " + age + " year old person.");
    
    sc.close();
    }
}