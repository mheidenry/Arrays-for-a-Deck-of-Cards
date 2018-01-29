//base code for a simple card game
import java.util.Random;

public class DeckOfCards {

	public static void main(String[] args) {
		
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		int[] value = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };

		Random randomNum = new Random();
		int max, min, c1;
		max = 12;
		min = 0;

		// this will generate a random number
		c1 = min + randomNum.nextInt(max);
		 
		//output test
		System.out.println(ranks[c1]);
		 
	}
}
