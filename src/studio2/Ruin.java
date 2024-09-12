package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);


		System.out.print("Please input start amount: ");
		double startAmount = in.nextDouble();
		System.out.print("Please input the win chance as a decimal: ");
		double winChance = in.nextDouble();
		System.out.print("Please input the win limit: ");
		double winLimit = in.nextDouble();
		System.out.print("Please insert number of days for the simulation: ");
		int dayLimit = in.nextInt();

		double currentAmount = startAmount;
		int success = 0;
		int Plays = 0;

		for (int i = 1; i <= dayLimit; i++) {

			Plays = 0;
			
			currentAmount = startAmount;
			
			while ((currentAmount < winLimit) && (currentAmount > 0)) {

				Plays++;

				if (Math.random() < winChance) {

					currentAmount++;

				}

				else {

					currentAmount--;

				}

			}
			
			System.out.println("Day " +i +":");
			System.out.println("Number of plays: " +Plays);

			if(currentAmount >= winLimit) {
				System.out.println("You've won!");
				success++;
				
			}

			else {
				System.out.println("You've Lost!");
				
			}
		}
		
		if (winChance == 0.5) {
			
			double expectedRR = 1 - (startAmount/winLimit);
			System.out.println("Expected Ruin: " +expectedRR);
			
		}
		
		else {
			
			double a = (1.0-winChance)/winChance;
			double RR2 = (double)(((Math.pow(a, startAmount) - Math.pow(a, winLimit)))/(1.0-Math.pow(a,winLimit)));
			System.out.println("Expected Ruin: " +RR2);
		}
		
		System.out.println("day limit: "+dayLimit);
		System.out.println("success: " +success);
		double ruinRate = ((double)dayLimit - (double)success)/(double)dayLimit;
		System.out.println("Your ruin rate is: " +ruinRate);
		
		
	}

}
