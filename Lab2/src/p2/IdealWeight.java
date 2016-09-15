package p2;
import java.util.Scanner;

public class IdealWeight {
    public static void main(String[] args)
    {
        int feet;
        int inch;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your height in feet: ");
        feet = scan.nextInt();
        System.out.print("Please enter your height in inches: ");
        inch = scan.nextInt();
        
        int totalHeight=feet*12+inch;
        int extraHeight=totalHeight-5*12;
        
        int idealFemale=100+5*extraHeight;
        int idealMale=106+6*extraHeight;
        
        double femalelow=idealFemale*0.85;
        double femalehigh=idealFemale*1.15;
        double malelow=idealMale*0.85;
        double malehigh=idealMale*1.15;

        
        System.out.println("Your ideal weight for female is " + idealFemale + " pounds");
        System.out.println("Your ideal weight for male is " + idealMale + " pounds");
        System.out.println("Your ideal weight range for female is " + femalelow + " to "
                + femalehigh + " pounds");
        System.out.println("Your ideal weight range for male is " + malelow + " to "
                + malehigh + " pounds");
        
    }
}
