
import java.util.Scanner;

public class RockPaperScissors {

    // Method to get computer choice
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        switch (choice) {
            case 0: return "Rock";
            case 1: return "Paper";
            default: return "Scissors";
        }
    }

    // Method to find winner
    public static String findWinner(String player, String computer) {
        if (player.equals(computer)) return "Draw";

        switch (player) {
            case "Rock": return (computer.equals("Scissors")) ? "Player" : "Computer";
            case "Paper": return (computer.equals("Rock")) ? "Player" : "Computer";
            case "Scissors": return (computer.equals("Paper")) ? "Player" : "Computer";
        }
        return "Invalid";
    }

    // Method to calculate win percentages
    public static void showStats(int playerWins, int compWins, int games) {
        double playerPercent = (playerWins * 100.0) / games;
        double compPercent = (compWins * 100.0) / games;

        System.out.println("\n--- Final Stats ---");
        System.out.println("Player Wins: " + playerWins + " (" + playerPercent + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + compPercent + "%)");
        System.out.println("Draws: " + (games - playerWins - compWins));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int playerWins = 0, compWins = 0;

        for (int i = 1; i <= games; i++) {
            System.out.print("\nGame " + i + " - Enter Rock, Paper or Scissors: ");
            String player = sc.next();
            String computer = getComputerChoice();
            System.out.println("Computer chose: " + computer);

            String winner = findWinner(player, computer);

            if (winner.equals("Player")) {
                playerWins++;
                System.out.println("You win this round!");
            } else if (winner.equals("Computer")) {
                compWins++;
                System.out.println("Computer wins this round!");
            } else {
                System.out.println("It's a draw!");
            }
        }

        showStats(playerWins, compWins, games);

        sc.close();
    }
}
