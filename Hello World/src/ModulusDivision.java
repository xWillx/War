
import java.util.ArrayList;
import java.util.Scanner;
public class ModulusDivision 
{
static int inputOdd;
static int yearInput;
static ArrayList <Integer> thirdPrinting = new ArrayList <Integer>( );

	public static void main(String[] args) 
	{
	numberTester();
		System.out.println();
	leapYearFinder();
		System.out.println();
	thirdNumber();
		System.out.println();
	fizzBuzz();
	}
	
	
public static void numberTester()
	{
	System.out.println("Input a number!");
	Scanner userInput1 = new Scanner(System.in);
	inputOdd = userInput1.nextInt();
	if(inputOdd % 2 == 0)
		{
		System.out.println("Your number is even.");
		}
	else
		{
		System.out.println("Your number is odd.");
		}

	}

public static void leapYearFinder()
	{
	System.out.println("Input a year!");
	Scanner userInput2 = new Scanner(System.in);
	yearInput = userInput2.nextInt();
	if (yearInput % 4 == 0)
		{
		System.out.println("This year is a leap year!");
		}
	else
		{
		System.out.println("This year is not a leap year.");
		}
	}

public static void thirdNumber()
	{
	thirdPrinting.add(2);
	thirdPrinting.add(5);
	thirdPrinting.add(-7);
	thirdPrinting.add(1);
	thirdPrinting.add(3);
	thirdPrinting.add(12);
	thirdPrinting.add(19);
	thirdPrinting.add(-16);
	thirdPrinting.add(4);
	thirdPrinting.add(20);
	
	for(int i = 0; i < thirdPrinting.size(); i++ )
		{
		if((i + 1)  % 3 == 0)
			{
			System.out.println(thirdPrinting.get(i));
			}
		}
	}

public static void fizzBuzz()
	{	
	for(int i = 0; i <= 100; i++)
		{
		if(i % 3 == 0 && i % 5 == 0)
			{
			System.out.println("FizzBuzz");
			}
		else if(i % 3 == 0)
			{
			System.out.println("Fizz");
			}
		else if (i % 5 == 0)
			{
			System.out.println("Buzz");
			}
		
		else
			{
			System.out.println(i);
			}
		}
	}

}
