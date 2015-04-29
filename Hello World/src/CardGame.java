
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class CardGame 
{

static String[] listOfCards = 
	{"ace of diamonds", "king of diamonds", "queen of diamonds", "jack of diamonds", 
	"ten of diamonds", "nine of diamonds", "eight of diamonds", "seven of diamonds",
	"six of diamonds", "five of diamonds", "four of diamonds", "three of diamonds", 
	"two of diamonds", 
	"ace of spades", "king of spades", "queen of spades", "jack of spades", 
	"ten of spades", "nine of spades", "eight of spades", "seven of spades", 
	"six of spades", "five of spades", "four of spades", "three of spades", 
	"two of spades", 
	"ace of clubs", "king of clubs", "queen of clubs", "jack of clubs", 
	"ten of clubs", "nine of clubs", "eight of clubs", "seven of clubs", 
	"six of clubs", "five of clubs", "four of clubs", "three of clubs", 
	"two of clubs", 
	"ace of hearts", "king of hearts", "queen of hearts", "jack of hearts", 
	"ten of hearts", "nine of hearts", "eight of hearts", "seven of hearts", 
	"six of hearts", "five of hearts", "four of hearts", 
	"three of hearts", "two of hearts"};
static ArrayList<String> deck = new ArrayList<String>();
static int to21 = 0;
static String currentCard;
static int cardValue;
static int addCard;
static int continueChoice = 1;

public static void main(String[] args) 

	{
	System.out.println("Lets play a game of 21!");
	System.out.println();
	System.out.println();
	while(continueChoice == 1)
	{
	for(String cards : listOfCards)
		{
		deck.add(cards);
		}
	
	Collections.shuffle(deck);
	currentCard = deck.get(0);
	System.out.println(currentCard);
	
	switch(currentCard)
		{
	case "ace of diamonds":
	case "ace of hearts":
	case "ace of clubs":
	case "ace of spades":
		{
		cardValue = 1;
		break;
		}
	case "king of diamonds":
	case "king of hearts":
	case "king of clubs":
	case "king of spades":
		{
		cardValue = 13;
		break;
		}
	case "queen of diamonds":
	case "queen of hearts":
	case "queen of clubs":
	case "queen of spades":
		{
		cardValue = 12;
		break;
		}
	case "jack of diamonds":
	case "jack of hearts":
	case "jack of clubs":
	case "jack of spades":
		{
		cardValue = 11;
		break;
		}
	case "ten of diamonds":
	case "ten of hearts":
	case "ten of clubs":
	case "ten of spades":
		{
		cardValue = 10;
		break;
		}
	case "nine of diamonds":
	case "nine of hearts":
	case "nine of clubs":
	case "nine of spades":
		{
		cardValue = 9;
		break;
		}
	case "eight of diamonds":
	case "eight of hearts":
	case "eight of clubs":
	case "eight of spades":
		{
		cardValue = 8;
		break;
		}
	case "seven of diamonds":
	case "seven of hearts":
	case "seven of clubs":
	case "seven of spades":
		{
		cardValue = 7;
		break;
		}
	case "six of diamonds":
	case "six of hearts":
	case "six of clubs":
	case "six of spades":
		{
		cardValue = 6;
		break;
		}
	case "five of diamonds":
	case "five of hearts":
	case "five of clubs":
	case "five of spades":
		{
		cardValue = 5;
		break;
		}
	case "four of diamonds":
	case "four of hearts":
	case "four of clubs":
	case "four of spades":
		{
		cardValue = 4;
		break;
		}
	case "three of diamonds":
	case "three of hearts":
	case "three of clubs":
	case "three of spades":
		{
		cardValue = 3;
		break;
		}
	case "two of diamonds":
	case "two of hearts":
	case "two of clubs":
	case "two of spades":
		{
		cardValue = 2;
		break;
		}
	default:
		{
			
		}
	}
	to21 = to21 + cardValue;
	
	if(to21 < 21)
		{
		System.out.println("You now have " + to21);
		System.out.println("You need " + (21 - to21) + " more to get to 21!");
		}
	else if(to21 == 21)
		{
		System.out.println("YOU WIN!");
		System.exit(0);
		}
	else
		{
		System.out.println("You now have " + to21 + "!");
		System.out.println("You went " + (to21 - 21) + " over 21!");
		System.out.println("You lose! Game over.");
		System.exit(0);
		}
	
	System.out.println("Press 1 to continue.");
	Scanner userInput1 = new Scanner(System.in);
	continueChoice = userInput1.nextInt();
	
	
	if(continueChoice == 1)
		{
		continueChoice = continueChoice;
		}
	else
		{
		continueChoice = continueChoice - 1;
		}
	}
	}
}




