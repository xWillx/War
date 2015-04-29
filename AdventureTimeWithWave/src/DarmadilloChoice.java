import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class DarmadilloChoice {

	static int runOrFightFromTheGiantArmadillo;
	static int retry = 1;
	static int rubber = 0;
	
	public static void armadilloChoiceRunOrFight()
	{
	System.out.println("Do you want to fight this monster, or run?" );
	System.out.println("type 3 to run or 4 to fight the hideous creature!");
	while(runOrFightFromTheGiantArmadillo != 3 && runOrFightFromTheGiantArmadillo != 4)
	{
	Scanner userInput3 = new Scanner(System.in);
	runOrFightFromTheGiantArmadillo = userInput3.nextInt();
	if(runOrFightFromTheGiantArmadillo == 3)
		{
		System.out.println("'Wise choice.' Wave says. 'To run is not always cowardly.'");
		delayOneSecond();
		System.out.println();
		System.out.println("You sprint away between two boulders as the beast howls in frustration.");
		retry = retry - 1;
		}
	else if(runOrFightFromTheGiantArmadillo == 4 && rubber != 10)
		{
		System.out.println("Fight then, brave one! Use your noble steed.");
		System.out.println();
		delayOneSecond();
		System.out.println("'Noble steed?' you ask.");
		System.out.println();
		delayOneSecond();
		System.out.println("'Your duck!' Wave replies. 'Duh.'");
		System.out.println();
		delayOneSecond();
		System.out.println("You jump on your duck, and with a ferocious, high-pitched 'SQQUEEEK!' the duck incinerates the creature with a ball of fire!");
		System.out.println();
		delayOneSecond();
		System.out.println("'Well done!' Wave says");
		delayOneSecond();
		System.out.println("You have gained burnt armadillo hide.");
		retry = retry - 1;
		}
	else if(runOrFightFromTheGiantArmadillo == 4 && rubber == 10)
		{
		System.out.println("Fight, brave one!");
		delayOneSecond();
		System.out.println();
		System.out.println("'Do I have something to fight with?' you ask.");
		delayOneSecond();
		System.out.println();
		System.out.println("'Oh yeah.' wave says. 'Hadn't thought about that.'");
		delayOneSecond();
		System.out.println("'Without that duck, it will be tough to fight this. But it is too late!'");
		delayOneSecond();
		System.out.println();
		System.out.println("'Try using your rubber?' Wave suggests.");
		delayOneSecond();
		System.out.println();
		System.out.println("You desperately throw a handful of rubber at the beast, but you miss terribly!");
		delayOneSecond();
		System.out.println();
		System.out.println("'Wow, just my luck!'");
		delayOneSecond();
		System.out.println();
		System.out.println("The beast lunges!");
		delayOneSecond();
		System.out.println();
		System.out.println("AAAHH!");
		System.out.println("*%#$!");
		delayOneSecond();
		System.out.println();
		System.out.println("YOU DIED!");
		System.out.println();
		delayOneSecond();
		System.out.println();
		delayOneSecond();
		System.out.println("PLAY AGAIN?");
		delayOneSecond();
		delayOneSecond();
		}
	else
		{
		System.out.println("Wave - 'You fool. That is not an option. Choose again.'");
		System.out.println("type 3 to run or 4 to fight the hideous creature!");
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
