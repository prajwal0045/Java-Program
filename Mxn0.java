//Write a program such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
import java.util.*;
public class Mxn0
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int m = in.nextInt();
        System.out.print("Enter the number of columns : ");
        int n  = in.nextInt();
        int[][] ogarr = new int[m][n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < ogarr.length; i++) {
            for (int j = 0; j < ogarr[0].length; j++) {
                ogarr[i][j] = in.nextInt();
            }
        }
        System.out.println("Elements of an array : ");
        for (int i = 0; i < ogarr.length; i++) {
            for (int j = 0; j < ogarr[0].length; j++) {
                System.out.print(ogarr[i][j]+" ");
            }
            System.out.println(" ");
        }
        int[][] dparr = new int [m][n];
        for (int i = 0; i < dparr.length; i++) {
            for (int j = 0; j < dparr[0].length; j++) {
                dparr[i][j] = ogarr[i][j] + 1;
            }
        }
        for (int i = 0; i < dparr.length; i++) {
            for (int j = 0; j < dparr[0].length; j++) {
                if(dparr[i][j] == 1 )
                {
                    for(int k = 0; k < m; k++ )
                    {
                        dparr[k][j] = 0;
                    }
                    for(int l = 0; l < n; l++)
                    {
                        dparr[i][l] = 0;
                    }
                }
            }
            
        }
        System.out.println("MxN matrix is : ");
        for (int i = 0; i < dparr.length; i++) {
            for (int j = 0; j < dparr[0].length; j++) {
                if(dparr[i][j] == 0)
                {
                    System.out.print(dparr[i][j]+" ");
                }
                else 
                {
                    System.out.print(dparr[i][j]-1+" ");
                }
            }
            System.out.println("");
            
        }
        

    }
}