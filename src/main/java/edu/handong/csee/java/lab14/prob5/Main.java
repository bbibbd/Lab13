package edu.handong.csee.java.lab14.prob5;
import java.util.Scanner;

public class Main {

	static void findNull(String str) throws MyException{
		if(str.equals("null"))	throw new MyException("String val is null");
		else	System.out.println("String val is: "+str);
	}
	
	public static void main(String[] args) {
		try {
			Scanner keyboard = new Scanner(System.in);
			String str = keyboard.nextLine();
			Main.findNull(str);
		}	
		catch(MyException mae)	{
			System.out.println("Inside catch block: "+mae);
		}

	}

}
