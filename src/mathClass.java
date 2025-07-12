public class mathClass {
    public static void main(String[] args) {

        //MATH METHODS
        System.out.println(Math.PI); //always available through math class ("Math".[insertarithmetic])
        System.out.println(Math.E); //euler's number

        double result;

        //result = Math.pow(2, 3); //power
        //result = Math.abs(-5); //absolute value, distance away from zero    
        //result = Math.sqrt(9);
        //result = Math.round(2.6); 
        //result = Math.ceil(2.1); //ALWAYS rounds up ("to the ceiling")
        //result = Math.floor(2.99); //ALWAYS rounds down ("to the floor")
        //result = Math.max(10, 20);
        result = Math.min(10, 20);
        System.out.println(result);
    }
}
