package edu.handong.csee.java.lab14.prob3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Innput two integers");
		
		while (keyboard.hasNextInt()) {
            int n = keyboard.nextInt();
            int p = keyboard.nextInt();
    		Powercalc calculator = new Powercalc(n,p);
           
    		try {
                System.out.println(calculator.calculatePower());
            } catch (Exception e) {
                System.out.println(e);
            }
        }

		

	}

}
