public class printf2 {
    public static void main (String[] args) {
        
        //[.precision]
        //.(number) will determine how many digits can be seen

        /* 
        double price1 = 9000.99;
        double price2 = 1000000.15;
        double price3 = -54.01;

        System.out.printf("%(+,.1f\n", price1);
        System.out.printf("%(+,.2f\n", price2);
        System.out.printf("%(+.3f\n", price3);
        */

        // [flags]

        // + = output a plus for any POSITIVE numbers
        // , = comma grouping separator for any thousandth place
        // ( = negative numbers are enclosed in ()
        //space = display a minus if negative, space if positive  (good for aligning numbers)



        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        System.out.println();

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

        // [width]

        // 0 = zero padding -> follow placeholder with zero, then the amount of digits to zero-pad
        // number only = right justified padding
        // negative number = left justified padding

        
    }
}
