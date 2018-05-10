package edu.handong.csee.java.lab14.prob5;	//package name
import java.util.Scanner;	//import Scanner

public class Main {	//define the class Main

	static void findNull(String str) throws MyException{	//define static method which throws exception
		if(str.equals("null"))	throw new MyException("String val is null");	//if str is equals to "null"	throws new exception
		else	System.out.println("String val is: "+str);	//else, print out the String value
	}
	
	public static void main(String[] args) {	//define main method
		try {	//try following lines in the block
			Scanner keyboard = new Scanner(System.in);	//instantiate the scanner to keyboard
			String str = keyboard.nextLine();	//get string from user 
			Main.findNull(str);	//implements findNull method in this class
		}	
		catch(MyException mae)	{	//if an ArrayIndexOutOfBoundsException was caught in the try block
			System.out.println("Inside catch block: "+mae);	//print out the message
		}

	}

}
