import java.util.Random;
import java.util.Scanner;

public class Stone_Paper_Scessior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int score = 0;
        int rounds = 0;
        boolean playagain;
        do {
            rounds ++;
            boolean isincorrect = false;
            System.out.println("--------------<<<<<<<<<<<<<<<<< Welcome to the Rock, Paper, Scissior Game >>>>>>>>>>>>>>>----------------");
            System.out.print("Enter how many attempts you want to play := ");
            int maxattempts = scanner.nextInt();
            scanner.nextLine(); //Consume the leftover new line which helps to take inputs perfectly

            System.out.println("\nRound (" + rounds + ") :");
            String [] moves = {"Rock","Paper","Scissor"};

            for (int attempt = 1; attempt <= maxattempts; attempt++) {
                String Computermoves = moves[r.nextInt(3)];

                System.out.print("Attempt (" + attempt + ") Enter your Moves(Rock, Paper and Scissor) := ");
                String userMoves = scanner.nextLine().toLowerCase();

                 if (userMoves.equals("rock") && Computermoves.equals("Scissor") || userMoves.equals("scissor") && Computermoves.equals("Paper") || userMoves.equals("paper") && Computermoves.equals("Rock")){
                     System.out.println("Computer Move : " + Computermoves);
                     System.out.println("You Win.....");
                    score++;
                }
                else if(Computermoves.equalsIgnoreCase(userMoves)){
                     System.out.println("Computer Move : " + Computermoves);
                    System.out.println("It is tie!....");
                }
                else {
                    System.out.println("Computer Move : " + Computermoves);
                    System.out.println("Computer Win");
                }
            }
            if(!isincorrect){
                System.out.println("Sorry, you have used all attempts.");
            }

            System.out.print("Do you want to play again (yes/no) := ");
            playagain = scanner.next().equalsIgnoreCase("yes");
        }while (playagain);

        System.out.println("\n After all! Game Over.");
        System.out.println("\nYou Played (" + rounds + ") round and your score is := " + score + ".");
        scanner.close();
    }
}
