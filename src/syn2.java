import java.util.Scanner;

public class syn2 {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    //scanner object

    System.out.print("Enter your name: ");
    String name = sc.nextLine(); //.next won't read anything after a space

    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    System.out.println("Your name is: " + name);
    System.out.println("Your age is: " + age);

    System.out.println("Are you a student? (True/False)");
    boolean isStudent = sc.nextBoolean();

    if (isStudent) {
        System.out.println("Enter your GPA: ");
        double GPA = sc.nextDouble();

        if (GPA < 50 || GPA > 100) {
            System.out.println("This GPA is invalid.");
        } else {
            System.out.println("Your grade of " + GPA + " has been taken note of. You may proceed to entrance A.");
        }

    } else {
        System.out.println("Hi " + name + "! You may proceed to Entrance B.");
    }

    sc.close();
    }
}
