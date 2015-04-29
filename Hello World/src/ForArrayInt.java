import java.util.Scanner;
public class ForArrayInt
{
static int k;
	public static void main(String[] args) 
	{
		int[]newConcept = {1, 2, 3, 4, 5, 6};
		int[]doublingNumbers = {1, 2, 3, 4, 5, 6, 7};
		
		for (int why: newConcept)
			{
			System.out.println(why);
			}
		
		System.out.println();
		
		for (int why: newConcept)
			{
			System.out.print(why + " ");
			}
		
		System.out.println();
		System.out.println();
		
		for (int why: doublingNumbers)
			{
			System.out.println(why * 2);
			}
		for(int why: doublingNumbers)
			{
			k = k + why * 2;
			}
		
		System.out.println();
		
		System.out.println("The total is: " + k);
	}

}
