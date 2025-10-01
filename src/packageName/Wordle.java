package packageName;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Wordle {

	public static void main(String[] args) throws IOException {
		
		//Get word to guess
		File file = new File("words.txt");
		Scanner scanner = new Scanner(file);
		
		int num = (int)(Math.random() * 190);
		String word = "";
		while (num != 0) {
			word = scanner.nextLine();
			num--;
		}
		scanner.close();
		
		
		//Introduction
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Wordle!");
		System.out.println("1. Guess the secret 5-letter word in 6 tries");
		System.out.println("2. Each guess, you get to keep any letters that are correctly placed");
		System.out.println("3. After each guess, you will see correct letters and letters that are in the word, but not placed correctly.");
		System.out.println("4. * means the letter is in the right spot, and ! means the letter is in the word, but not the right spot.");
		System.out.println("5. Good luck!");
		
		//6 Guessing Rounds
		int count = 0;
		String showing = "_____";
		String hints = "_____";
		boolean winner = false;
		for (int i = 0; i < 6; i++) {
			count++;
			System.out.println(showing);
			System.out.print("Your Guess: ");
			String guess = sc.nextLine();
			if (word.equals(guess)) {
				winner = true;
				break;
			} else {
				for (int j = 0; j < 5; j++) {
					if ((word.charAt(j) == guess.charAt(j)) && (showing.charAt(j) == '_')) {
						showing = showing.substring(0,j) + word.charAt(j) + showing.substring(j+1);
						hints = hints.substring(0,j) + "*" + hints.substring(j+1);
					} else if (showing.charAt(j) == guess.charAt(j)) {
						hints = hints.substring(0,j) + "*" + hints.substring(j+1);
					} else if (word.indexOf(guess.charAt(j)) != -1) {
						hints = hints.substring(0,j) + "!" + hints.substring(j+1);
					}
				}
			}
			System.out.println(hints);
			hints = "_____";
		}
		
		
		//Ending
		if (winner) {
			System.out.println("You got the word in " + count + " guesses!");
		} else {
			System.out.println("You lose!");
			System.out.println("The word was: " + word);
		}
		sc.close();
	}

}
