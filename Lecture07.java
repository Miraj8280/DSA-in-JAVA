import java.util.Scanner;

/*-----------------------------------------------------------------
                    DSA in JAVA
                        -by-
                    Miraj Asraf
 ------------------------------------------------------------------*/

//  Arrays in Java

public class Lecture07 {

    /*----------------------------------------------------------------
                    Display array elements
    ------------------------------------------------------------------*/
    public static void display(int[] arr, int n) {
        System.out.print("Elements of the array : ");

        for(int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    /*----------------------------------------------------------------
                    Find maximum number in an array
    ------------------------------------------------------------------*/
    public static int maxNum(int[] arr, int n) {
        int ans = arr[0];

        for(int i = 0; i < n; ++i) {
            if(arr[i] > ans) {
                ans = arr[i];
            }
        }

        return ans;
    }



    /*----------------------------------------------------------------
                    Find minimum number in an array
    ------------------------------------------------------------------*/
    public static int minNum(int[] arr, int n) {
        int ans = arr[0];

        for(int i = 0; i < n; ++i) {
            if(arr[i] < ans) {
                ans = arr[i];
            }
        }

        return ans;
    }



    /*----------------------------------------------------------------
            Check if an array is sorted in ascending order or not
    ------------------------------------------------------------------*/
    public static Boolean isSorted(int[] arr, int n) {
        Boolean flag = true;

        for(int i = 1; i < n; ++i) {
            if(arr[i - 1] >= arr[i]) {
                flag = false;
            }
        }

        return flag;
    }


    public static void main(String[] args) {
        
        /* 
        int[] arr = new int[5];
        
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;

        System.out.println(arr[2]);
        System.out.println(arr[4]);

        */

        /* 
        String[] names = new String[7];

        names[0] = "Miraj Asraf";
        names[1] = "Khusbu Begam";
        names[2] = "Jishan Rahaman";
        names[3] = "Md Gulsan";
        names[4] = "Mahir Hussain";
        names[5] = "Taimur Hussain";
        names[6] = "Mehanaj Parvin";


        for(int i = 0; i < 7; ++i) {
            System.out.println(names[i]);
        }
        */




        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of the array : ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter elements of the array : "); 
        for(int i = 0; i < size; ++i) {
            arr[i] = sc.nextInt();
        }
        
        display(arr, size);


        
        /*----------------------------------------------------------------
                    Find maximum and minimum numbers in an array
        ------------------------------------------------------------------*/
        /*
        System.out.println("Maximum number : " + maxNum(arr, size));
        System.out.println("Minimum number : " + minNum(arr, size));
        */


        /*----------------------------------------------------------------
            Check if an array is sorted in ascending order or not
        ------------------------------------------------------------------*/
        System.out.println(isSorted(arr, size));

        
    }
}
