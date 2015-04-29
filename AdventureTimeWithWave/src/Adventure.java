import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Adventure 
	{
	static String nameOfPlayer, test;
	static int x = 0;
	static int rubber = 0;
	static int fire = 0;
	static int choiceToSlayTheRubberDuckBeast;
	static int runOrFightFromTheGiantArmadillo;
	static int retry = 1;

	public static void main(String[] args) 
		{
			{
			Bintroduction.introduceMe();
			Cbeginning.beginningStuff();
			DarmadilloChoice.armadilloChoiceRunOrFight();
			EchoiceOfDestiny.conversation();
			FMainBeginning.DemonMonster();
			}
		}
		
	
	
	public static void delayOneSecond()
		{
		try
			{
			TimeUnit.SECONDS.sleep(2);
			}
		catch (InterruptedException e)
			{
			
			}
		}
	
	
	
		}
	
	