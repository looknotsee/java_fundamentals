import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        // if statement - peforms a block of code if condition is true
    int age;
    String name;
    boolean isStudent;
        
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        nameCheck(name);

//MAKE METHOD
        System.out.print("Enter your age: ");
        age = sc.nextInt(); 
        ageCheck(age);

        System.out.println("Are you a student? (False/True)");
        isStudent = sc.nextBoolean();

        if (isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }

        
    sc.close();
    }

    static void nameCheck (String name) {
        if(name.isEmpty()) { //isEmpty a STRING METHOD
            System.out.println("You did not enter your name.");
        } else {
            System.out.println("Hello " + name + "!");
        }
    }

    static void ageCheck (int age) {
        if (age >= 65) {
            System.out.println("You are a senior.");
        // or use two comparisons to define a range
        } else if (age >= 18) {
            System.out.println("You are an adult.");

        } else if (age < 0) {
            System.out.println("You haven't been born yet!");

        } else if (age == 0) { //when making a comparison, use double =, as single = makes java think you are trying to assign a variable
            System.out.println("You are a fetus.");

        } else { //else clause serves as like a default
            System.out.println("You are a child.");
        }
        //use a case switch in an actual scenario
        
    }
}
