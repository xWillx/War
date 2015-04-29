
public class CollegeChooser 
{
static int result;
	public static void main(String[] args) 
	{
		String[]collegeChoice = {"M.I.N.E.S", "M.I.N.E.S", "M.I.N.E.S", "M.I.N.E.S", "M.I.N.E.S", "M.I.N.E.S", "M.I.N.E.S", "M.I.N.E.S", "M.I.N.E.S", "M.I.N.E.S", "M.I.N.E.S", "M.I.N.E.S", "M.I.N.E.S", "M.I.N.E.S",};
		result = (int)(Math.random() + collegeChoice.length - 1);
		System.out.println("You got into " + collegeChoice[result] + "!");
	}

}
