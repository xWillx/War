
import java.util.Scanner;
public class CrapsGame

{
static int dice1 = (int)(Math.random() * 6+1);
static int dice2 = (int)(Math.random() *6+1);
static int result = dice1 + dice2;
static int point = 0;
static int dice = 0;
static String name;

	public static void main(String[] args) 
	{
	rollFirstTurn();
	rollSecondTurn();
	}
	
	public static void rollFirstTurn()
	{
	System.out.println("Hello! What is your name?");
	Scanner userInput = new Scanner(System.in);
	String name = userInput.nextLine();
	System.out.println();
	System.out.println("Roll the dice!");
	System.out.println("You rolled a " + result + ".");
	
	while(point == 0)
		{
		switch (result)
		{
		case 2:
		case 12:
			{
			System.out.println("You lose, " + name + "!");
			System.exit(0);
			}
		case 7:
		case 11:
			{
			System.out.println("Nice job, " + name + ", you win instantly!!");
			System.exit(0);
			}
		default:
			{
			System.out.println("Your number, " + result + ", has become 'the point.'");
			point = point + 1;
			dice = dice + result;
			}
		}
		}
	}
	
	
public static void rollSecondTurn()
{
	while(point == 1)
		{
		System.out.println("Now, " + name + ", your point is " + result + ".");
		System.out.println("You need to roll this point to win. ");
		System.out.println("If you roll a 7, then you lose.");
		System.out.println();
		System.out.println("Roll the dice!");
		System.out.println("You rolled a " + result + "!");
		if (result == 7)
			{
			System.out.println("You lose, " + name + "!");
			System.exit(0);
			}
		else if (result == dice)
			{
			System.out.println("You win, " + name + "!");
			System.exit(0);
			}
		else
			{
			System.out.println("Roll again, " + name + ".");
			}
			}
		}
}





