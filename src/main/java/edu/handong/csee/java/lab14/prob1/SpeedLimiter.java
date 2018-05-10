package edu.handong.csee.java.lab14.prob1;	//package name

public class SpeedLimiter {		//define the class named SpeedLimiter
	
	private int speed;	//declare an integer variable speed to Randomly generate the speed
	private int limit;	//declare an integer variable limit to get the boundary of the speed
	
	public SpeedLimiter(int speed, int limit) {	//make a constructor that has two integer type parameter
		this.speed = speed;	//put the value of speed to the instance variable speed
		this.limit = limit;	//put the value of limit to the instance variable limit
	}

	public void warnSpeed() {	//define the class named warnSpeed to check if the speed exceeds its limitation
		try {	//try following lines in the block
			if(this.speed > this.limit) // if the speed exceeds its limitation
				throw new Exception("Speed limit "+this.limit+"km exceeded!");	//	throw new exception(It was originally not an exception, but I forced it to be an exception.)
			System.out.println("You are a law abiding citizen!");	//if not, print out this message
		}catch(Exception e) {	//If an exception was caught in the try block
			System.out.println(e.getMessage());	//print out the message of the exception
			System.out.println("You are being fined. ");	//print out this message
		}
		System.out.println("Your current speed: " + this.speed);	//if the speed is lower than its limitation, print out this message
	}
}
