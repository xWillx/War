
import java.util.Scanner;
public class PalindromeChecker 
{

static String palindromeCheck = new String();
static String palindromeBuffer = new String();
static String palindromeFinal = new String();

	public static void main(String[] args) 
	{
	
	System.out.println("Tell me a word or sentence and I will check for a palindrome.");
	Scanner userInput1 = new Scanner(System.in);
	String inputSent = userInput1.nextLine();
	palindromeCheck = inputSent;
	
		palindromeBuffer = palindromeCheck.toLowerCase();
		palindromeBuffer = palindromeBuffer.replaceAll(" ", "");
		palindromeBuffer = palindromeBuffer.replaceAll("[^\\p{L}\\p{Nd}]+", "");
	
		StringBuffer palindromeBufferz = new StringBuffer(palindromeBuffer);
		palindromeBufferz.reverse();
		palindromeFinal = palindromeBufferz.toString();
					//System.out.println(palindromeFinal);
					//System.out.println(palindromeBufferz);
					//System.out.println(palindromeBuffer);
	
	if(palindromeFinal.equals(palindromeBuffer))
		{
		System.out.println("Yes, this is a palindrome!");
		}
	else
		{
		System.out.println("No, this is not a palindrome!");
		}
		System.out.println(palindromeFinal);
	}

}
