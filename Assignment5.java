//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.*;
public class Assignment5 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i ;
        char input ;
        int sum = 0;
        do{
            System.out.print("Enter any number : ");
            i = in.nextInt();
            sum = sum + i;
            System.out.println("Enter x or X to exit or enter any ccharacter to continue");
            input = in.next().trim().charAt(0);
            System.out.println("Summation = "+sum);

        }while(input!='x' && input!='X');
    }
}