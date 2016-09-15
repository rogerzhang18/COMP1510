package p8;

import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {
        String str1;
        String str2;
        String str3;
        int num1;
        int num2;
        int num3;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter three strings: ");
        str1 = scan.nextLine();
        str2 = scan.nextLine();
        str3 = scan.nextLine();

        System.out.println("The largest of the three is: " + 
        Compare3.largest(str1, str2, str3));

        System.out.println("Please enter three numbers: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        System.out.println("The largest of the three is: "
                + Compare3.largest(Integer.toString(num1), 
                        Integer.toString(num2), Integer.toString(num3)));
    }

}
