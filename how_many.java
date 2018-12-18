import java.util.Random;
import java.util.Scanner;

public class how_many {

	public static void main(String[] args) {
		
		/**
		*
		*	@ Sam Bauer 22
		*	
		**/	
		
		int one =0;
		int two =0;
		int three =0;
		int four =0;
		int five =0;
		int six =0;
		
		
		Scanner bread = new Scanner (System.in);
		Random rand = new Random();
		
		System.out.println("How many times would you like to roll the dice");
		int  rolls =bread.nextInt();
		int dice = rand.nextInt(6) + 1;
		
		for (int i  = 1; i <= rolls;   i++)
		{
			if (dice == 1)
			{
				one++;
			}
			if (dice == 2)
			{
				two++;
			}
			if (dice == 3)
			{
				three++;
			}
			if (dice == 4)
			{
				four++;
			}if (dice == 5)
			{
				five++;
			}if (dice == 6)
			{
				six++;
			}
			
			dice = rand.nextInt(6) + 1;
		}
		
		System.out.println("\nOne was rolled " + one + " times");
		
		System.out.println("\nTwo was rolled " + two + " times");
		
		System.out.println("\nThree was rolled " + three + " times");
		
		System.out.println("\nFour was rolled " + four + " times");
		
		System.out.println("\nFive was rolled " + five + " times");
		
		System.out.println("\nSix was rolled " + six + " times");
		
		System.out.println("\nEND");
	}

}
