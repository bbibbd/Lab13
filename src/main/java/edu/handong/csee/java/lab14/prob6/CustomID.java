package edu.handong.csee.java.lab14.prob6;	//package name

public class CustomID extends Exception{	//define the class named CustomID extends Exception
	private String[] races = new String[]{"vulcans", "Romulan", "Klingons"};	//declare the array race
	private String name = "";	//declare the string type variable name
	private int age = 0;	//declare the integer type variable age
	private String race = "";	//declare the string type variable race
	private int state = 0;	//declare integer type variable state
	
	public void setName(String name) throws Exception{	//define setter method of name
		if(name.length()<5) {	//if length of the name is less than 5
			state = 0;	//state = 0
			throw new Exception("Your name is short! Try againb");	//throw new exception
		}
		else {	//if not
			this.name = name;	//set name to the instance variable name
			System.out.println("name is valid");	//print out the message
			System.out.println("Name: "+this.name);	//print out the name
			state ++;	//increase state 1
		}
	}
	
	public void setAge(int age) throws Exception {	//define setter method of age
		if(age<18) {	//if age is under 18
			state = 1;	//state = 1
			throw new Exception("You are too young! Try again!");	//throw new exception
		}
		else {	//if not
			this.age = age;	//set age to the instance variable age
			System.out.println("Age is valid");	//print out this message
			System.out.println("Age: "+this.age);	//print out the age
			state ++;	//increase state 1
		}
	}
	
	public void setRace(String race) throws Exception{	//define setter method of Race
		for(int i=0; i<races.length; i++) {	//for i = 0 to i < length of the race(3)
			if(races[i].equals(race)) {	//if ith value of the array race is equals to the race(user nputed value)
				this.race = races[i];	//set race to the instance variable race
				System.out.println("Race is valid");	//print out the message
				System.out.println("Race: "+races[i]);	//print out the race
				state = 0;	//state = 0
			}
		}
		state = 2;	//state = 2
		throw new Exception("Human! Try again.");	//throw new exception
	}
	public int getState() {	//define the getter method of state
		return state;	//return state
	}
}
