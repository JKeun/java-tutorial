import java.util.Scanner;
public class Demo
{
    public static void main(String[] args)
    {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        number = scan.nextInt();
        scan.close();
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
    }
}
