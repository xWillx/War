
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades 
{

static ArrayList <StudentGrades> results = new ArrayList <StudentGrades>( );
private String name;
private int score;

	public StudentGrades(String n, int s)
		{
		name = n;
		score = s;
		}
	
	
	public static ArrayList<StudentGrades> getresults() 
	{
		return results;
	}

	public static void setMyArray(ArrayList<StudentGrades> results) 
	{
		StudentGrades.results = results;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getScore() 
	{
		return score;
	}

	public void setScore(int score) 

	
	{
		this.score = score;
	}

	
	
public static void main(String[] args) 
	{
	printNames();
	addNames();
	changeToFiftyFive();
	}



public static void printNames()
	{
		results.add(new StudentGrades("Will", 93));
		results.add(new StudentGrades("Strong", 94));
		results.add(new StudentGrades("Chris", 87));
		results.add(new StudentGrades("Roy", 62));
		results.add(new StudentGrades("Maria", 98));
		
		for(int i = 0; i < results.size(); i ++)
			{
			System.out.println(results.get(i).getName() + ", " + results.get(i).getScore());
			}
		
	}

public static void addNames()
	{
	System.out.println();
	System.out.println("Input a new student and their score to add it to the system.");
	System.out.println("Type in a name:");
	Scanner userInput1 = new Scanner(System.in);
	String newName = userInput1.nextLine();
	
	System.out.println();
	
	System.out.println("Type in their score:");
	Scanner userInput2 = new Scanner(System.in);
	int newScore = userInput2.nextInt();
	
	results.add(new StudentGrades(newName, newScore));
	reprintNames();
	
	}

private static void reprintNames()
	{
	for(int i = 0; i < results.size(); i ++)
		{
		System.out.println(results.get(i).getName() + ", " + results.get(i).getScore());
		}
	}

public static void changeToFiftyFive()
	{
	System.out.println();
	System.out.println("Now I need to raise their scores to at least 55:");
	for(int i = 0; i < results.size(); i ++)
		{
		if(results.get(i).getScore() < 55)
			{
			results.get(i).setScore(55);
			}
		}
	reprintNames();
	}
}


















