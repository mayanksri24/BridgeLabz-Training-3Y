
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsDemo {

    // Method to get computer choice
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random rand = new Random();
        return choices[rand.nextInt(3)];
    }

    // Method to determine winner
    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("Rock") && comp.equals("Scissors")) ||
            (user.equals("Paper") && comp.equals("Rock")) ||
            (user.equals("Scissors") && comp.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }

    // Method to display results in table
    public static void display(String[][] data, int userWins, int compWins, int games) {
        System.out.printf("%-10s %-12s %-10s\n", "Game", "Computer", "Result");
        System.out.println("-----------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10d %-12s %-10s\n", (i + 1), data[i][0], data[i][1]);
        }
        System.out.println("-----------------------------------");
        System.out.println("User Wins: " + userWins + " (" + (userWins * 100 / games) + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + (compWins * 100 / games) + "%)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        String[][] results = new String[games][2];
        int userWins = 0, compWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.next();

            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            results[i][0] = compChoice;
            results[i][1] = winner;

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
        }

        System.out.println("\nGame Results:");
        display(results, userWins, compWins, games);

        sc.close();
    }
}
