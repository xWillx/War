
public class Forloops {
	static int heads = 0;
	static int tails = 0;

	public static void main(String[] args)
	{

	for(int i = 1; i < 6; i++)	
		{
		System.out.println(i);
		}
	
	System.out.println();
	System.out.println();
	
	for(int i = 2; i < 11; i = i + 2)
		{
		System.out.println(i + ". I love Mullen!");
		}
	
	System.out.println();
	System.out.println();
	
	for(int i = 1; i < 6; i++)	
		{
		System.out.print(i + " ");
		}
	
	System.out.println();
	System.out.println();
	
	for(int i = 10; i > 0; i--)
		{
		System.out.println(i);
		}
	
	System.out.println("Liftoff!");
	
	System.out.println();
	System.out.println();
	
	for(int i = 0; i < 10; i++)
		{
		System.out.println("Flip a coin.");
		System.out.println();
		int coin = (int)(Math.random()*2 + 1);
		switch (coin)
		{
		case 1:
			System.out.println("You flipped heads!");
			System.out.println();
			heads = heads + 1;
			break;
		case 2:
			System.out.println("You flipped tails!");
			System.out.println();
			tails = tails + 1;
			break;
		default:
			{
			}
		}
		}
	
	System.out.println();
	System.out.println("--RESULT--");
	System.out.println();
	System.out.println("You flipped heads " + heads + " times, and tails " + tails + " times.");
	
	int headsPercentage = (10 - heads) * 10;
	int tailsPercentage = (10 - tails) * 10;
	
	System.out.println();
	System.out.println("You rolled heads " + headsPercentage + "% of the time.");
	System.out.println("and");
	System.out.println("you rolled tails " + tailsPercentage + "% of the time.");
	}

}
