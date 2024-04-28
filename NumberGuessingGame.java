//3. Compare the user's guess with the generated number and provide feedback on whether the guess
//is correct, too high, or too low.

import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame{
	public static void main(String[] args){
		Random random=new Random();
		Scanner sc=new Scanner(System.in);
		
		int targetNum=random.nextInt(100)+1;
		
		System.out.println("I have Selected the Random Number between 100 and 1");
		System.out.println("Lets Try to guess it!!");
		
		int guess;
		
		do{
		
			if(guess<targetNum){
				System.out.println("Too Low Try Again");
			}
			else if(guess>targetNum){
				System.out.println("Too High Try Again");
			}
			else
				System.out.println("Congratualtions You guess Correct Number");
		
		}while(guess!=targetNum);
	}
}