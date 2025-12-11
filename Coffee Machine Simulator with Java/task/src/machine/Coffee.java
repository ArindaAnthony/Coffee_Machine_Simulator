package machine;

import java.util.Scanner;

public class Coffee {
    private int water;
    private int milk;
    private int coffee;
    private int cups;
    private int price;
    private Scanner sc;

    public Coffee(int water, int milk, int coffee, int cups, int price, Scanner sc) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.cups = cups;
        this.price = price;
        this.sc = sc;
    }
    public void action() {
        while (true) {

        }
    }

    public String menu() {
        System.out.println("Write action (buy, fill, take, clean, remaining, exit):");
        String action = sc.nextLine();
        return action.trim().toLowerCase();
    }


}
