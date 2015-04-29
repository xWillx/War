
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class War 
{
static private int continuing = 1;
static private int aScore = 26;
static private int bScore = 26;
static private int warTrue = 0;
static private int addWar = 0;

	public static void main(String[] args) 
	{
	while(aScore >= 0 && bScore >= 0 && continuing == 1)
		{
		addCards();
		goToWar();	
		askToContinue();
		}
	}
	
	
public static void addCards()
	{
	Card.addHearts();
	Card.addSpades();
	Card.addClubs();
	Card.addDiamonds();
	Card.shuffleCards();
	}

public static void goToWar()
	{
	
	int playerAcurrentCard = Card.cardDeck.get(0).getValue();
	int playerBcurrentCard = Card.cardDeck.get(1).getValue();
	System.out.println(Card.cardDeck.get(0).getRank());
	System.out.println(Card.cardDeck.get(1).getRank());

	
	System.out.println(playerAcurrentCard);
	System.out.println(playerBcurrentCard);
	System.out.println("You drew a " + Card.cardDeck.get(0).getRank() +" of " + Card.cardDeck.get(0).getSuit() + "!");
	System.out.println("The computer drew a " + Card.cardDeck.get(1).getRank() +" of " + Card.cardDeck.get(1).getSuit() + "!");
	
		if(playerAcurrentCard > playerBcurrentCard)
			{
			System.out.println("You win this round!");
			System.out.println();
			bScore = bScore - 1;
			System.out.println("You now have " + aScore + "!");
			System.out.println("The computer now has " + bScore + "!");
				Card.cardDeck.remove(0);
				Card.cardDeck.remove(1);
			}
		else if(playerAcurrentCard < playerBcurrentCard)
			{
			System.out.println("You lose this round!");
			aScore = aScore - 1;
			System.out.println("You now have " + aScore + "!");
			System.out.println("The computer now has " + bScore + "!");
				Card.cardDeck.remove(0);
				Card.cardDeck.remove(1);
			}
		else
			{
			System.out.println("Its a tie!");
			System.out.println("No one loses any points.");
			Card.cardDeck.remove(0);
			Card.cardDeck.remove(1);
			}
		
	}

public static void askToContinue()
	{
	System.out.println("Press 1 to continue.");
	Scanner userInput1 = new Scanner(System.in);
	int decision = userInput1.nextInt();
	
	if(decision == 1)
		{
		 
		}
	else
		{
		continuing = continuing - 1;
		}	
	}
}




