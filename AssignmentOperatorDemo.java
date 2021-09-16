import java.util.Scanner;

public class AssignmentOperatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("num1 and num2 are: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        num2 = num1;
        System.out.println("= Output: "+num2);

        num2 += num1;
        System.out.println("+= Output: "+num2);

        num2 -= num1;
        System.out.println("-= Output: "+num2);
        
        num2 *= num1;
        System.out.println("*= Output: "+num2);
        
        num2 /= num1;
        System.out.println("/= Output: "+num2);
        
        num2 %= num1;
        System.out.println("%= Output: "+num2);
    }
}
