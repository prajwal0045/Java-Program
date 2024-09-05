import java.util.*;
public class Matrixmulti {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows of first array :");
        int r1 = in.nextInt();
        System.out.print("Enter number of columns of first array :");
        int c1 = in.nextInt();
        System.out.println("Enter elements of first array :");
        int[][] arr1 = new int [r1][c1] ;
        for(int i = 0;i < r1;i++)
        {
            for(int j = 0;j < c1;j++)
            {
                arr1[i][j]=in.nextInt();
            }
        }
        System.out.println("Elements of first array :");
        for(int i = 0;i < r1;i++)
        {
            for(int j = 0;j < c1;j++)
            {
                System.out.print(" "+arr1[i][j]);;
            }
            System.out.println("");
        }
        System.out.print("Enter number of rows of second array :");
        int r2 = in.nextInt();
        System.out.print("Enter number of columns of second array :");
        int c2 = in.nextInt();
        System.out.println("Enter elements of second array :");
        int[][] arr2 = new int [r2][c2] ;
        for(int i = 0;i < r2;i++)
        {
            for(int j = 0;j < c2;j++)
            {
                arr2[i][j]=in.nextInt();
            }
        }
        System.out.println("Elements of second array :");
        for(int i = 0;i < r2;i++)
        {
            for(int j = 0;j < c2;j++)
            {
                System.out.print(" "+arr2[i][j]);;
            }
            System.out.println("");
        }
        if(c1!=r2)
        {
            System.out.println("Invalid Input");
        }
        int[][] arr3 = new int[r1][c2];
        //Memorize and understand the logic 
        //a11,a12,a13   b11,b12,b13,b14
        //a21,a22,a23   b21,b22,b23,b24
        //              b31,b32,b33,b34

        //product == c11,c12,c13,c14
        //           c21,c22,c23,c24

        //c11 = a11*b11 + a12*b21 + a13*b31
        for(int i = 0;i<r1;i++)
        {
            for(int j = 0;j<c2;j++)
            {
                for(int k = 0;k<c1;k++)
                {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println("Elements of product array :");
        for(int i = 0;i < r1;i++)
        {
            for(int j = 0;j < c2;j++)
            {
                System.out.print(" "+arr3[i][j]);;
            }
            System.out.println("");
        }

    }
    
}
