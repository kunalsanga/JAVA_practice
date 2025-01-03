import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Reading a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.println("You entered: " + inputString);
        
        // Reading an integer
        System.out.print("Enter an integer: ");
        int inputInt = scanner.nextInt();
        System.out.println("You entered: " + inputInt);
        
        // Reading a double
        System.out.print("Enter a double: ");
        double inputDouble = scanner.nextDouble();
        System.out.println("You entered: " + inputDouble);
        
        // Close the scanner
        scanner.close();
    }
}
