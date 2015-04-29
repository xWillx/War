
import java.util.ArrayList;
import java.util.Collections;

public class FeverCheckArrayList 
{

static ArrayList <Double> myArray = new ArrayList <Double>( );
static double summer;
static double mean;
static double max;
static int fever = 0;

	public static void main(String[] args) 
	{
		initiateArray();
		getFarenheitTemps();
		summer();
		feverLister();
		celciusLister();
		nonFeverGet();
		healthyWeeder();
		minAndMaxFinder();
	}
	public static void initiateArray()
	{
	myArray.add(87.4);
	myArray.add(97.6);
	myArray.add(99.0);
	myArray.add(102.34);
	myArray.add(101.0);
	myArray.add(97.98);
	myArray.add(87.4);
	myArray.add(96.5);
	myArray.add(94.4);
	myArray.add(90.7);
	myArray.remove(87.4);
	myArray.add(89.0);
	myArray.add(95.5);
	mean = myArray.size();
	double max = Collections.max(myArray);
	}
	
	public static void getFarenheitTemps()
	{
	for(int i = 0; i < myArray.size(); i ++)
		{
		System.out.println(myArray.get(i) + " degrees farenheit.");
		summer = summer + myArray.get(i);
			if (myArray.get(i) > 98.6)
			{
			fever = fever + 1;
			}
		}
	}
	
	public static void summer()
	{
	System.out.println("The sum of these body temperatures is " + summer + " degrees farenheit.");
	System.out.println();
	System.out.println("The average body temperature of these people is " + (summer / mean) + " degrees farenheit.");
	System.out.println();
	}
	
	public static void feverLister()
	{
	System.out.println(fever + " people have fevers.");
	System.out.println("Here are their temperatures:");
	System.out.println();
	
	for(int i = 0; i < myArray.size(); i ++)
	{
		if (myArray.get(i) > 98.6)
			{
			fever = fever + 1;
			System.out.println(myArray.get(i) + " degrees farenheit.");
			}
	}
}
	public static void celciusLister()
	{
	System.out.println();
	System.out.println("Here are the body temperatures in degrees celcius:");
	
	for(int i = 0; i < myArray.size(); i ++)
		{
		System.out.println(((myArray.get(i) - 32.0) * (5.0/9.0)) + " degrees celcius.");
		summer = summer + myArray.get(i);
		}
	}
	
	public static void nonFeverGet()
	{
	System.out.println();
	System.out.println("Here are just the temperatures of the people who do not have fevers:");
	System.out.println();
	
	for(int i = 0; i < myArray.size(); i ++)
	{
		if(myArray.get(i) <= 98.6)
			{
			System.out.println(((myArray.get(i) - 32.0) * (5.0/9.0)) + " degrees celcius.");
			summer = summer + myArray.get(i);
			}
	}
	}
	
	public static void healthyWeeder()
	{
	for(int i = myArray.size() - 1; i > 0;  i --)
	{
	if(myArray.get(i) > 98.6)
		{
		myArray.remove(i);
		}
	}
	}
	
	public static void minAndMaxFinder()
	{
	System.out.println();
	System.out.println("Here is the minimum temperature for the heathy people:");
	System.out.println();
	System.out.println(Collections.min(myArray) + " degrees farenheit.");
	System.out.println("- (Which is " + (Collections.min(myArray) - 32.0) * (5.0/9.0) + " degrees celcius.)");
	
	System.out.println();
	System.out.println("Here is the highest temperature of the healthy people:");
	System.out.println();
	System.out.println(Collections.max(myArray));
	System.out.println("- (Which is " + (Collections.max(myArray) - 32.0) * (5.0/9.0) + " degrees celcius.)");
	}
	
	
}


