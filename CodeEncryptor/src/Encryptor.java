
public class Encryptor 
{
static String encryptedCode = new String (Cryptographer.usersCode);

	public static void encryptCode()
	{	
	replaceLetters();	
	reverseCode();
	Cryptographer.usersCode = Encryptor.encryptedCode;
	}
	
public static String replaceLetters()
	{
	encryptedCode = encryptedCode.toLowerCase();	
	encryptedCode = encryptedCode.replace("a","~");
	encryptedCode = encryptedCode.replace("b","{");
	encryptedCode = encryptedCode.replace("c","@");
	encryptedCode = encryptedCode.replace("d","#");
	encryptedCode = encryptedCode.replace("e","$");
	encryptedCode = encryptedCode.replace("f","%");
	encryptedCode = encryptedCode.replace("g","^");
	encryptedCode = encryptedCode.replace("h","&");
	encryptedCode = encryptedCode.replace("i","*");
	encryptedCode = encryptedCode.replace("j","(");
	encryptedCode = encryptedCode.replace("k",")");
	encryptedCode = encryptedCode.replace("l","_");
	encryptedCode = encryptedCode.replace("m","+");
	encryptedCode = encryptedCode.replace("n","`");
	encryptedCode = encryptedCode.replace("o","1");
	encryptedCode = encryptedCode.replace("p","2");
	encryptedCode = encryptedCode.replace("q","3");
	encryptedCode = encryptedCode.replace("r","4");
	encryptedCode = encryptedCode.replace("s","5");
	encryptedCode = encryptedCode.replace("t","6");
	encryptedCode = encryptedCode.replace("u","7");
	encryptedCode = encryptedCode.replace("v","8");
	encryptedCode = encryptedCode.replace("w","9");
	encryptedCode = encryptedCode.replace("x","0");
	encryptedCode = encryptedCode.replace("y","-");
	encryptedCode = encryptedCode.replace("z","=");
	encryptedCode = encryptedCode.replace(" ","<");    
	
	return encryptedCode;
	}

public static String reverseCode()
	{
	StringBuffer codeReverse = new StringBuffer(encryptedCode);
	codeReverse = codeReverse.reverse();
	encryptedCode = codeReverse.toString();
	return encryptedCode;
	}
}

