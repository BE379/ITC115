//Jason Lee
//Abdiwali Olad

import java.util.Random;

public class RandomWalk {

	public static void main(String[] args) {

		Random rand = new Random();
		int position = randomwalk();


		System.out.print("position = " + position);

	}

	public static int randomwalk() {

		int position = 0;
		int steps = 0;
		int max = 0;
		
		while (position == 3 || position == -3) {
			int randomStep = rand.nextInt(1);
			if (randomStep = 1) {
				position++;
				System.out.print("position = " + position);
			} else (randomStep = -1){
				position--;
				System.out.print("position = " + position)
			}
			System.out.print("max position = " + maxposition);

		}
	}
}
