package p3;


public class RectangleArea {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int length = Integer.parseInt(args[0]);   // first parameter
                int width = Integer.parseInt(args[1]);    // second parameter

                System.out.println("The length of the rectangle is: " + length);
                System.out.println("The width of the rectangle is: " + width);
                              // exit, returning calculated area
                System.exit(length * width);         
            } catch (NumberFormatException e) {
                System.err.println("Argument" + " must be an integer");
                System.exit(0);
            }
        } else {
            System.out.println("USAGE: java RectangleArea <Length> <Height>");
        }
    }
} 
