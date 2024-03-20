import java.sql.SQLOutput;

public class Main{
    public static void main(String args[]){
        System.out.println("hello world java!!");

        //expressions
        int result = (4+2)*3;
        double output = (4+2)+(4-2);
        System.out.println("result: "+result + "output: "+output);


        //primitive types
        /**
         *
         * whole numbers: byte  short   int  long
         * real numbers:  float     double
         * single char:   char
         * boolean:       boolean
         *
         * */

        byte    a = 102;   // 8-bit signed integer, min -128 max 127
        short   b = 1000;  // 16-bit -32,768 to 32767
        int     c = 5;     // 32-bit  -2^31 to 2^31-1
        long    d = 100L;   // 64-bit  -2^63 to 2^63-1

        System.out.println(a + b + c + d);


        float   e = Float.MIN_VALUE;    // 32-bit ±3.4082347E+38F (approximately 6-7 digits)
        double  f = Double.MAX_VALUE;   // 64-bit ±1.7976931348623157E+308 (approximately 6-7 digits)
        System.out.println("e: "+e + " f: "+f);


        char    g = 'G';    // 16-bit Unicode character
        System.out.println("character g: "+g);

        boolean isLoggedIn = true;  // 1-bit    true and false


        // Examples
        System.out.println("epxression: " + (a+b+c+d-f-e/c));

        // multiple variable in one statement
        byte x = 10, y = 100;
        System.out.println("x: "+x + " y: "+y);


        // casting
        int calculate = (int)(10/3); // cast the result of 10/3 to integer
        System.out.println("calculate: "+calculate);

        // floating point precision and a challenge
        int myIntValue = 5 / 2;          // output 2
        float myFloatValue = 5f / 3f;    // output: 2.5
        double myDoubleValue = 5d / 3d;   // output: 2.5
        System.out.println("myIntValue: "+myIntValue + " myFloatValue: "+myFloatValue + " myDoubleValue: "+myDoubleValue);


        // Java built-in classes
        /**
         *
         * Wrappers ( Boolean, Byte, Character, etc.)
         * BigDecimal
         * String
         *
         * */

        //String
        String name = "fahim";
        String salary = "\u002430,000";
        System.out.println("my salary is: "+ salary);
        System.out.println("hello "+ name);

        String num1 = "10";
        String num2 = "25.3";
        String total = num1 + num2; // concatenate strings contains digits
        System.out.println("Total: " + total);

        int num3 = 23;
        num1= num1 + num3; //concatenate number and string digits
        System.out.println("total2: "+ num1);


        // Operators and operands and expressions
        char l1 = 'a';
        char l2 = 'b';
        System.out.println("l1 + l2: "+ (l1+l2)); // add unicode of characters output: l1 + l2: 195
        System.out.println("l1 + l2: "+ l1+l2);   // concatenate characters with first string output: l1 + l2: ab


        // shorthands
        int z = 10;
        z += 5;     // shorhand format for z = z + 5;
        System.out.println("z: "+ z);

    }
}