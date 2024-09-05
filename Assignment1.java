// 1. Input a year and find whether it is a leap year or not.
import java.util.*;
public class Assignment1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = input.nextInt();
        if(year%4==0)
        {
            System.out.println(" "+year +" is a leap year.");
        }
        else
        {
            System.out.println(" "+year +" is not a leap year.");
        }
    }
}