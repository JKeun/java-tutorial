import java.util.Scanner;

public class TenerayOperatorDemo {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        num1 = scan.nextInt();

        scan.close();

        System.out.println("num1: " + num1);

        num2 = (num1 == 10) ? 100 : 200;
        System.out.println("num2: " + num2);

        num2 = (num1 == 25) ? 100 : 200;
        System.out.println("num2: " + num2);
    }
}
