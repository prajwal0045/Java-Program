import java.util.*;
public class Diagonaltraversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows and column : ");
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Elements of an array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        /*  Diagonal traversal
         *  00 01 02 03
         *  10 11 12 13
         *  20 21 22 23
         *  30 31 32 33
         * 
         *  It should print like 00 11 22 33 01 12 23 02 13 03
         *  row will always start with 0 so we can place a loop inside 
         */
        for(int g = 0; g < n; g++)
        {
            for(int i = 0,  j = g; j < n ; i++, j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            
        }
    }
}
