import java.util.Scanner;


public class GamblingInVegas 
{
static int contiunue = 1;
static int money = 100;
static int wager;

	public static void main(String[] args) 
	{
		// create and report the money balance of the user
		// ask for wager mount
		// check to see if wager <= money or if wager is > money
		// if they win:
		//		money = money + wager
		// if they lose:
		//		money = money - wager
		// report user's new money balance
	System.out.println("Hello! What is your name?");
	Scanner userInput1 = new Scanner(System.in);
	String name = userInput1.nextLine();
	System.out.println("It is nice to meet you, Mr. " + name + "!");
	System.out.println();
	
		while(contiunue == 1)
		{	
			System.out.println("Currently, you have " + money + " dollars.");
			System.out.println("How much would you like to wager?");
		Scanner userInput2  = new Scanner(System.in);
		wager = userInput2.nextInt();
			if(wager <= money && wager >= 0)
			{
			int outcome = (int)(Math.random() *8+1);
				if(outcome > 4)
					{
					System.out.println("You rolled a " + outcome + "!");
					System.out.println("You win, " + name + "!");
					money = money + wager;
					System.out.println("You now have " + money + "!");
					}
				else if(outcome <= 4)
					{
					System.out.println("You lose, " + name + "!");
					money = money - wager;
					System.out.println("You now have " + money + "!");
					}
				else
					{
					System.out.println();
					}
				System.out.println("Would you like to continue?");
				System.out.println("Hit 1 to continue, or 2 to exit.");
				Scanner userInput4 = new Scanner(System.in);
				int choice = userInput4.nextInt();
					if(choice == 1)
						{
						contiunue = 1;
						}
					else
						{
						System.out.println("Okay, bye " + name + "!");
						System.exit(0);
						}
			}
					
		else
			{
			System.out.println("CHEATER!!");
			System.out.println("You are not allowed to play anymore!");
			System.exit(0);
			}
		}
	}
	

	}


