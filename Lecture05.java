/*-----------------------------------------------------------------
                    DSA in JAVA
                        -by-
                    Miraj Asraf
 ------------------------------------------------------------------*/


// Patterns Printing
// row => outer loop
// column => inner loop

import java.util.Scanner;

public class Lecture05 {
   
     public static void main(String[] args) {
        /*------------------------------------------------------------------------
        Pattern - 1: Solid Rectangle

            *****
            *****
            *****
            *****
        
        -----------------------------------------------------------------------------*/

        Scanner sc = new Scanner(System.in);

        /*
        System.out.print("Enter row number : ");
        int row = sc.nextInt();

        System.out.print("Enter column number : ");
        int col = sc.nextInt();

        // print rows
        for(int r = 1; r <= row; ++r) {

            // print columns
            for(int c = 1; c <= col; ++c) {
                System.out.print("*");
            }
            System.out.println();
        }
        */


        /*------------------------------------------------------------------------
        Pattern - 2 : Hollow Rectangle

            *****
            *   *
            *   *
            *****
        
        -----------------------------------------------------------------------------*/
        /*
        System.out.print("Enter row number : ");
        int row = sc.nextInt();

        System.out.print("Enter column number : ");
        int col = sc.nextInt();

        // print only the boundaries i.e; for a cell (r, c) stars will be printed at -
        // r = 1 or r = row or j = 1 or j = col 

        for(int r = 1; r <= row; ++r) {

            for(int c = 1; c <= col; ++c) {

                if(r == 1 || r == row || c == 1 || c == col) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        */


        /*------------------------------------------------------------------------
        Pattern - 3 : Half Pyramid

            *
            **
            ***
            ****
            *****
        
        -----------------------------------------------------------------------------*/
        // Observation - 1: no. of rows = no. of stars
        // 1st row => 1 star 
        // 2nd row => 2 stars and so on...
        
        // Observation - 2: no. of rows = no. of columns
        // 1st row => 1 column
        // 2nd row => 2 column and so on...

        /* 
        System.out.print("Enter row number : ");
        int n = sc.nextInt(); // n = no. of rows

        for(int r = 1; r <= n; ++r) {
            for(int c = 1; c <= r; ++c) {
                System.out.print("*");
            }
            System.out.println();
        }
        */


        /*------------------------------------------------------------------------
        Pattern - 4 : Inverted Half Pyramid

            *****
            ****
            ***
            **
            *
        
        -----------------------------------------------------------------------------*/
        // Observation: 
        // 1st row => n = 5 no. of columns
        // 2nd row => (n - 1)  = 4 no. of columns and so on... 

        // 1st row => 5 stars
        // 2nd row => 4 stars
        // 3rd row => 3 stars and so on...

        /*
        System.out.print("Enter row number : ");
        int n = sc.nextInt();

        for(int r = n; r >= 1; --r) {
            for(int c = 1; c <= r; ++c) {
                System.out.print("*");
            }
            System.out.println();
        }
        */


        /*------------------------------------------------------------------------
        Pattern - 5 : Inverted Half Pyramid (rotated by 180deg)

                *
               **
              ***
             ****
            ***** 
        -----------------------------------------------------------------------------*/
        // Observation: no. of rows = no. stars (columns)
        // 1st row => 4 spaces + 1 star 
        // 2nd row => 3 spaces + 2 stars
        // 3rd row => 2 spaces + 3 stars
        // and so on...

        /*
        System.out.print("Enter row number : ");
        int n = sc.nextInt();
        
        for(int r = 1; r <= n; ++r) {
            // for spaces
            for(int s = 1; s <= n - r; ++s) {
                System.out.print(" ");
            }

            // for stars
            for(int c = 1; c <= r; ++c) {
                System.out.print("*");
            }

            System.out.println();
        }
        */

        /*------------------------------------------------------------------------
        Pattern - 6 :  Half Pyramid with Numbers

            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
        
        -----------------------------------------------------------------------------*/
        // Observation :
        // 1st row => 1
        // 2nd row => 1 to 2
        // 3rd row => 1 to 3
        // and so on

        /* 
        System.out.print("Enter row number : ");
        int n = sc.nextInt();

        for(int r = 1; r <= n; ++r) {
            for(int c = 1; c <= r; ++c) {
                System.out.print(c + " ");
            }

            System.out.println();
        }
        */


        /*------------------------------------------------------------------------
        Pattern - 7 : Inverted Half Pyramid with Numbers

            1 2 3 4 5 
            1 2 3 4
            1 2 3
            1 2
            1
        
        -----------------------------------------------------------------------------*/

        /* 
        System.out.print("Enter row number : ");
        int n = sc.nextInt();

        for(int r = n; r >= 1; --r) { 
            for(int c = 1; c <= r; ++c) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        */


        /*------------------------------------------------------------------------
        Pattern - 8 : Floyd's Triangle

            1
            2 3
            4 5 6
            7 8 9 10
            11 12 23 14 15
        
        -----------------------------------------------------------------------------*/
        // Observation: row number = no. of values
        // 1st row => 1 value => 1
        // 2nd row => 2 values => 2 3
        // 3rd row => 3 values => 4 5 6
        // after every row and column, the value increases.

        /*
        System.out.print("Enter row number : ");
        int n = sc.nextInt();

        int counter = 1;

        for(int r = 1; r <= n; ++r) {
            for(int c = 1; c <= r; ++c) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
        */

        /*------------------------------------------------------------------------
        Pattern - 9 : Binary Triangle (0 1 Triangle)
        
        1 
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
        
        -----------------------------------------------------------------------------*/
        // Observation: for a cell (r, c) -
        // (r + c) is even => 1
        // (r + c) is odd => 0

        System.out.print("Enter row number : ");
        int n = sc.nextInt();

        for(int r = 1; r <= n; ++r) {
            for(int c = 1; c <= r; ++c) {
                if((r + c) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                else {
                    System.out.print(0 + " ");
                }
            }

            System.out.println();
        }

     }
}
