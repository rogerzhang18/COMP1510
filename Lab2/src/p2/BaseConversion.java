// ***********************************************
//   BaseConvert.java
//
//   Converts base 10 numbers to another base
//   (at most 4 digits in the other base).  The
//   base 10 number and the base are input.
// ***********************************************
package p2;
import java.util.Scanner;


public class BaseConversion
{
    
    public static void main (String[] args)
    {
        int base;       // the new base
        int base10Num;  //thenumberinbase10 
        int maxNumber;  //themaximumnumberthatwillfit
                        // in 4 digits in the new base
        int place0; // digit in the 1's (base^0) place
        int place1;
        int place2;
        int place3;
        int digit0;
        int digit1;
        int digit2;
        int digit3;

        
        String baseBNum = new String (""); // the number in the new base
        Scanner scan = new Scanner(System.in);
        
        System.out.println();
        System.out.println ("Welcome to Roger's base Conversion Program");
        System.out.println() ;
        System.out.print ("Please enter a base (2-9): ");
        base = scan.nextInt();
        maxNumber=base*base*base*base-1;
 // Compute the maximum base 10 number that will fit in 4 digits
// in the new base and tell the user what range the number they
// want to convert must be in
        System.out.print ("Please enter a base 10 number that does not exceed "
                + maxNumber + " to convert: ");
        base10Num = scan.nextInt();
        
        place0=base10Num/base;
        digit0=base10Num%base;
        
        place1=place0/base;
        digit1=place0%base;
       
        place2=place1/base;
        digit2=place1%base;
        
        place3=place2/base;
        digit3=place2%base;
        
        System.out.println ("The value you entered in base " + base + " is "
                + digit3 + digit2 + digit1+ digit0);
    }
}