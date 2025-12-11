import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();
        if(number < 1){
            System.out.println("no army");
        }
        if (number>0 && number<20){
            System.out.println("pack");
        }
        if(number>19 && number<250){
            System.out.println("throng");
        }
        if(number<1000&&number>249){
            System.out.println("zounds");
        }
        if(number>=1000){
            System.out.println("legion");
        }
    }
}