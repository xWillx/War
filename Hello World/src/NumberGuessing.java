
import java.util.Scanner;
public class NumberGuessing 
{
	static int number;
	static String playerName;
	static int guess;
	static int min = 0;
	static int lose = 1;
	static int fail = 1;
	
	public static void main(String[] args) 
	{
	greetPlayer();
	generateRandomNumber();
		while(lose == 1)
		{
		initiateGuessingSequence();	
		}
	}
	
public static String greetPlayer()
	{
	System.out.println("Hello! What is your name?");
	Scanner userInput1 = new Scanner(System.in);
	playerName = userInput1.nextLine();
	System.out.println("It is nice to meet you, " + playerName + "! I hope that you enjoy the game.");
	return playerName;
	}

public static int generateRandomNumber()
	{
	System.out.println("I am thinking of a number in between 1 and 20.");
	number = (int)(Math.random()*20) + min;
	return number;
	}

public static int initiateGuessingSequence()
	{
	System.out.println("Guess the number!");
	Scanner userInput2 = new Scanner(System.in);
	guess = userInput2.nextInt();
	
	if(guess == number)
		{
		System.out.println("YOU WIN!");
		System.out.println("Congratulations, " + playerName + "!");
		System.out.println("It took you " + fail + " tries to guess the number!");
		lose = lose - 1;
		}
	else if (guess < number)
		{
		System.out.println("Sorry, " + playerName + ", you guessed too low! Guess again.");
		fail = fail + 1;
		}
	else 
		{
		System.out.println("Sorry, " + playerName + ", you guessed too high! Guess again.");
		fail = fail + 1;
		}
	return guess;
	
	}

}
