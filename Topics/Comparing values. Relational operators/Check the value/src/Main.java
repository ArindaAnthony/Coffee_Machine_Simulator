import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        boolean isTrue = a<10;
        if (isTrue){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}