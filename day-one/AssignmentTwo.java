import java.util.Scanner;
import java.util.Random;

class AssignmentTwo {
    public static void main(String[] args) {
        Random rand = new Random();
        int value = rand.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);
        boolean won = false;

        for (int i = 1; i <= 5; ++i) {
            if (i == 1) {
                System.out.print("Please guess a number between 1-100: ");
            }
            else {
                System.out.print("Try again: ");
            }
            int num = in.nextInt();
            if (num < 1 || num > 100) {
                System.out.println("Please guess a number between 1-100: ");
                continue;
            }
            int diff = value - num;
            if (diff >= -10 && diff <= 10) {
                System.out.println("Good Guess! the number was " + value);
                won = true;
                break;
            }
        }
        if (!won) {
            System.out.println("Sorry, the number was " + value);
        }
    }
}