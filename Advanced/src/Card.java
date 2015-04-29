import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collections;

public class Card
{
	
static ArrayList <Card> cardDeck = new ArrayList <Card>( );

private String rank;
static int value;
private String suit;

	public Card(String r, int v, String s)
	{
	rank = r;
	value = v;
	suit = s;
	}
	
// ADD CARDS	
public static ArrayList addHearts()
		{
		cardDeck.add(new Card ("Two", 2, "Hearts"));
		cardDeck.add(new Card ("Three",3 , "Hearts"));
		cardDeck.add(new Card ("Four", 4, "Hearts"));
		cardDeck.add(new Card ("Five", 5, "Hearts"));
		cardDeck.add(new Card ("Six", 6, "Hearts"));
		cardDeck.add(new Card ("Seven", 7, "Hearts"));
		cardDeck.add(new Card ("Eight", 8, "Hearts"));
		cardDeck.add(new Card ("Nine", 9, "Hearts"));
		cardDeck.add(new Card ("Ten", 10, "Hearts"));
		cardDeck.add(new Card ("Jack", 11, "Hearts"));
		cardDeck.add(new Card ("Queen", 12, "Hearts"));
		cardDeck.add(new Card ("King", 13, "Hearts"));
		cardDeck.add(new Card ("Ace", 14, "Hearts"));
		return cardDeck;
		}
public static ArrayList addSpades()
		{
		cardDeck.add(new Card ("Two", 2, "Spades"));
		cardDeck.add(new Card ("Three",3 , "Spades"));
		cardDeck.add(new Card ("Four", 4, "Spades"));
		cardDeck.add(new Card ("Five", 5, "Spades"));
		cardDeck.add(new Card ("Six", 6, "Spades"));
		cardDeck.add(new Card ("Seven", 7, "Spades"));
		cardDeck.add(new Card ("Eight", 8, "Spades"));
		cardDeck.add(new Card ("Nine", 9, "Spades"));
		cardDeck.add(new Card ("Ten", 10, "Spades"));
		cardDeck.add(new Card ("Jack", 11, "Spades"));
		cardDeck.add(new Card ("Queen", 12, "Spades"));
		cardDeck.add(new Card ("King", 13, "Spades"));
		cardDeck.add(new Card ("Ace", 14, "Spades"));
		return cardDeck;
		}
public static ArrayList addDiamonds()
		{
		cardDeck.add(new Card ("Two", 2, "Diamonds"));
		cardDeck.add(new Card ("Three",3 , "Diamonds"));
		cardDeck.add(new Card ("Four", 4, "Diamonds"));
		cardDeck.add(new Card ("Five", 5, "Diamonds"));
		cardDeck.add(new Card ("Six", 6, "Diamonds"));
		cardDeck.add(new Card ("Seven", 7, "Diamonds"));
		cardDeck.add(new Card ("Eight", 8, "Diamonds"));
		cardDeck.add(new Card ("Nine", 9, "Diamonds"));
		cardDeck.add(new Card ("Ten", 10, "Diamonds"));
		cardDeck.add(new Card ("Jack", 11, "Diamonds"));
		cardDeck.add(new Card ("Queen", 12, "Diamonds"));
		cardDeck.add(new Card ("King", 13, "Diamonds"));
		cardDeck.add(new Card ("Ace", 14, "Diamonds"));
		return cardDeck;
		}
public static ArrayList addClubs()

		{
		cardDeck.add(new Card ("Two", 2, "Clubs"));
		cardDeck.add(new Card ("Three",3 , "Clubs"));
		cardDeck.add(new Card ("Four", 4, "Clubs"));
		cardDeck.add(new Card ("Five", 5, "Clubs"));
		cardDeck.add(new Card ("Six", 6, "Clubs"));
		cardDeck.add(new Card ("Seven", 7, "Clubs"));
		cardDeck.add(new Card ("Eight", 8, "Clubs"));
		cardDeck.add(new Card ("Nine", 9, "Clubs"));
		cardDeck.add(new Card ("Ten", 10, "Clubs"));
		cardDeck.add(new Card ("Jack", 11, "Clubs"));
		cardDeck.add(new Card ("Queen", 12, "Clubs"));
		cardDeck.add(new Card ("King", 13, "Clubs"));
		cardDeck.add(new Card ("Ace", 14, "Clubs"));
		return cardDeck;
		}

// GETTERS AND SETTERS
public ArrayList<Card> getCardDeck() 
{
return cardDeck;
}
public void setCardDeck(ArrayList<Card> cardDeck) 
{
cardDeck = cardDeck;
}
public String getRank() 
{
return rank;
}
public void setRank(String rank) 
{
this.rank = rank;
}
public int getValue()
{
return value;
}
public void setValue(int value) 
{
this.value = value;
}
public String getSuit() 
{
return suit;
}
public void setSuit(String suit) 
{
this.suit = suit;
}

// SHUFFLE CARDS
public static ArrayList shuffleCards()
{
Collections.shuffle(cardDeck);
return cardDeck;
}


}


