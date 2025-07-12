public class printf {
    public static void main(String[] args) {
        
        //printf() = is a method used to format output
        
        /*  %[flags][width][.precision][specifier-character] 
            -> how to use precision in printf2 class  */

        //percent sign(placeholder), then follow with a specificer character depending on data type 

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;


        System.out.printf("Hello %s\n", name);
        /*to insert a string, use lowercase s (a specifier character) after placeholder % 
            -> then use a comma to separate any variables we are inserting
        */
        System.out.printf("Your name starts with an %c\n", firstLetter);
        //use c for char datatype

        System.out.printf("You are %d years old\n", age);
        //use d for int datatype

        System.out.printf("Your height is %.1f cm\n", height);
        //use f for double datatype (f for floating point number), .1 to set a precision 

        System.out.printf("Employed: %b\n", isEmployed);
        //use b for boolean

        System.out.printf("%s is %d years old", name, age);
        //for multiple variable inserts, just put multiple placeholders then comma-separate variables in order 
    }
}
