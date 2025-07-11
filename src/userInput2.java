import java.util.Scanner;

public class userInput2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        double width = 0;
        double height = 0;
        double area = 0;

    System.out.println("Enter the width: ");
    width = sc.nextDouble();


    System.out.println("Enter the length: ");
    height = sc.nextDouble();

    area = width * height;

    System.out.println("The area is " + area + "cm²"); //tip: to get superscript 2, (onwindows) nmlk ON, alt + 0178


    }
}