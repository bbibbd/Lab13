package edu.handong.csee.java.lab14.prob6;	//package name
import java.util.Scanner;	//import Scanner

public class Main {	//define the class which contains the main method

	public static void main(String[] args) {	//define main method
		String name, race;	//declare two string type variables name and race
		int age = 0;	//declare and initiate the age to 0
		Scanner keyboard = new Scanner(System.in);	//instantiate the Scanner to keyboard
		CustomID obj = new CustomID();	//instantiate CustomID to obj
		boolean repeat = true;	//set boolean type variable repeat to true
		
		while(repeat) {	//while repeat is true
			try {	//try following lines in the block
				if(obj.getState()==0) {	//if the value of the state in the instance obj is 0
					System.out.print("Enter your name: ");	//print out this message to get name from user
					name = keyboard.nextLine();	//get name from user
					obj.setName(name);	//set name to the instance obj
				}
				else if(obj.getState()==1) {	//if the value of the state in the instance obj is 1
					System.out.print("Enter your age: ");	//print out the message to get age from user
					age = keyboard.nextInt();	//get age from user
					keyboard.nextLine();	//remove the character 'enter'
					obj.setAge(age);	//set age to the instance obj
				}
				else if(obj.getState() == 2) {	//if the value of the state in the instance obj is 2
					System.out.print("Enter your race: ");	//print out the message to get race form user
					race = keyboard.nextLine();	//get race from user
					obj.setRace(race);	//set age to the instance obj
				}
			}
			catch(Exception e) {	//if an Exception was caught in the try block
				System.out.println(e.getMessage());	//print out the error message
				continue;	//continue
			}
		}
		keyboard.close();	//close the scanner
	}

}
