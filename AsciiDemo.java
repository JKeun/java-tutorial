public class AsciiDemo {

    public static void main(String[] args) {
    
        char ch = 'P';
        int asciiCode = ch;
        // type casting char as int
        int asciiValue = (int)ch;

        System.out.println("(By assinging to int)ASCII value of "+ch+" is: " + asciiCode);
        System.out.println("(By type casting as int)ASCII value of "+ch+" is: " + asciiValue);
    }
}
