

import java.util.ArrayList;
import java.util.Scanner;

public class Cryptographer 
{
public static String usersCode = new String();
public static String secretMessage;

	public static void main(String[] args)
	{
	introduceMessage();	
	//encryptCodeProcess();
		System.out.println("Decrypting...");
	Decryptor.decryptCode();
		System.out.println();
		System.out.println(usersCode);
	}
	
public static void introduceMessage()
	{
	System.out.println("Type in the hidden message.");
	Scanner userInput1 = new Scanner(System.in);
	secretMessage = userInput1.nextLine();
	usersCode = secretMessage;
	}

public static void encryptCodeProcess()
	{
	Encryptor.encryptCode();
		System.out.println("Encrypting...");
		System.out.println();
		System.out.println(usersCode);
		System.out.println();
	}

}
