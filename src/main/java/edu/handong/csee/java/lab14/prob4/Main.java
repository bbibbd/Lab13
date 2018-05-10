package edu.handong.csee.java.lab14.prob4;	//package name
import java.util.Scanner;	//import scanner
public class Main {	//define the class that contains the main method

	public static void main(String[] args) {	//define the main method
		Scanner keyboard = new Scanner(System.in);	//instantiate Scanner to keyboard
		int num = 0;	//declare and initiate num to 0
		Boundary arr = new Boundary();	//instantiate Boundary to arr
		Boolean repeat = true;	//declare Boolean type variable repeat and initiate it to true
		while(repeat) {	//while repeat is true
			try {	//try following lines in the block
				System.out.print("Enter an integer: ");	//print out this message to get initegers from user
				num = keyboard.nextInt();	//get ingeter from user
				arr.receive(num);	//implement receive method with num
			}
			catch(ArrayIndexOutOfBoundsException e) {	//if an ArrayIndexOutOfBoundsException was caught in the try block
				System.out.println("Invalid array index access!");		//print out the message
				repeat = false;	//put false to repeat to escape while loop
			}
		}
		keyboard.close();	//close scanner
	}

}

