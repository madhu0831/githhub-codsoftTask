//1. Generate a random number within a specified range, such as 1 to 100.

import java.util.Random;
public class RandomNum{
	public static void main(String args[]){
		Random random=new Random();
		int randomNumber = random.nextInt(100) + 1;
		System.out.println("Random Number Between 1 to 100 : "+randomNumber);
	}
}