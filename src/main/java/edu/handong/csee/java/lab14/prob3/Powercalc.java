package edu.handong.csee.java.lab14.prob3;

public class Powercalc {
	public int n, p;
	
	public Powercalc(int n, int p) {
		this.n = n;
		this.p = p;
	}
	
	public long calculatePower() throws Exception{
		
		long result;
		if(n<0 || p<0)	throw new Exception("n or p should not be negative.");
		if(n==0 && p==0)	throw new Exception("n and p should not be zero at the same time");
		result = (long)Math.pow(n, p);
		return result;
	}
}
