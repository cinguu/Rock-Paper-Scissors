package itsc1212lab04;
import java.util.Scanner;

public class RPSGame {

    // 1 is Rock
    // 2 is Paper
    // 3 is Scissors
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome User ");
        System.out.println("Enter 1 for Rock, 2 for Paper, and 3 for Scissors" );
        
        int choice = scnr.nextInt();
        
	int computerChoice = (int) (Math.random()*3)+1;
        playGame(choice, computerChoice);
    }


    public static void playGame(int choice, int computerChoice) {

	//Print statements for User choice
        if (choice == 1) {
            System.out.println("User chose Rock");
        } else if (choice == 2) {
            System.out.println("User chose Paper");
        } else {
            System.out.println("User chose Scissors");
        }

	//Print statements for Computer choice
	if (computerChoice == 1) {
            System.out.println("Computer chose Rock.");
        } else if (computerChoice == 2) {
            System.out.println("Computer chose Paper.");
        } else {
            System.out.println("Computer chose Scissors.");
        }

	// Determining the Winner 	
        if (computerChoice == choice) {
            System.out.println("It's a tie!");
        } else if (computerChoice == 1 && choice == 2) {
            System.out.println("Paper beats rock, Player wins!");
        } else if (computerChoice == 2 && choice == 1) {
            System.out.println("Paper beats rock, Player loses!");
        } else if (computerChoice == 2 && choice == 3) {
            System.out.println("Scissors beats rock, Player wins!");
        } else if (computerChoice == 3 && choice == 2) {
            System.out.println("Scissors beats rock, Player loses!");
        } else if (computerChoice == 1 && choice == 3) {
            System.out.println("Rock beats Scissors, Player loses!");
        } else if (computerChoice == 3 && choice == 1) {
            System.out.println("Rock beats Scissors, Player wins!");
        }

    }

}


