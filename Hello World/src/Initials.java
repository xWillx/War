import java.util.ArrayList;
import java.util.Scanner;

public class Initials 
{
	
public static String Initials = new String();
static String input;

	public static void main(String[] args) 
	{
	System.out.println("Type in a name and I will give you the initials.");
	Scanner userInput1 = new Scanner(System.in);
	input = userInput1.nextLine();
	Initials = input;
	
	Initials = Initials.toUpperCase();
	System.out.print(Initials.substring(0, 1));
	
	for(int i = 0; i < Initials.length(); i ++)
		{
		if(Initials.substring(i, i + 1).equals(" "))
			{
			System.out.print(Initials.substring(i + 1, i + 2));
			}
		}
	
	}

}
