/*Question
 * you are given number n, representing rows 
 * you are given number m, representing columns
 * you are given n*M numbers(1's and 0's) representing 2d array 
 * consider this array a maze and a player enters from top - left - corner in east direction
 * the player moves in the same direction as long as he meets 0'. on seeing a 1 he takes a 90 degree right turn
 * you are required to print the indices in(row,col)
 */
import java.util.*;
public class Exitofamatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows in array : ");
        int r = in.nextInt();
        System.out.print("Enter the number of columns in array : ");
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Elements of an array are : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        /*
         *  0 0 0 1
         *  1 0 1 0   answer = 2 2
         *  1 0 0 1       
         *  Approach 
         *  take direction as a variable 
         *  if dir = 0 right i = 0 j ++
         *  if dir = 1 down i = ++ j = j
         *  if dir = 2 left i = i j = --
         *  if dir = 3 up i = i-- j = j
         * 
         */
        int dir = 0, i = 0, j = 0;
        while(true)
        {
            
            dir = (dir + arr[i][j]) % 4;
            if(dir == 0)
            {
                j++;
            }
            else if(dir == 1)
            {
                i++;
            }
            else if(dir == 2)
            {
                j--;
            }
            else if(dir == 3)
            {
                i--;
            }

            if(i<0) 
            {
                i++;
                break;
            }

            else if(j<0)
            {
                j++;
                break;
            }
            else if(i == r)
            {
                i--;
                break;
            }
            else if(j == c)
            { 
                j--;
                break;
            }
        }
        System.out.println(" "+i +"  "+j);
    }
    
}
