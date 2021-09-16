import java.util.Scanner;

public class NumMultiDemo {

    public static void main(String[] args) {
    
        /* This reads the input provied by user
         * using keyboard
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");

        // This method reads the number provided using keyboard
        double num1 = scan.nextDouble();

        System.out.print("Enter second numbe: ");
        double num2 = scan.nextDouble();

        // Closing Scanner after the use
        scan.close();

        // Calculating product of two numbers
        double product = num1 * num2;

        // Displaying the multiplication result
        System.out.println("Output: "+product);
    }
}
