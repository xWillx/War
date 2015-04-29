import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class Bintroduction {

static String nameOfPlayer, test;
static int x = 0;

	public static void introduceMe()
	{
	System.out.println("You wake up in your bed in a dimly lit cavern. It is sparsely lit by torches");
	System.out.println();
	delayOneSecond();
	System.out.println("Your surroundings hint that you are no longer on earth.");
	System.out.println();
	delayOneSecond();
	System.out.println("DARN IT! MY BED MOVED AGAIN! I REALLY HAVE TO GET THIS FIXED!");
	System.out.println();
	delayOneSecond();
	System.out.println("'Ho, traveller! who are you?' someone behind you asks");
	System.out.println();
	delayOneSecond();
	System.out.println("Type in your name");
	Scanner userInput1 = new Scanner(System.in);
	nameOfPlayer = userInput1.nextLine();
	System.out.print(nameOfPlayer + ", ");	
	if(nameOfPlayer.equals("will"))
		{
		System.out.print("'I like you already!' - your guide says");
		System.out.println();
		x++;
		}
	else
		{
		System.out.print("We'll see if we can get over our differences.' your giude says. 'come now.'");
		System.out.println();
		}
	System.out.println();
	delayOneSecond();
	System.out.println("'What is your name?' you ask.");
	System.out.println();
	delayOneSecond();
	System.out.println("'Wave.' your guide replies.");
	System.out.println();
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
