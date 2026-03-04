package game;
import java.util.*;
import java.util.Random;
public class RandomNumberGame {
	public static void GuessingNumberGame() {
	
	Random random=new Random();
	Scanner sc =new Scanner(System.in);
	
	int randomNumber=random.nextInt(100)+1;
//	System.out.println("random number is"+randomNumber);
	
	int attempts=0;
	while(true) {
	System.out.println("enter your guess between(1-100");
	int playerGuess=sc.nextInt();
	attempts++;
	
	if(playerGuess==randomNumber) {
		System.out.println("Correct! you Win!");
		System.out.println("it looks like " + attempts +" tries.");
		break;
	}
	else if(randomNumber>playerGuess) {
		System.out.println("Nope! the random number is higher than "+playerGuess+" guess again.");
	}
	else {
		System.out.println("Nope! the random number is lower than "+ playerGuess+" guess again.");
	}
	}
	
}
	public static void main(String[] args) {
		GuessingNumberGame();
	}
}
