import java.util.*;
public class Rotate90deg {
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
        System.out.println("Elements rotated by 90 degree : ");
        int maxr = n - 1;
        for (int j = 0 ; j < n; j++) {
            for (int i = maxr; i >= 0; i--) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
            
            
        }
    }
}
