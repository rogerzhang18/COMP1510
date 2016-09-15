package p10;

/**
 * 
 * Average.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Average {
    /**
     * Main method.
     * 
     * @param args
     *            Command line arguments.
     */
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No arguments.");
        } else {
            double sum = 0;
            int num = 0;
            int count = args.length;
            for (int i = 0; i < count; i++) {
                sum += Integer.parseInt(args[i]);
                System.out.println(args[i]);
                num++;
            }

            System.out.println("The average is " + sum / num);
        }
    }
}
