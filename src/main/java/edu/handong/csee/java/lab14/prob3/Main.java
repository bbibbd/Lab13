package edu.handong.csee.java.lab14.prob3;	//package name
import java.util.Scanner;	//import  Scanner

public class Main {	//define the class that contains the main method

	public static void main(String[] args) {	//define the main method
		Scanner keyboard = new Scanner(System.in);	//instantiate the Scanner to keyboard

		System.out.println("Innput two integers");	//print out this message to get the integers from user
		
		while (keyboard.hasNextInt()) {	//while user inputed value is valid value
            int n = keyboard.nextInt();	//get n from user
            int p = keyboard.nextInt();	//get p from user
    		Powercalc calculator = new Powercalc(n,p);	//instantiate Powercalc to Calculator with two integers n and p
           
    		try {	//try following lines in the block
                System.out.println(calculator.calculatePower());	//print out the result 
            } catch (Exception e) {	//if an exception was caught in the try block
                System.out.println(e.getMessage());	//print out the exception
            }
        }

		

	}

}
