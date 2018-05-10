package edu.handong.csee.java.lab14.prob5;	//package name

public class MyException extends Exception {	//declare the class MyException extends Exception
	private String message = null;	//declare the String message 
	
	public MyException() {	//define default constructor
		super();	//get all elements from super class
	}
	
	public MyException(String message) {	//define the constructor that has String type variable
		super(message);	//implement Exception(message)
		this.message = message;	//put message to the instance variable message
	}
	
	public MyException(Throwable cause) {	//define the constructor that has Throwalbe type variable
		super(cause);	//implement Exception(cause)
	}
	
	public String toString() {	//define the method which returns the message
		return message;	//return message
	}
}
