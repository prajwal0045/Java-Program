import java.util.*;
public class Wavetraversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r = in.nextInt();
        System.out.print("Enter number of columns : ");
        int c = in.nextInt();
        System.out.println("Enter the elements : ");
        int[][] arr = new int[r][c];
        for(int i = 0;i < r;i++)
        {
            for(int j = 0;j < c;j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Elements of matrix are : ");
        for(int i = 0;i < r;i++)
        {
            for(int j = 0;j < c;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
        /*      11  12  13  14
         *      21  22  23  24  
         *      31  32  33  34
         *      Actual matrix 
         *  from wave traversal it should actual print like [11,21,31,32,22,12,13,23,33,34,24,14]
         * 
         *      00  01  02  03    
         *      10  11  12  13
         *      20  21  22  23
         *      These are the index
         * from the index. Rows are getting incremented but column is remained the same until its max
         * value and then column is incremented and rows are decremented and continues 
         *
         *  After observing the matrix we came to know about in even number column rows are incrementing 
         *  but in odd number th column rows are decrementing   
         */
        System.out.println("Wave traversal elements are : ");
        for(int j = 0;j<c;j++)
        {
            if(j%2==0)
            {
                for(int i = 0;i<r;i++)
                {
                    System.out.println(arr[i][j]);
                }
            }
            else{
                for(int i = r-1;i>=0;i--)
                {
                    System.out.println(arr[i][j]);
                }
            }
        }

    }
    
}
