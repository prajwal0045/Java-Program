//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.*;
public class Assignment8
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        System.out.println("Enter time : ");
        float t = in.nextFloat();
        System.out.println("Enter principle amount : ");
        float p = in.nextFloat();
        System.out.println("Enter rate : ");
        float r = in.nextFloat();
        float si = (p*t*r)/100;
        System.out.println("Simple interest = "+si);
        
    }
}