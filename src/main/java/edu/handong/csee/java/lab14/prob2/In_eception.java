package edu.handong.csee.java.lab14.prob2;	//package name
import java.util.*;	//imports all elements java.util

public class In_eception {	//define the class named In_eception
	private int x,y;	//declare two integer variables x, y
	public void detectError() {	//define the class that detects error
	    try{
	    	Scanner keyboard = new Scanner(System.in);
	    	System.out.print("x: ");
	    	x = keyboard.nextInt();
	    	System.out.print("y: ");
	    	y = keyboard.nextInt();
	    	System.out.println(this.x/this.y);
	    	}	catch(ArithmeticException e){
	    			System.out.println("java.lang.ArithmeticException: " + e.getMessage());
	    	}	catch(InputMismatchException e){
	    			System.out.println("java.util.InputMismatchException");
	    	}	catch(Exception e) {
	    			System.out.println("Some other exception has occurred: " + e.getMessage());
	    }
	}

}
