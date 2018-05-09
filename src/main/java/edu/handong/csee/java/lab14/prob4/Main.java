package edu.handong.csee.java.lab14.prob4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num = 0;
		Boundary arr = new Boundary();
		Boolean repeat = true;
		while(repeat) {
			try {
				System.out.print("Enter an integer: ");
				num = keyboard.nextInt();
				arr.receive(num);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid array index access!");
				repeat = false;
			}
			
		}
		keyboard.close();
	}

}
