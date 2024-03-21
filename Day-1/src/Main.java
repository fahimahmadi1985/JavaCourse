import java.util.ArrayList;


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



        // if statement
        if(20 > 10){
            System.out.println("20 is greater than 10");
        } else{
            System.out.println("10 is greater than 20");
        }

        // truthy values in java
        int     number = 10;
        String  text = "hello";
        Object[] array = new Object[1];
        Object nullObj = null;
        if(true){
            System.out.println("if block executed");
        }else {
            System.out.println("else block executed");
        }

        // ternary operator
        // a shortcut to assign one of two values to a variable, depending on a given condition.
        int max = (10 > 20) ? 10 : 20;
        System.out.println("max is: "+ max);

        // invoke a method
        greeting("fahim");
        System.out.println("average 4,2 is: "+ calculate(4,2));
        int[] evenNums = getEvenNumbers(5);
        System.out.println("even numbers started from 5: "+ java.util.Arrays.toString(evenNums));


        //instance of another class
        Car myCar = new Car("BMW", "Black", 0);
        myCar.accelerate();
        myCar.accelerate();
        myCar.addOwner("fahim");
        myCar.addOwner("daniel");
        System.out.println(String.join(", ", myCar.owners));

        displayHighScorePosition("fahim", 3);
        System.out.println(calculateHighScorePosition(1620));

        // use a class from another file in the same directory
        Bike bike = new Bike("Honda");
        System.out.println("brand of the bike is: "+ bike.getBrand());

    }

    // define a custom method.
    // remember about datatype of return value, parameters
    public static void greeting(String name){
        System.out.println("Hello "+ name);
    }

    public static int calculate(double a, double b){
        return (int) ((a + b) / 2);
    }

    // define a method contains loops and ternary
    public static int[] getEvenNumbers(int min){
        int[] evenNumbers = new int[10];
        int nextEven = min%2 == 0 ? min + 2: min + 1;
        for(int i= 0; i< 10; i++){
            evenNumbers[i] = nextEven;
            nextEven += 2;
        }

        return evenNumbers;
    }

    //method challenge 1
    public static void displayHighScorePosition(String name, int positionInHighScoreList){
        System.out.println(name + " managed to get into position "+ positionInHighScoreList + " in the high score list.");
    }

    //method challenge 2
    public static byte calculateHighScorePosition(int playersScore){
        if(playersScore >= 1000)
            return 1;

        if(500 < playersScore && playersScore <= 1000)
            return 2;

        if(100 <= playersScore && playersScore <= 500)
            return 3;

        return 4;

    }

}

// definition of class Car
class Car{
    String brand = "";
    String color = "";
    int curSpeed = 0;
    ArrayList<String> owners = new ArrayList<String>();

    public Car(String brand, String color, int curSpeed){
        this.brand = brand;
        this.color = color;
        this.curSpeed = curSpeed;
    }

    public void printCarBrand(){
        System.out.println("Car brand is: "+ this.brand);
    }

    public String getColor(){
        return this.color;
    }

    public void accelerate(){
        this.curSpeed += 10;
        System.out.println("the current speed is: "+ this.curSpeed);
    }

    public void addOwner(String newOwner){
        this.owners.add(newOwner);
        System.out.println(owners.toString());
    }
}