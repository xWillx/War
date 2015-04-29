import java.util.Scanner;


public class DegreesConverter 

{
	
	public static void main(String[] args) 
		{
		System.out.println("Because i like you, I will convert the temperature for you.");
		System.out.println("Give me the temperature in farenheit and I will convert it to celcius:");
		Scanner userInput3 = new Scanner (System.in);
		double temp = userInput3.nextDouble();
		double newTemp = (temp - 32.0) * (5.0/9.0);
		System.out.println("Here you go:");
		System.out.println(newTemp + " degrees");
		System.out.println();
		
		System.out.println("Do you want me to help you with your trigonometry homework?");
		System.out.println("Give me an angle in degrees and I will convert it to radians for you.");
		Scanner userInput4 = new Scanner (System.in);
		double degree = userInput4.nextDouble();
		double radian = degree * (3.14159 / 180.0);
		System.out.println("Here you go:");
		System.out.println(radian + " radians.");
			if(degree <= 90.0)
				{
				System.out.println("Quadrant I");
				}
			else if(degree <= 180.0)
				{
				System.out.println("Quadrant II");
				}
			else if(degree <= 270.0)
				{
				System.out.println("Quadrant III");
				}
			else if(degree <= 360.0)
				{
				System.out.println("Quadrant IV");
				}
			else
				{
				System.out.println("Now don't ask me to do your work again!");
				}
		}
	
}
