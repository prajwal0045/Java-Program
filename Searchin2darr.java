import java.util.*;
public class Searchin2darr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = in.nextInt();
        System.out.print("Enter the number of columns : ");
        int n  = in.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print("Enter element to be searched : ");
        int s = in.nextInt();
        System.out.println("Elements of an array are : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        for(int i = 0; i < m; i++ )
        {
            for(int j = 0; j < n; j++)
            {
                if(arr[i][j] == s)
                {
                    System.out.println("Element is found at index "+i+ " "+j);
                    break;
                }
            }
           
        }
        System.out.println("Element not found in the 2d array.");
    }
}
