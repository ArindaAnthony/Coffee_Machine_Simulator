package machine;

import java.util.Scanner;

public class Coffee {
    private int water;
    private int milk;
    private int coffee;
    private int cups;
    private int amount;
    private Scanner sc;

    public Coffee(int water, int milk, int coffee, int cups, int amount, Scanner sc) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.cups = cups;
        this.amount = amount;
        this.sc = sc;
    }
    public void action() {
        String action = menu();
        while (!action.equals("exit")) {
            switch (action) {
                case "buy":
                    //buy method
                    break;
                case "fill":
                    filling();
                    break;
                case "take":
                    take(amount);
                    break;
                case "remaining":
                    remaining();
                    break;
                case "clean":
                    //clean method
                    break;
                default:
                    System.out.println("Invalid action");
            }
            action = menu();

        }
    }

    public String menu() {
        System.out.println("Write action (buy, fill, take, clean, remaining, exit):");
        String action = sc.nextLine();
        return action.trim().toLowerCase();
    }
    public void filling(){
        int added_water, added_milk, added_coffee, added_cups;
        System.out.println("Write how many ml of water you want to add: ");
        added_water = sc.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        added_milk = sc.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        added_coffee = sc.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        added_cups = sc.nextInt();
        sc.nextLine();
        water += added_water;
        milk += added_milk;
        coffee += added_coffee;
        cups += added_cups;
    }
    public void take(int amount){
        System.out.printf("I gave you $%d%n",amount);
        amount = 0;
    }
    public void remaining(){
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water%n",water);
        System.out.printf("%d ml of milk%n",milk);
        System.out.printf("%d g of coffee beans%n",coffee);
        System.out.printf("%d disposable cups%n",cups);
        System.out.printf("$%d of money%n",amount);
    }
    public void buying(){
        String choice = subMenu();
        if (choice.equals("1")) {//water-250, coffee-16g, money-4$
            enoughCoffee(water,milk,coffee,1);
            water -= 250;
            coffee -=16;
            amount +=4;

        } else if (choice.equals("2")) {//water-350,milk-75, coffee-20g, money-7$
            enoughCoffee(water,milk,coffee,2);
            water -= 350;
            milk -= 75;
            coffee -=20;
            amount += 7;

        } else if (choice.equals("3")) {//water-200, milk-100,coffee-12g, money-6$
            enoughCoffee(water,milk,coffee,3);
            water = water-200;
            milk = milk-100;
            coffee = coffee-12;
            amount += 6;

        } else if (choice.equals("back")) {
            return;
        }else {
            System.out.println("Invalid choice");
        }
    }
    public String subMenu(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        return sc.nextLine();
    }
    public static void enoughCoffee(int water, int milk, int coffee, int type){
        int x,y,z;
        int m,n,o;
        n=0;
        if(type==1){
            x = water-250;
            //y = milk/50;
            z = coffee-16;
            n = Math.min(x,z);
            if (n>1||n==1){
                System.out.println("I have enough resources, making you a coffee!");
            }else {
                System.out.println("Sorry, not enough water!");
            }
        } else if (type==2) {
            x = water-350;
            y = milk-75;
            z = coffee-20;
            m = Math.min(x,y);
            n = Math.min(m,z);
            if (n>1||n==1){
                System.out.println("I have enough resources, making you a coffee!");
            }else {
                System.out.println("Sorry, not enough water!");
            }
        }else if (type==3) {
            x = water-200;
            y = milk-100;
            z = coffee-12;
            m = Math.min(x,y);
            n = Math.min(m,z);
            if (n>1||n==1){
                System.out.println("I have enough resources, making you a coffee!");
            }else {
                System.out.println("Sorry, not enough water!");
            }
        }

    }
}
