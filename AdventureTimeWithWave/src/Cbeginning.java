import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Cbeginning {

	static String nameOfPlayer, test;
	static int x = 0;
	static int rubber = 0;
	static int fire = 0;
	static int choiceToSlayTheRubberDuckBeast;
	static int runOrFightFromTheGiantArmadillo;
	static int retry = 1;
	
	public static void beginningStuff()
	{
	delayOneSecond();
	delayOneSecond();
	System.out.println("You come across a MASSIVE rubber duck.");
	System.out.println();
	delayOneSecond();
	System.out.println("'Do you want to tame this glorious beast, or kill it to loot it for plunder?' Wave asks.");
	System.out.println();
	delayOneSecond();
	while(choiceToSlayTheRubberDuckBeast != 1 && choiceToSlayTheRubberDuckBeast != 2)
		{
		System.out.println("Type 1 to tame the beast or 2 to loot it");
		Scanner userInput2 = new Scanner(System.in);
		choiceToSlayTheRubberDuckBeast = userInput2.nextInt();
		if(choiceToSlayTheRubberDuckBeast == 1)
			{
			System.out.println("Wave -'you have gained a loyal and valuable companion. Did I mention that it can also breathe fire?'");
			delayOneSecond();
			System.out.println("you have gained fire!");
			fire = fire + 50;
			x++;
			}
		else if(choiceToSlayTheRubberDuckBeast == 2)
			{
			System.out.println("Wave - 'You cruel and dirty disgrace to humanity! Fine, do as you wish then.'");
			System.out.println();
			delayOneSecond();
			System.out.println("you gained 10 rubber.");
			rubber = rubber + 10;
			}
		else
			{
			System.out.println("Wave - 'You fool. That is not an option. Choose again.'");
			delayOneSecond();
			System.out.println();
			}
		}
	delayOneSecond();
	System.out.println("You continue on...");
	System.out.println();
	delayOneSecond();
	System.out.println("'Where am I?' you ask.");
	delayOneSecond();
	System.out.println();
	System.out.println("'Texas' Wave says");
	System.out.println();
	delayOneSecond();
	System.out.println("'Oh okay, that makes sense now.' you say.");
	delayOneSecond();
	System.out.println();
	System.out.println("Suddenly, Wave stops dead in his tracks. You look to see what has caused the holdup.");
	delayOneSecond();
	System.out.println();
	System.out.println("You turn around and..");
	delayOneSecond();
	System.out.println();
	System.out.println("ITS A GIANT ARMADILLO!! ITS TEXAS'S MOST BELOVED STATE ANIMAL. AND IT WANTS TO KILL YOU!");
	delayOneSecond();
	System.out.println();
	delayOneSecond();
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
