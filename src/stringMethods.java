public class stringMethods {
    public static void main(String[] args) {
        
        String name = "Password";

        //int length = name.length(); 
        //char letter = name.charAt(0); //returns a character at a given index in a string
        //int index = name.indexOf("a"); //finds & returns the FIRST index of a given character (if it exists, returns -1 if not)
        //int lastIndex = name.lastIndexOf("a"); //finds & returns the LAST index of a given character

        //name = name.toUpperCase(); 
        //name = name.toLowerCase();

        //name = name.trim(); //removes whitespace before and after a string 
        //name = name.replace("a", "o"); //replace a target char in a string 

        //name.isEmpty(); //returns boolean true or false, can be directly printed and usually used in if statements


        /*
        if(name.contains(" ")) { //.contains checks if >char< exists in string
            System.out.println('"' + name + '"' + " contains spaces.");
        } else {
            System.out.println('"' + name + '"' + " does not contain spaces.");
        }
        */

        if (name.equalsIgnoreCase("password")) { //.equals can be put as .equalsIgnoreCase to ignore cases
            System.out.println("Your name can't be password.");
        } else {
            System.out.println("Hello " + name);
        }

    }
}
