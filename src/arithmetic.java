public class arithmetic {
    public static void main (String[] args) {

        int x = 12;
        int y = 4;
        int z;

        //z = x + y;
        //z = x - y;
        //z = x * y;
        //z = x / y;
        z = x % y; //modulo; gives remainder of any division
        System.out.println(z);

        //Augmented Assignment Operators
        int a = 20;
        int b = 2;

        //a = a + b is the same AS- a
        a += b; //add then assign, research difference of += and =+
        /*
        a -= b;
        a *= b;
        a /= b;
        a %= b;
         */
        System.out.println(a);


        //Increment and Decrement Operators
        int e = 1;
        int f = 1;

        e++; //increment by one
        f--; //decrement by one


        //Order of Operations [P-E-M-D-A-S]
        double result = 3 + 4 * (7-5) / 2.0;
        System.out.println(result);
    }
}
