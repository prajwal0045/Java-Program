//Jai Ganesh
//Take a number as input and print the multiplication table for it.
import java.util.*;
public class Assignment3
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        for (int i = 1; i < 11; i++) {
            int mul = n * i;
            System.out.println(""+n +" * "+ ""+i +" = " +""+mul);
            
        }
    }
}
