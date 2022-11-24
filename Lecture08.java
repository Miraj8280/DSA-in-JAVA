import java.util.Scanner;

/*-----------------------------------------------------------------
                    DSA in JAVA
                        -by-
                    Miraj Asraf
 ------------------------------------------------------------------*/

//  2D Arrays in Java

public class Lecture08 {


    /*-----------------------------------------------------------------------
                Display Elements of 2D Arrays
    --------------------------------------------------------------------------*/
    public static void display(int[][] matrix, int rows, int cols) {
        System.out.println("Elements of the 2D Array : ");
        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < cols; ++j) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of rows and columns : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements of 2D array : ");

        // Take input of a 2D array
        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < cols; ++j) {
                matrix[i][j] = sc.nextInt();
            }
        }
        

        // Display
        display(matrix, rows, cols);
    }
}
