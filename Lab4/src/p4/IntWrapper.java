package p4;
import java.util.Scanner;

public class IntWrapper {
    
    public static void main(String[] args) {

    Scanner scan = new Scanner (System.in);
    int Int;
    
    System.out.println ("Please enter a integer: ");
    Int = scan.nextInt();
    
    System.out.println (Int + " in binary: " + Integer.toBinaryString(Int));
    System.out.println (Int + " in octal: " + Integer.toOctalString(Int));
    System.out.println (Int + " in hex: " + Integer.toHexString(Int));
    
    System.out.println ("Maximum integer value: " + Integer.MAX_VALUE);
    System.out.println ("Minimum integer value: " + Integer.MIN_VALUE);
    
    System.out.println ("Please enter two more integers: ");
    String Int1 = scan.next();
    String Int2 = scan.next();
    int Num1 = Integer.parseInt(Int1);
    int Num2 = Integer.parseInt(Int2);
    
    System.out.println ("The Sum is: " + (Num1+Num2));

    }
}
