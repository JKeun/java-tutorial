import java.util.Scanner;

class LogicalOperatorDemo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First bool is: ");
        boolean b1 = scanner.nextBoolean();

        System.out.print("Second bool is: ");
        boolean b2 = scanner.nextBoolean();

        scanner.close();

        System.out.println("b1 && b2: " + (b1&&b2));
        System.out.println("b1 || b2: " + (b1||b2));
        System.out.println("!(b1 && b2): " + !(b1&&b2));
    }
}
