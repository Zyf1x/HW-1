import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String multiWordString;

        final int NUM = 42;

        String word = "Hello";

        multiWordString = NUM + word;

        System.out.println("multiWordString: " + multiWordString);
        System.out.println("NUM: " + NUM);
        System.out.println("word: " + word);

        if (NUM < 0) {
            System.out.println("You received a negative number");
        } else if (NUM > 0) {
            System.out.println("You received a negative number");
        } else {
            System.out.println("You saved zero");
        }

        System.out.print("Your Name: ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "!");
    }
}
