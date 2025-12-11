import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int butterCups = scanner.nextInt();
        // You can use scanner.nextBoolean() to read a boolean value
        boolean isWeekend = scanner.nextBoolean();

        if ((isWeekend &&(butterCups >= 15 && butterCups <= 25))||(!isWeekend&&(butterCups >= 10 && butterCups <= 20))){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        scanner.close();
    }
}