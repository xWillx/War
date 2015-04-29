import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class FMainBeginning
{
	static String nameOfPlayer, test;
	static int x = 0;
	static int rubber = 0;
	static int fire = 0;
	static int choiceToSlayTheRubberDuckBeast;
	static int runOrFightFromTheGiantArmadillo;
	static int retry = 1;
	static int bush;
	static int death;
	static int sword;
	
	public static void DemonMonster()
	{
	System.out.println("You feel content with your decision. You know you have made the right choice");
	delayOneSecond();
	System.out.println();
	System.out.println("Wave smiles broadly.");
	delayOneSecond();
	System.out.println();
	System.out.println("Come, " + nameOfPlayer + "I'll take you to our base to introduce you to everyone.");
	delayOneSecond();
	System.out.println();
	System.out.println("You walk across the arid ground under the dazzling blue sky...");
	delayOneSecond();
	System.out.println();
	System.out.println("'So, those monsters we fought just now..' You ask, 'Are there worse things?'");
	delayOneSecond();
	System.out.println();
	System.out.println("A shadow passes over waves face and (...fear?) registers on his face.");
	delayOneSecond();
	System.out.println();
	System.out.println("You do not need him to tell you the answer.");
	delayOneSecond();
	System.out.println();
	System.out.println("As you walk farther through the endless wasteland, the base comes into view. There is a landscape of sparse shrubs and small plateaus aroung the small cluster of buildings.");
	delayOneSecond();
	System.out.println();
	System.out.println("But there is something wrong about it..");
	delayOneSecond();
	System.out.println();
	System.out.println("But you cant quite place a finger on what it is.");
	delayOneSecond();
	System.out.println();
	System.out.println("You begin to feel uneasy again");
	delayOneSecond();
	System.out.println();
	System.out.println("Wave speaks your mind. - 'Something feels wrong' He says.");
	delayOneSecond();
	System.out.println();
	System.out.println("You realize why the base seems so strange. It is completely, unnervingly silent.");
	delayOneSecond();
	System.out.println();
	System.out.println("- 'Stay here.' Wave tells you.");
	System.out.println("Wave walks around the foremost building of the base and disappears from sight.");
	delayOneSecond();
	System.out.println();
	System.out.println("You wait...");
	delayOneSecond();
	System.out.println();
	System.out.println("And wait...");
	delayOneSecond();
	System.out.println();
	System.out.println("Wave is not coming back.");
	delayOneSecond();
	System.out.println();
	System.out.println("Dread creeps into your body again, making you feel faint.");
	delayOneSecond();
	System.out.println();
	System.out.println("(...There is something behind me..)");
	delayOneSecond();
	System.out.println();
	System.out.println("You hear something in the bushes behind you!");
	delayOneSecond();
	System.out.println();
	
	while(bush != 1 && bush != 2)
	{
	System.out.println("Type 1 to turn and fight the thing in the bushes or 2 to run for the town!");

	Scanner userInput5 = new Scanner(System.in);
	int bush = userInput5.nextInt();
		if(bush == 1 && rubber < 5)
			{
			System.out.println("You call for your steed!");
			delayOneSecond();
			System.out.println();
			System.out.println("Wherever your steed is, it is not responding to your calls.");
			System.out.println("You creep towards the thing in the bush..");
			delayOneSecond();
			System.out.println();
			System.out.println("Death seems to hang in the air.");
			delayOneSecond();
			System.out.println();
			System.out.println("... - (why am i so nervous?)");
			delayOneSecond();
			System.out.println();
			System.out.println("- 'Who's there?' you say stupidly.");
			delayOneSecond();
			System.out.println();
			System.out.println("- 'Stop being stupid, " + nameOfPlayer + ".' You tell yourself. Whatever is in the bush is not going to reply to me.");
			delayOneSecond();
			System.out.println();
			System.out.println("'Your fear, incarnated.' whispers an ancient voice from the bush");
			delayOneSecond();
			System.out.println();
			System.out.println("You nearly jump out of your skin. Your breath begins to come in gasps.");
			delayOneSecond();
			System.out.println();
			System.out.println("Suddenly, you can feel the creature pulling thoughts from the darkest corners of your mind");
			delayOneSecond();
			System.out.println();
			System.out.println("Desparate terror rises into your throat as you see terrible things, disturbing things...");
			delayOneSecond();
			System.out.println();
			System.out.println("The creature draws nearer, and your thoughts become clouded in a blind panic");
			delayOneSecond();
			System.out.println();
			}
		else if(bush == 1 && rubber == 10)
			{
			System.out.println("You creep towards the thing in the bush..");
			delayOneSecond();
			System.out.println();
			System.out.println("Death seems to hang in the air.");
			delayOneSecond();
			System.out.println();
			System.out.println("... - (why am i so nervous?)");
			delayOneSecond();
			System.out.println();
			System.out.println("- 'Who's there?' you say stupidly.");
			delayOneSecond();
			System.out.println();
			System.out.println("'Your fear incarnated.' whispers an ancient voice from the bush");
			delayOneSecond();
			System.out.println();
			System.out.println("You nearly jump out of your skin. Your breath begins to come in gasps.");
			delayOneSecond();
			System.out.println();
			System.out.println("Suddenly, you can feel the creature pulling thoughts from the darkest corners of your mind");
			delayOneSecond();
			System.out.println();
			System.out.println("Terrible things arise in your concousness. Fear, death, suffering, and still worse things.");
			delayOneSecond();
			System.out.println();
			System.out.println("The creature draws nearer, and your thoughts become clouded in a blind panic.");
			}
		else if(bush == 2)
			{
			System.out.println("Not wanting to face whatever is in the bushes, you run into the town!");
			System.exit(0);
			}
		else
			{
			System.out.println("You fool, that is not an option. Choose again.");
			}
	
	
	while(death != 1 && death != 2)
		{
		System.out.println("Type 1 to reach for your rosary or 2 to reach for your sword!");
		Scanner userInput6 = new Scanner(System.in);
		death = userInput6.nextInt();
		if(death == 1)
			{
			System.out.println("Your hand closes around your rosary...");
			delayOneSecond();
			System.out.println();
			System.out.println("(... Mary help me... )");
			delayOneSecond();
			System.out.println();
			System.out.println("No, don't bring your mom into this! Nooooo!");
			delayOneSecond();
			System.out.println();
			System.out.println("It fades away");
			System.exit(0);
			}
		else if(death == 2)
			{
			System.out.println("Your hand closes around your sword.");
			delayOneSecond();
			System.out.println();
			System.out.println("You pull it out, and, facing the creature, you try and muster your courage.");
			delayOneSecond();
			System.out.println();
			System.out.println("The creature is constantly shifting like swirling darkness, into terryfying, disgusting forms.");
			delayOneSecond();
			System.out.println();
			System.out.println("'uhhh.. Back off, you jerk!' you say");
			delayOneSecond();
			System.out.println();
			System.out.println("(...why the heck would I say that?)");
			delayOneSecond();
			System.out.println();
			System.out.println("The creature snarls angrily.");
			delayOneSecond();
			System.out.println();
			System.out.println("It turns its anger on you.");
			delayOneSecond();
			System.out.println();
			System.out.println("You f**cking idiot, you can't f**king fight me with a sword! I will kill you now.");
			System.out.println();
			
				while(sword!= 1 && sword != 2)
				{
			
					System.out.println("Hit 1 to run or 2 to kill this guy!");
					Scanner userInput7 = new Scanner(System.in);
					sword = userInput7.nextInt();
					if(sword == 1)
							{
							System.out.println("You scramble to your feet and turn to run.");
							System.out.println();
							delayOneSecond();
							System.out.println("You get away!");
							System.exit(0);
							}
					else if(sword == 2)
						{
						System.out.println("Haha!");
						System.out.println();
						delayOneSecond();
						System.out.println("A revolver pistol materializes in your hand.");
						delayOneSecond();
						System.out.println();
						System.out.println("You think that the creature has made a mistake.");
						delayOneSecond();
						System.out.println();
						System.out.println("But with a wave of fear, you realize that you are loading the pistol");
						delayOneSecond();
						System.out.println();
						System.out.println("You feel your arm raise the gun to your head and squeeze the trigger...");
						delayOneSecond();
						System.out.println();
						System.out.println("YOU DIED!");
						System.exit(0);
						}
					else
						{
						System.out.println("You fool. That is not an option. Choose again.");
						}
			}
			}
		else
			{
			System.out.println("You fool. That is not an option. Choose again.");
			}
		}
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
