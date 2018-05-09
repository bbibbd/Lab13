package edu.handong.csee.java.lab14.prob1;

public class SpeedLimiter {
	private int speed;
	private int limit;
	
	public SpeedLimiter(int speed, int limit) {
		this.speed = speed;
		this.limit = limit;
	}

	public void warnSpeed() {
		try {
			if(this.speed > this.limit) 
				throw new Exception("Speed limit "+this.limit+"km exceeded!");
			System.out.println("You are a law abiding citizen!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("You are being fined. ");
		}
		System.out.println("Your current speed: " + this.speed);
	}
}
