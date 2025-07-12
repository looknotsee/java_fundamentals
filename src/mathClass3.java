import java.util.Scanner;

public class mathClass3 {
    public static void main(String[] args) {
        //Circumference = 2 * Math.PI * radius;
        //area = Math.PI * Math.pow(radius, 2);
        //volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        Scanner sc = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();

        circumference = 2 * Math.PI * radius; 
        area = Math.PI * Math.pow(radius, 2);
        volume = (4/3) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.1fcm\n", circumference); //using printf.1 to display only one digit
        System.out.printf(area + "cm²"); //alt0178
        System.out.println(volume + "cm³"); // alt0179

    }
}
