package edu.handong.csee.java.lab14.prob3;	//package name

public class Powercalc {	//define the class named Powercalc
	public int n, p;	//declare two integer variables n and p
	
	public Powercalc(int n, int p) {	//make a constructor which has two integer variable
		this.n = n;	//put the value of n to the instance variable n
		this.p = p;	//put the value of p to the instance variable p
	}
	
	public long calculatePower() throws Exception{	//declare the method calculatePower which throws Exception
		
		long result;	//declare the long type variable result
		if(n<0 || p<0)	throw new Exception("n or p should not be negative.");	//if the value of n or p is less than 0, throws new exception
		if(n==0 && p==0)	throw new Exception("n and p should not be zero at the same time");	//if n and p is 0 at the same time, throw new exception
		result = (long)Math.pow(n, p);	//calculate the power of n and p
		return result;	//return the power of n and p
	}
}
