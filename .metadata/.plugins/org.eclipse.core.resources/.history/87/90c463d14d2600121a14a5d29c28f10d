package myPrograms;

import java.util.Scanner;

import java.util.Random;

public class testFoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//int divisible;
		//Declare strings to be read as inputs
		//String lengthS, divisibleS;
		//Enter length of random
		//lengthS = JOptionPane.showInputDialog ("Amount of random numbers to generate?");
		//Enter number for divisible string output
		//divisibleS = JOptionPane.showInputDialog ("Divisor?");
		//Create integers for array creation
		//divisible = Integer.parseInt(divisibleS);
		System.out.println("Enter amount of random numbers to be generated: ");
		final int LENGTH = input.nextInt();
		int[] genArray = new int[LENGTH];
		for(int i = 0; i < LENGTH; i++) {
			Random num = new Random();
			
			genArray[i] = num.nextInt(99) + 1;
			
			System.out.println(genArray[i] + " ");
		}
	
		System.exit( 0 );
	}

}
