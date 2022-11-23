
/*-----------------------------------------------------------------
                        DSA in JAVA
                            -by-
                        Miraj Asraf
------------------------------------------------------------------*/

// Functions in Java

import java.util.Scanner;

public class Lecture07 {

    /*--------------------------------------------------------
                    Print Your Name
     ---------------------------------------------------------*/
    public static void printMyName(String name) {

        System.out.println(name);
    }

    /*--------------------------------------------------------
                    Add Two Numbers
     ---------------------------------------------------------*/
    public static int addTwoNum(int a, int b) {

        return (a + b);
    }

    /*--------------------------------------------------------
                    Factorial of a Number
     ---------------------------------------------------------*/
    // n! = n * (n - 1) * (n - 2) * ...* 3 * 2 * 1
    // 5! = 5 * 4 * 3 * 2 * 1 = 120
    public static int factorial(int n) {

        int ans = 1;

        for (int i = n; i >= 1; --i) {

            ans = ans * i;
        }

        return ans;
    }

    /*--------------------------------------------------------
                    Check if a Number is Prime or Not
     ---------------------------------------------------------*/
    /*
     -> A prime number is a natural number greater than 1, which is only divisible by 1 and itself.
     
     -> Except for 2, which is the smallest prime number and the only even prime number, all prime numbers are odd numbers.
     
     -> Every prime number can be represented in form of (6n + 1) or (6n – 1) except the prime numbers 2 and 3, where n is a natural number.
     
     -> Two and Three are only two consecutive natural numbers that are prime.
     */
    public static boolean isPrime(int n) {

        if (n <= 1) {

            return false;
        }

        if (n == 2 || n == 3) {

            return true;
        }

        if(n % 2 == 0 || n % 3 == 0) {

            return false;
        }

        for(int i = 5; i <= Math.sqrt(n); i += 6) {

            if(n % i == 0 || n % (i + 2) == 0) {

                return false;
            }
        }

        return true;
    }


    /*--------------------------------------------------------
            Write a program to enter the numbers till 
            the user wants and at the end it should display 
            the count of positive, negative and zeros entered
     ---------------------------------------------------------*/
        public static void countEnteredNum() {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter no. of numbers you want to enter : ");
            int t = sc.nextInt();

            
            int countPositive = 0;
            int countNegative = 0;
            int countZeroes = 0;

            System.out.println("Enter your numbers : ");

            while(t > 0) {
                int num = sc.nextInt();

                if(num > 0) {
                    countPositive++;
                }
                else if(num < 0) {  
                    countNegative++;
                }
                else {
                    countZeroes++;
                }

                t--;
            }

            System.out.println("Number of Positive Numbers : " + countPositive);
            System.out.println("Number of Negative Numbers : " + countNegative);
            System.out.println("Number of  Zeroes : " + countZeroes);
        }



    /*--------------------------------------------------------
                    find x to the power n pow(x,n)
    ---------------------------------------------------------*/
    // x^n = x * x * x * ... n times
    public static long power(int x, int n) {
        
        long pow = 1L;

        // multiply x for n times
        for(int i = 0; i < n; ++i) {

            pow = pow * x;
        }

        return pow;
    }

    /*-----------------------------------------------------------------
                    gcd of two numbers
    -------------------------------------------------------------------*/
    /*
     Approach:
        -> Find the minimum of the two numbers .
        -> Then find the highest common factor of that minimum which is also the factor of the other number.
     */
    /* 
    public static int gcdOfTwoNum(int a, int b) {
        int ans = Math.min(a, b);

        while(ans > 0) {
            if(a % ans == 0 && b % ans == 0) {
                break;
            }
            ans--;
        }

        return ans;
    }
    */


    /*-----------------------------------------------------------------
                    Fibonacci series till n
    -------------------------------------------------------------------*/
    // 0 1 1 2 3 5 8 13 21
    // num1 + num2 = num3

    public static void fibonacci(int n) {
        int num1 = 0;
        int num2 = 1;

        int i = 0;
        while(i <= n) {
            System.out.print(num1 + " ");

            int num3 = num1 + num2;

            // swap
            num1 = num2;
            num2 = num3;

            i++;
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * String fullName = sc.nextLine();
         * 
         * printMyName(fullName);
         */

        /*
         * int num1 = sc.nextInt();
         * 
         * int num2 = sc.nextInt();
         * 
         * System.out.println(addTwoNum(num1, num2));
         */

        /*
        int num = sc.nextInt();

        System.out.println(factorial(num));
        */

        /*
        int num = sc.nextInt();

        System.out.println(isPrime(num));
        */


        // countEnteredNum();

        // System.out.println(power(5, 2));

        // System.out.println(gcdOfTwoNum(18, 12));

        fibonacci(5);
    }
}
