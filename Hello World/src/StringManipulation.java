
import java.util.ArrayList;
import java.util.Scanner;
public class StringManipulation 
{

	static int vowel;
	static int consonant = 0;

	public static void main(String[] args) 
	{
		//lowercaseConvert();
	System.out.println();
		//findVowels();
	System.out.println();
		//greetPerson();
	System.out.println();
		//identifySentence();
	System.out.println();
		//printMullen();
	System.out.println();
		writePigLatin();
	}

public static void lowercaseConvert()
	{
	System.out.println("Yell something at me!");
	Scanner userInput1 = new Scanner(System.in);
	String yelling = userInput1.nextLine();
	
	String capitalLetters = new String();
	capitalLetters = yelling;
	
	System.out.println("I think that you mean:");
	System.out.println();
		for(int i = 0; i < yelling.length(); i ++)
			{
			if(i == 0)
				{
				System.out.println((yelling.substring(i, i + 1)));
				}
			else
				{
				System.out.println((yelling.substring(i, i + 1).toLowerCase()));
				}
			}
	}

public static void findVowels()
	{
	System.out.println("Input a sentence and I will count the vowels in it:");
	Scanner userInput2 = new Scanner(System.in);
	String input = userInput2.nextLine();
	
	String vowelFinder = new String();
	vowelFinder = input;
	
	for(int i = 0; i <  vowelFinder.length(); i ++)
		{
		switch(vowelFinder.substring(i, i + 1))
			{
			case "a":
			case "A":
			case "e":
			case "E":
			case "I":
			case "i":
			case "o":
			case "O":
			case "U":
			case "u":
			
				{
				vowel ++;
				break;
				}
			}
		
		}
	System.out.println("There are " + vowel + " vowels in this sentence.");
	}

public static void greetPerson()
	{
	
	ArrayList<String> complimentGenerator = new ArrayList<String>();
	ArrayList<String> choicesInput = new ArrayList<String>();
	System.out.println("Hello! What is your name?");
	Scanner userInput3 = new Scanner(System.in);
	String userName = userInput3.nextLine();

	complimentGenerator.add("Looking good today, " + userName + "!");
	complimentGenerator.add("You've been working out lately, " + userName + "!");
	complimentGenerator.add("Looking fashionable, " + userName + "!");
	
	int min = 0;
	int compliment = 0 + (int) (Math.random()*complimentGenerator.size() - 1) + min;
			 
	System.out.println(complimentGenerator.get(compliment));
	
	}

public static void identifySentence()
	{
	System.out.println("Write a sentence for me:");
	System.out.println("With no punctuation:");
	Scanner userInput4 = new Scanner(System.in);
	String sentence = userInput4.nextLine();
	
	String sentenceStats = new String();
	sentenceStats = sentence;
	
	String noSpaces = sentenceStats.replace(" ", "");
	
	int numberOfCharacters = sentenceStats.length();
	int numberOfLetters = noSpaces.length();
	
	for(int i = 0; i < noSpaces.length(); i ++)
		switch(noSpaces.substring(i, i + 1))
			{
			case "a":
			case "A":
			case "e":
			case "E":
			case "I":
			case "i":
			case "o":
			case "O":
			case "U":
			case "u":
				{
				vowel ++;
				break;
				}
			default:
				{
				consonant ++;
				}
			} 
	
	System.out.println(noSpaces);
	System.out.println("There are " + vowel + " vowels in this sentence.");
	System.out.println("There are " + consonant + " consonants in this sentence.");
	System.out.println("There are " + numberOfCharacters + " characters in this sentence.");
	System.out.println("There are " + numberOfLetters + " letters in this sentence.");
	}

public static void printMullen()
	{
	String MullenHighPrint = new String();
    MullenHighPrint = "This is a very very large pyramid. I cannot believe that it is this long! You wanted more typing so I decided to make this into a MASSIVE pyramid! Wow, that is big!";
    
	for(int i = 0; i < MullenHighPrint.length(); i ++)
		{
		System.out.println(MullenHighPrint.substring(0, i + 1));
		}
	}
public static void writePigLatin()
	{
	System.out.println("Write a sentence and I will say it in Pig Latin.");
	Scanner userInput1 = new Scanner(System.in);
	String inputSent = userInput1.nextLine();
	String [] dividedWords = inputSent.split(" ");
	
	for(int i = 0; i < dividedWords.length; i ++)
		{
		String eachWord = dividedWords[i];
		switch (eachWord.substring(0,1))
			{
			case "A":
			case "a":
			case "E":
			case "e":
			case "I":
			case "i":
			case "O":
			case "o":
			case "U":
			case "u":
				{
				System.out.println(eachWord + " -way.");
				break;
				}
			default:
				{
				System.out.println(eachWord.substring(1) + " -" + eachWord.substring(0,1) + "ay");	
				}
			}
		}
	}
		
	
}
