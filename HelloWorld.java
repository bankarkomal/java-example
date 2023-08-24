import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Creates reader instance which takes
        //Input from standard input -> keyboard
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number :");

        // nextInt() creates next integer from the keyboard
        int number = reader.nextInt();

        // Println() prints the following line to the output of the screen
        System.out.println("You entered" + number);
    }
}
