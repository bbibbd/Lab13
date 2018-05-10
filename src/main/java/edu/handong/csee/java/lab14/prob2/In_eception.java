package edu.handong.csee.java.lab14.prob2;	//package name
import java.util.*;	//imports all elements java.util

public class In_eception {	//define the class named In_eception
	private int x,y;	//declare two integer variables x, y
	public void detectError() {	//define the class that detects error
	    try{	//try following lines in the block
	    	Scanner keyboard = new Scanner(System.in);	//instantiate Scanner to keyboard
	    	System.out.print("x: ");	//print out this message to get x
	    	x = keyboard.nextInt();		//get x from user
	    	System.out.print("y: ");	//print out this message to get y
	    	y = keyboard.nextInt();		//get y from user
	    	System.out.println(this.x/this.y);	//print out x and y
	    	}	catch(ArithmeticException e){	//If an ArithmeticException was caught in the try block
	    			System.out.println("java.lang.ArithmeticException: " + e.getMessage());	//print out the message and exception message
	    	}	catch(InputMismatchException e){	//If an InputMismatchException was caught in the try block
	    			System.out.println("java.util.InputMismatchException");	//print out this message and exception message
	    	}	catch(Exception e) {	//If the other Exceptions was caught in the try block
	    			System.out.println("Some other exception has occurred: " + e.getMessage());	//print out this message
	    }
	}

}
