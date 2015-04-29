
import java.util.Scanner;

public class HelloName 
	{
	public static void main(String[] args) 
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userInput.nextLine();
			if(name.equals("Will"))
				{
				System.out.println("Hello, " + name + "!");
				System.out.println();
				}
			else
				{
				System.out.println("You have an interesting name!");
				System.out.println();
				}
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("What is your favorite color??");
		System.out.println("Chose 1 for blue, 2 for green, or 3 for red.");
		int color = userInput.nextInt();
			if(color == 1)
				{
				System.out.println("I don't like blue.");
				System.out.println();
				}
			else
				{
				System.out.println("I like that color also!");
				System.out.println();
				}
		Scanner userInput2 = new Scanner (System.in);
		System.out.println("What is your favorite subject???");
		System.out.println("Type 1 for math, 2 for English, or 3 for Science.");
		int favoriteSubject = userInput2.nextInt();
			if(favoriteSubject == 1)
				{
				System.out.println("I knew I liked you!");
				}
			else
				{
				System.out.println("I hate that subject!");
				System.out.println();
				}
		
		}
}
