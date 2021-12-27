import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Rock Paper Scissor");
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Choose your take = ");
                String choice = sc.nextLine();
            
            int target = (int)(Math.random()*(3-1+1)+1);
           
            if(choice.equalsIgnoreCase("rock") || choice.equalsIgnoreCase("paper") || choice.equalsIgnoreCase("scissor")){
                //Rock
            if(choice.equalsIgnoreCase("rock")){
                if(target == 1){
                    System.out.println("CPU chooses rock");
                    System.out.println("Draw");
                }else if(target == 2){
                    System.out.println("CPU choose paper");
                    System.out.println("You Lost");
                }else if(target == 3){
                    System.out.println("CPU chooses scissor");
                    System.out.println("You Won");
                }
            }
            //Paper
            if(choice.equalsIgnoreCase("paper")){
                if(target == 1){
                    System.out.println("CPU chooses rock");
                    System.out.println("You Won");
                }else if(target == 2){
                    System.out.println("CPU choose paper");
                    System.out.println("Draw");
                }else if(target == 3){
                    System.out.println("CPU chooses scissor");
                    System.out.println("You Lost");
                }
            }
            //Scissor
            if(choice.equalsIgnoreCase("scissor")){
                if(target == 1){
                    System.out.println("CPU chooses rock");
                    System.out.println("You Lost");
                }else if(target == 2){
                    System.out.println("CPU choose paper");
                    System.out.println("You Won");
                }else if(target == 3){
                    System.out.println("CPU chooses scissor");
                    System.out.println("Draw");
                }
            }
            }else{
                System.out.println("Make sure your input is correct");
            }
            

            System.out.println("\nEND OF MATCH");

        }catch (Exception e){
            System.out.println("Make Sure your Spelling is correct");
        }
    }
}
