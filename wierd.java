import java.util.Scanner;

public class wierd {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if(N%2==0){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}
