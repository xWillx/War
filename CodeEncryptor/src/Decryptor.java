
public class Decryptor 
{
static String decryptedCode = new String (Cryptographer.usersCode);
	
	public static void decryptCode()
	{
	replaceSymbols();
	reReverseCode();
	Cryptographer.usersCode = decryptedCode;
	}
	
public static String replaceSymbols()
	{
	decryptedCode = decryptedCode.replace("~","a");
	decryptedCode = decryptedCode.replace("{","b");
	decryptedCode = decryptedCode.replace("@","c");
	decryptedCode = decryptedCode.replace("#","d");
	decryptedCode = decryptedCode.replace("$","e");
	decryptedCode = decryptedCode.replace("%","f");
	decryptedCode = decryptedCode.replace("^","g");
	decryptedCode = decryptedCode.replace("&","h");
	decryptedCode = decryptedCode.replace("*","i");
	decryptedCode = decryptedCode.replace("(","j");
	decryptedCode = decryptedCode.replace(")","k");
	decryptedCode = decryptedCode.replace("_","l");
	decryptedCode = decryptedCode.replace("+","m");
	decryptedCode = decryptedCode.replace("`","n");
	decryptedCode = decryptedCode.replace("1","o");
	decryptedCode = decryptedCode.replace("2","p");
	decryptedCode = decryptedCode.replace("3","q");
	decryptedCode = decryptedCode.replace("4","r");
	decryptedCode = decryptedCode.replace("5","s");
	decryptedCode = decryptedCode.replace("6","t");
	decryptedCode = decryptedCode.replace("7","u");
	decryptedCode = decryptedCode.replace("8","v");
	decryptedCode = decryptedCode.replace("9","w");
	decryptedCode = decryptedCode.replace("0","x");
	decryptedCode = decryptedCode.replace("-","y");
	decryptedCode = decryptedCode.replace("=", "z");
	decryptedCode = decryptedCode.replace("<", " ");
	return decryptedCode;
	}

public static String reReverseCode()
	{
	StringBuffer reCodeReverse = new StringBuffer(decryptedCode);
	reCodeReverse = reCodeReverse.reverse();
	decryptedCode = reCodeReverse.toString();
	return decryptedCode;
	}
}
