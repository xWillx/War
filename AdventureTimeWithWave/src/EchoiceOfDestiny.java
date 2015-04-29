import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class EchoiceOfDestiny {
	static String nameOfPlayer, test;
	static int x = 0;
	static int rubber = 0;
	static int fire = 0;
	static int choiceToSlayTheRubberDuckBeast; 
	static int runOrFightFromTheGiantArmadillo;
	static int retry = 1;
	static int destiny;
	public static void conversation()
	{
	System.out.println("Your guide shows you through a naturally hewn tunnel that has an upward slope. There is daylight streaming from the end of the tunnel. ");
	delayOneSecond();
	System.out.println();
	System.out.println("You clamber out of the caverns and into the dry heat and startlingly bright daylight.");
	delayOneSecond();
	System.out.println();
	System.out.println("You feel the dry air of Texas, but that is all that is the same.");
	delayOneSecond();
	System.out.println();
	System.out.println("'This...this feels different...foreign somehow' You say.");
	delayOneSecond();
	System.out.println();
	System.out.println("Wave's expression saddens but he shows understanding.");
	delayOneSecond();
	System.out.println();
	System.out.println("Things have changed," + nameOfPlayer + ". People have changed." );
	delayOneSecond();
	System.out.println();
	System.out.println("People have grown to be selfish. Our civilization has forgotten about God.");
	delayOneSecond();
	System.out.println();
	System.out.println("You now notice what feels different. The animal bones laying on the cracked desert are...human. You shudder");
	delayOneSecond();
	System.out.println();
	System.out.println("'How bad is it?' - you ask, a sense of dread creeping into your thoughts, making the desert seem more sinister.");
	delayOneSecond();
	System.out.println();
	System.out.println("'Bad.' Wave says.");
	delayOneSecond();
	System.out.println();
	System.out.println("'Has God completely vansihed?' you ask, fearing what the reply nmight be.");
	delayOneSecond();
	System.out.println();
	System.out.println("A smile creeps across Wave's face.");
	delayOneSecond();
	System.out.println("'Hardly.' he says.");
	delayOneSecond();
	System.out.println();
	System.out.println("'I lead a group of Catholics in this region. We are some of the only ones left.'");
	delayOneSecond();
	System.out.println();
	System.out.println("'In the year 2314, Catholocism was outlawed by penalty of death.'");
	delayOneSecond();
	System.out.println();
	System.out.println("'We live as outcasts, camping in deserted areas or staying in the houses of those who are willing to hide us.'");
	delayOneSecond();
	System.out.println();
	System.out.println("Your admiration for your guide swells. What better a man is there than one who stands by God?");
	delayOneSecond();
	System.out.println();
	System.out.println("'Where is everyone else then?' - you ask.");
	delayOneSecond();
	System.out.println();
	System.out.println("'Our head of combat, Nathaniel, is out leading another unit. Everyone else is at base camp.'");
	delayOneSecond();
	System.out.println();
	System.out.println("After a while of walking in silence, Wave speaks again:");
	delayOneSecond();
	System.out.println();
	System.out.println("You could join us, you know.");
	delayOneSecond();
	System.out.println();
	System.out.println("'...What do you mean?' You ask.");
	delayOneSecond();
	System.out.println();
	System.out.println("I mean you could join us. Become one of us. We need new members.");
	delayOneSecond();
	System.out.println();
	System.out.println("'Like, now?' you ask.");
	delayOneSecond();
	System.out.println();
	System.out.println("'Is there another time?' Wave replies.");
	delayOneSecond();
	System.out.println();
	System.out.println("'No, I guess there isn't.' You admit");
	delayOneSecond();
	System.out.println();
	System.out.println("'Do you have an answer then?' Wave asks.");
	delayOneSecond();
	System.out.println();
	System.out.println("You think about the life that you could go back to.");
	delayOneSecond();
	System.out.println();
	System.out.println("You think about the small, dirty apartment in downtown New York that you live alone in.");
	delayOneSecond();
	System.out.println();
	System.out.println("You think about all of the loved ones in your life that have died.");
	delayOneSecond();
	System.out.println();
	System.out.println("You think about all of the people who don't appreciate you for who you are.");
	delayOneSecond();
	System.out.println();
	System.out.println("You think about all of the people who ridicule you for being Catholic.");
	delayOneSecond();
	System.out.println();
	System.out.println("You think about all of the times you yearned for an opportunity, just one opportunity, to do something great.");
	delayOneSecond();
	System.out.println();
	System.out.println("You sigh.");
	delayOneSecond();
	System.out.println();
	System.out.println("'...Well...?' Wave brings you out of your reminiscince.");
	delayOneSecond();
	System.out.println();
	System.out.println("Type 1 to go home or 2 to join the revolution!");
	Scanner userInput4 = new Scanner(System.in);
	destiny = userInput4.nextInt();
	if(destiny == 1)
		{
		System.out.println("'Fine. As you wish then, I will lead you back.'");
		delayOneSecond();
		delayOneSecond();
		System.out.println();
		System.out.println("Man, if you really chose to go home then theres not much I can do for you at this point in terms of a game. Good luck.");
		delayOneSecond();
		System.out.println();
		System.out.println("GAME OVER");
		}
	else if(destiny == 2)
		{
		System.out.println("Wave breaks into a smile.");
		delayOneSecond();
		System.out.println();
		System.out.println("We're grateful to have you.");
		delayOneSecond();
		System.out.println();
		System.out.println("Come with me...");
		delayOneSecond();
		System.out.println();
		System.out.println("...and you walk off.");
		delayOneSecond();
		System.out.println();
		System.out.println("Get ready for an adventure...");
		delayOneSecond();
		System.out.println();
		System.out.println("Get ready for a wild journey!");
		delayOneSecond();
		System.out.println();
		System.out.println("GET READY TO FIGHT THE GOOD FIGHT!");
		delayOneSecond();
		System.out.println();
		System.out.println("INSERT A COIN FIRST!");
		delayOneSecond();
		System.out.println();
		System.out.println("Welcome to a new style of game.");
		delayOneSecond();
		System.out.println();
		System.out.println("Get ready for THE CALL OF TIME.");
		delayOneSecond();
		System.out.println();
		System.out.println("P1 START");
	}
	}
	public static void delayOneSecond()
	{
	try
		{
		TimeUnit.SECONDS.sleep(0);
		}
	catch (InterruptedException e)
		{
		
		}
	}
}
