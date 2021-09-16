import java.util.Scanner;

class RelationalOperatorDemo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First num1 is: ");
        int num1 = scanner.nextInt();

        System.out.print("Second num2 is: ");
        int num2 = scanner.nextInt();

        scanner.close();

        if (num1 == num2) {
            System.out.println("num1 and num2 are equal");
        }
        else{
            System.out.println("num1 and num2 are not equal");
        }

        if (num1 != num2) {
            System.out.println("num1 and num2 are not euqal");
        }
        else{
            System.out.println("num1 and num2 are equal");
        }

        if (num1 > num2) {
            System.out.println("num1 is greater than num2");
        }
        else{
            System.out.println("num1 is not greater than num2");
        }

        if (num1 >= num2) {
            System.out.println("num1 is greater than or equal to num2");
        }
        else{
            System.out.println("num1 is less than num2");
        }

        if (num1 < num2) {
            System.out.println("num1 is less than num2");
        }
        else{
            System.out.println("num1 is not less than num2");
        }

        if (num1 <= num2) {
            System.out.println("num1 is less than or equal to num2");
        }
        else{
            System.out.println("num1 is greater than num2");
        }
    }
}
