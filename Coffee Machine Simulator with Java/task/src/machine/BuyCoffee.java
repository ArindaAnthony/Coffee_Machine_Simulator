package machine;

import java.util.Scanner;

public class BuyCoffee {
    private int water;
    private int coffee;
    private int milk;
    private int price;
    private int cups;
    private Scanner sc;

    public BuyCoffee(int cups, int price, int milk, int coffee, int water, Scanner sc) {
        this.cups = cups;
        this.price = price;
        this.milk = milk;
        this.coffee = coffee;
        this.water = water;
        this.sc = sc;
    }
    public void start() {
        String action = menu();
        while (!action.equals("exit")) {
            switch (action) {
                case "buy":
                    //buy method
                    break;
                case "fill":
                    //fill method
                    break;
                case "take":
                    //take method
                    break;
                case "clean":
                    //clean method
                case "remaining":
                    //remaining method
                    break;
                default:
                    System.out.println("Invalid action");
            }
            action = menu();
        }
    }
    public String menu() {
        System.out.println("Write action (buy, fill, take, clean, remaining, exit):");
        return sc.nextLine().trim().toLowerCase();
    }
}
