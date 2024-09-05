//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.*;
public class Assignment9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter operation to be performed : ");
        String op = in.next();
      
        if(op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/"))
        {
            System.out.println("Enter number 1 : ");
            float n1 = in.nextFloat();
            System.out.println("Enter number 2 : ");
            float n2 = in.nextFloat();
            if(op.equals("+"))
            {
                float res = n1 + n2;
                System.out.println("Result of addition : "+res);
            }
            if(op.equals("-"))
            {
                float res = n1 - n2;
                System.out.println("Result of substraction : "+res);
            }
            if(op.equals("*"))
            {
                float res = n1 * n2;
                System.out.println("Result of multiplication : "+res);
            }
            if(op.equals("/"))
            {
                if(n2 == 0)
                {
                    System.out.println("Error");
                    
                }
                float res = n1 / n2;
                System.out.println("Result of division : "+res);
            }
        }
        
    }
}
