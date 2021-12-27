import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Rock Paper Scissor\n");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Choose your take = ");
            String choice = sc.nextLine();

            int target = (int) (Math.random() * (3 - 1 + 1) + 1);

            if (choice.equalsIgnoreCase("rock") || choice.equalsIgnoreCase("paper")
                    || choice.equalsIgnoreCase("scissor")) {
                // Rock
                if (choice.equalsIgnoreCase("rock")) {
                    switch (target) {
                        case 1:
                            System.out.println("CPU chooses rock");
                            System.out.println("Draw");
                            break;
                        case 2:
                            System.out.println("CPU choose paper");
                            System.out.println("You Lost");
                            break;
                        case 3:
                            System.out.println("CPU chooses scissor");
                            System.out.println("You Won");
                            break;

                        default:
                            break;
                    }
                }
                // Paper
                if (choice.equalsIgnoreCase("paper")) {
                    switch (target) {
                        case 1:
                            System.out.println("CPU chooses rock");
                            System.out.println("You Won");
                            break;
                        case 2:
                            System.out.println("CPU choose paper");
                            System.out.println("Draw");
                            break;
                        case 3:
                            System.out.println("CPU chooses scissor");
                            System.out.println("You Lost");
                            break;

                        default:
                            break;
                    }
                }
                // Scissor
                if (choice.equalsIgnoreCase("scissor")) {
                    switch (target) {
                        case 1:
                            System.out.println("CPU chooses rock");
                            System.out.println("You Lost");
                            break;
                        case 2:
                            System.out.println("CPU choose paper");
                            System.out.println("You Won");
                            break;
                        case 3:
                            System.out.println("CPU chooses scissor");
                            System.out.println("Draw");
                            break;

                        default:
                            break;
                    }
                }
            } else {
                System.out.println("Make sure your input is correct");
            }

            System.out.println("\nEND OF MATCH");

        }
    }
}
