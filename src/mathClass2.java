import java.util.Scanner;

public class mathClass2 {
    public static void main(String[] args) {
        //FINDING HYPOTENUSE
        
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Enter the length of side a: ");
        a = sc.nextDouble();

        System.out.print("Enter the length of side b: ");
        b = sc.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
        System.out.println(c);

        sc.close();
    }
}
