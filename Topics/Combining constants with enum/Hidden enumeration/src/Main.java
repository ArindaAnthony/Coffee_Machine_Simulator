public class Main {

    public static void main(String[] args) {
        int counter = 0;

        // write your code here
        Secret[] sec = Secret.values();
        for (Secret secret : sec) {
            if(secret.toString().startsWith("STAR")) {
                counter++;
            }
        }


        System.out.println(counter);
    }
}

// sample enum for inspiration
/*enum Secret {
    STAR, CRASH, START, // ...
}*/
