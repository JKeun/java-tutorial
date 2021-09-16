import java.util.Scanner;

public class AutoOperatorDemo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First num1 is: ");
        int num1 = scanner.nextInt();

        System.out.print("Second num2 is: ");
        int num2 = scanner.nextInt();

        scanner.close();

        num1++;
        num2--;

        System.out.println("num1++ is: "+num1);
        System.out.println("num2-- is: "+num2);
    }
}
