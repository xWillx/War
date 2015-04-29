import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class FirstCumulativeProject
{

static String userName;
static int compliment;
static int choiceNumber;
static int min = 0;

static ArrayList<String> complimentGenerator = new ArrayList<String>();
static ArrayList<String> choicesInput = new ArrayList<String>();

	// ask the user their name and give them a random compliment XX
	// ask how many choices they are trying to decide between XX
	// instantiate a String array with that number of indices XX
	// have the user input the choices one at a time XX
	// their choices should fill the array you just created XX
	// generate a random number from 0 to the last index of your array XX
	// report which item in the array they “should” choose, calling the user by name XX
	
	public static void main(String[] args) 
		{
		System.out.println("Hello! What is your name?");
		Scanner userInput1 = new Scanner(System.in);
		String userName = userInput1.nextLine();
	
		complimentGenerator.add("Looking good today, " + userName + "!");
		complimentGenerator.add("You've been working out lately, " + userName + "!");
		complimentGenerator.add("Looking fashionable, " + userName + "!");
		
		compliment = 0 + (int) (Math.random()*complimentGenerator.size() - 1) + min;
				 
		System.out.println(complimentGenerator.get(compliment));
		
		// DONE
		
		System.out.println();
		System.out.println("What are you thinking about doing today?");
		System.out.println("How many activities are you trying to decide between?");
		Scanner userInput2 = new Scanner(System.in);
		int choiceNumber = userInput2.nextInt();
		System.out.println("Okay, tell me the choices:");
		System.out.println();
		
		
		for(int i = 0; i < choiceNumber; i++ )
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Tell me activity " + (i + 1) + ":");
			String choice = userInput.nextLine();  
			choicesInput.add(choice);
			}
		
		int choiceFeedback = 0 + (int) (Math.random()* choiceNumber - 1) + min;
		System.out.println("Hmm, yes, let me see...");
		System.out.println();
		System.out.println(userName + ", you should choose to:");
		System.out.println(choicesInput.get(choiceFeedback));
		// DONE
		
		}
}
