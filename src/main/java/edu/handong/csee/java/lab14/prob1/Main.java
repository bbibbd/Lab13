package edu.handong.csee.java.lab14.prob1;	//package name

import java.util.Scanner;	//import Scanner
import java.util.Random;	//import Random
public class Main {	//define the class which includes the main method

	public static void main(String[] args) {	//define the main method
		Scanner keyboard = new Scanner(System.in);	//instantiate the scanner to keyboard
		Random rand = new Random();	//instantiate the Random to rand
		int limit = 0, speed = 0;	//declare two integer type variables limit and speed

		System.out.print("Set the speed limit, officer: ");	//print out this message to get the speed limit from user
		limit = keyboard.nextInt();	//get the limit from user
		speed = rand.nextInt(101);	//randomly generate the speed from 0 to 100

		SpeedLimiter lim = new SpeedLimiter(speed, limit);	//instantiate the SpeedLimiter to lim with two parameters(seppd, limit)
		lim.warnSpeed();	//implements warnSpeed method in the instance lim

		keyboard.close();	//close scanner

	}

}
