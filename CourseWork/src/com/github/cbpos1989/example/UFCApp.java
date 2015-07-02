package com.github.cbpos1989.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UFCApp {
	private boolean invalidInput = true;
	private Scanner scan = new Scanner(System.in);
	private float userWeight;
	
	public static void main(String[] args){
		UFCApp ufcApp = new UFCApp();
		ufcApp.initialise();
	}
	
	void initialise(){
		
		System.out.println("1)Enter Weight in Pounds(lb)\n2)Enter Weight in Kilograms(kg)");
		do{
			System.out.print("Enter Your Choice: ");
			int userChoice = scan.nextInt();
			
			if (userChoice == 1) {
				enterWeight(true);
				invalidInput = false;
			} else if (userChoice == 2) {
				enterWeight(false);
				invalidInput = false;
			} else {
				System.out.println("Enter valid input");
			}
		} while (invalidInput);
	}
	
	void enterWeight(boolean isPounds){
		invalidInput = true;
		
		do {
			System.out.print("Enter your Weight: ");
			userWeight = scan.nextFloat();
			invalidInput = !(scan.hasNextLine());
		} while (invalidInput);
		
		if (isPounds) {
			checkWeight(userWeight);
		} else {
			checkWeight(userWeight * 2.2F);
		}
	}
	
	void checkWeight(float userWeight){
		//System.out.println(userWeight);
		if(userWeight > 265 || userWeight < 145){
			
		}
	}

}