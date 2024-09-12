package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("Please input start amount: ");
		double startAmount = in.nextDouble();
		System.out.print("Please input the win chance: ");
		double winChance = in.nextDouble();
		System.out.print("Please input the win limit: ");
		double winLimit = in.nextDouble();
		
		double currentAmount = startAmount;
		
		while (currentAmount < winLimit) {
			
				
			if (Math.random() > .5) {
				
				currentAmount++;
				
				System.out.println("");
			}
			
			
			
			
			
			
		}
		
		
		

	}

}
