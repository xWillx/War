
import java.util.Scanner;
public class Arrays 
{
	static int sum;
	static int average;
	static int monthChoice;
	static int randomSuit;
	static int randomNumber;
	

	public static void main(String[] args) 
	{
	String[]elementList = {"Carbon", "Oxygen", "Beryllium", "Nitrogen", "Helium", "Aluminum"};
	System.out.println(elementList[3]);
	System.out.println();
	
	int[]numberList = {0, 1, 2, 3, 4, 5, 6};
	System.out.println(numberList[numberList.length - 1]);
	System.out.println();
	
	for(int i = 0; i < 7; i++)
		{
		System.out.println(numberList[i]);
		sum = sum + i;
		}
	int average = sum / numberList.length;
	System.out.println();
	System.out.println("The average is " + average + ".");
	System.out.println();
	System.out.println();
	
	int[]twoTwenty = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

	for(int i = 0; i<10; i++)
		{
		System.out.println(twoTwenty[i] * twoTwenty[i]);
		}
	
	System.out.println();
	System.out.println();
	String[]monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	System.out.println("Give me the number of the month, and I will name the month for you.");
	Scanner userInput1 = new Scanner(System.in);
	int monthChoice = userInput1.nextInt();
	System.out.println(monthNames[monthChoice - 1]);
	System.out.println();
	System.out.println();
	
	String[]cardSuits = {"hearts", "clubs", "diamonds", "spades"};
	// 0 - 3
	String[]cardNumbers = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	// 0 - 12
	randomSuit = (int)(Math.random() * 4);
	randomNumber = (int)(Math.random() * 13);
	System.out.println("Your card is:");
	System.out.println(cardNumbers[randomNumber] + " of " + cardSuits[randomSuit]);
	}
}
