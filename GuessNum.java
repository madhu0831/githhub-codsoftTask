//2. Prompt the user to enter their guess for the generated number.

import java.util.Random;
import java.util.Scanner;
public class GuessNum{
	public static void main(String []args){
		Random random =new Random();
		Scanner sc=new Scanner(System.in);
		int randomNum=random.nextInt(100)+1;
		System.out.println("Enter Input");
		int input=sc.nextInt();
		
		if(randomNum==input){
			System.out.println("You Guess Correct");
		}
		else
			System.out.println("You Guess Wrong Number . The Number was "+randomNum);
		
	}
}