import java.util.Random;

public class randomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int number;
        number = random.nextInt(1, 7);
        System.out.println(number);

        double number2;
        number2 = random.nextDouble(); // from 0 to 1, can still add origins and boundaries
        System.out.println(number2);

        boolean isHeads;
        isHeads = random.nextBoolean();
        if (isHeads) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}
