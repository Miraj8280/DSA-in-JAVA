import java.util.Scanner;

public class Lecture02{
    public static void main(String arg[]) {

        /* -----------------------------------------------------------------
                                Output in Java
        -------------------------------------------------------------------- */

        /* 
        System.out.print("Miraj Asraf");
        System.out.print("Khusbu Begam");
        */

        // print all line by line - line breaks in java

        // method - 1 : use println
        /* 
        System.out.println("Miraj Asraf");
        System.out.print("Khusbu Begam");
        */

        // method - 2 : use "\n"
        /* 
        System.out.print("Miraj Asraf \n");
        System.out.print("Khusbu Begam");
        */


        // print the given pattern
        /*

         * 
         * *
         * * *
         * * * *
         
        */
        /* 
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        */
        // OR

        /* System.out.println("*\n* *\n* * *\n* * * *"); */



        /* -----------------------------------------------------------------
                                Variables in Java
        -------------------------------------------------------------------- */
        /*
        int a = 20;
        int b = 30;
        String name = "Miraj Asraf";

        // a, b, str are variables, we can change them
        a = 40;
        b = 50;
        name = "Khusbu Begam";
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        */

        // Find perimeter of a triangle 
            // 1) Equilateral Triangle => length of all sides 'a'
                // Formula : Perimeter, P = 3 * a
                /* 
                int a = 20;
                System.out.println("Perimeter of Equilateral Triangle = " + (3 * a));
                */
            // 2) Isosceles  Triangle => length of sides are 'a', 'a' and 'b'
                // Formula : Perimeter, P = 2 * a + b
                /* 
                a = 10;
                int b = 20;
                System.out.println("Perimeter of Isosceles  Triangle = " + (2 * a + b));
                */
            
            // 2) Scalene  Triangle => length of sides are 'a', 'b' and 'c'
                // Formula : Perimeter, P = a + b + c
                /* 
                a = 10;
                b = 20;
                int c = 30;
                System.out.println("Perimeter of Scalene  Triangle = " + (a + b + c));
                */





        /* -----------------------------------------------------------------
                                Data types in Java
        -------------------------------------------------------------------- */
        // Primitive Data types
            /*
             i) byte ----   1 byte
             ii) short ---  1 byte
             iii) boolean - 1 byte
             iv) char ---   2 bytes
             v) int -----   4 bytes
             vi) float ---  4 bytes
             vii) long ---  8 bytes
             viii) double - 8 bytes

             1 byte = 8 bits
             */

        // Non-primitive Data types
            /*
             i) Array
             ii) String
             iii) Class
             iv) Object
             v) Interface
             */


    
             
        /* -----------------------------------------------------------------
                                Input in Java
        -------------------------------------------------------------------- */
        // java.util.Scanner is imported on the top of the code

        // Create a scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input of a String
            // Method - 1 : Using next()
                /*
                String name = sc.next();
                // it will take a string before the space
                // eg, for name = "Miraj Asraf", it will take only "Miraj".
                System.out.println(name);
                */

            // Method - 2 : Using nextLine()
                /*
                String fullName = sc.nextLine();
                // it will take the whole string as Input.
                // eg, for fullName = "Khusbu Begam", it will take the whole string "Khusbu Begam".
                System.out.println(fullName);
                */

        
        // Taking input of an Integer : nextInt()
            /*
            int rollNumber = sc.nextInt();
            System.out.println(rollNumber);
            */

        // Taking input of an Decimal Number : nextFloat()
            /*
            float marks = sc.nextFloat();
            System.out.println(marks);
             */
        
        // Input for some other data types :
            // nextDouble()
            // nextLong();
            // nextBoolean();


        // Take two numbers as input, and print their sum :
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(x + y);

    }
}
