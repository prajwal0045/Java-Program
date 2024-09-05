//Take name as input and print a greeting message for that particular name.
import java.util.*;
public class Assignment7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = in.next();
        System.out.println("Welcome to "+name);
    }
}
