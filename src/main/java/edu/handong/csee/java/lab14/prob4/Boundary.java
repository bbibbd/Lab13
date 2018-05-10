package edu.handong.csee.java.lab14.prob4;	//package name

public class Boundary {	//define the class named Boundary
	private static int [] arr = new int [5];	//declare static the array
	private static int count = 0;	//declare the class variable count and initiate it to 0

	public void receive(int num) throws ArrayIndexOutOfBoundsException{	//define the method that throws the ArrayIndexOutOfBoundsException 
		int i = count;	//initiate	i to count
		arr[i] = num;	//put num to arr[i] 
		count++;	//increase 1
		System.out.printf("arr[%d] <- %d\n", i, num);	//print out ith value of the array
	}
}
