import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner to read input from the user.
        Scanner sc = new Scanner(System.in);

        // Read two integer values from the user.
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Compare the two values and print the result.
        boolean isTrue = a>b;
        // ADD YOUR CODE HERE
        if (isTrue){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
}