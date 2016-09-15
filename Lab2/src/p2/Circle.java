/**
 * 
 */
package p2;
import java.util.Scanner;
/**
 * @author ROGER
 *
 */
public class Circle {
    public static void main(String[] args)
    {
        final double PI = 3.14159;
        int radius = 10;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the radius of a circle: ");
        radius = scan.nextInt();
        
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        
        System.out.println("The area of a circle with radius " + radius +
                " is " + area);
        System.out.println("The circumference of a circle with radius " + radius + " is "
                + circumference);
        
        
        //radius = 20;
        radius = 2*radius;
        
        double area1 = PI * radius * radius;
        double circumference1 = 2 * PI * radius;
        System.out.println("The area of a circle with radius " + radius +
                " is " + area1);
        System.out.println("The circumference of a circle with radius " + radius + " is "
                + circumference1);
        double areaChange = area1/area;
        double circumferenceChange = circumference1/circumference;
        System.out.println("The change in area is by a factor of " + areaChange);
        System.out.println("The change in circumference of a circle is by a factor of " 
                + circumferenceChange);
    }

}
