/*------------------------------------------------------------------------------
                            DSA in JAVA
                                -by-
                            Miraj Asraf
--------------------------------------------------------------------------------*/

// Conditional Statements


import java.util.*;

public class Lecture03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        int age = sc.nextInt();

        if(age > 18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Not Adult");
        }
        */

        // check odd - even
        /* 
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        */

        // compare two numbers
        /* 
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b) {
            System.out.println("Equal");
        }
        else if(a > b) {
            System.out.println(a + " is greater");
        }
        else {
            System.out.println(a + " is lesser");
        }
        */

        // Say the number => one, two or three
        /*
        int num = sc.nextInt();
        
        if(num == 1) {
            System.out.println("One");
        }
        else if(num == 2) {
            System.out.println("Two");
        }
        else if(num == 3){
            System.out.println("Three");
        }
        else {
            System.out.println("Invalid number");
        }
        */
            // OR
        // using switch case statement

        /*
        int num = sc.nextInt();

        switch (num) {
            case 1 :
                System.out.println("One");
                break;

            case 2 :
                System.out.println("Two");
                break;

            case 3 :
                System.out.println("Three");
                break;

            default: 
                System.out.println("Invalid number");
        }
        */

        // make a calculator
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);

        // Scanner class in Java supports nextInt(), nextLong(), nextDouble() etc. But there is no nextChar() 
        // To read a char, we use next().charAt(0). next() function returns the next token/word in the input as a string and charAt(0) function returns the first character in that string.

        switch(operator) {
            case '+' :
                System.out.println(a + b);
                break;
            
            case '-' :
                System.out.println(a - b);
                break;
            
            case '*' :
                System.out.println(a * b);
                break;
            
            case '/' :
                if(b == 0) {
                    System.out.println("Invalid division");
                }
                else {
                    System.out.println(a / b);
                }
                break;
            
            case '%' :
                if(b == 0) {
                    System.out.println("invalid division");
                }
                else {
                    System.out.println(a % b);
                }
                break;
            
            default :
                System.out.println("Invalid operator");
        }
    }
}
