import java.util.Random;

public class MakeGuesses {

	public static void main(String[] args) {

		Random rand = new Random();
		int numGuess = makeGuesses(rand);
		System.out.print("total guess = " + numGuess);

	}

	public static int makeGuesses(Random rand) {
		//
		int numGuess = 0;
		int goose = 0;
		while (goose < 48) {
			goose = rand.nextInt(51);
			System.out.print("guess = " + goose);
			System.out.println();
			numGuess++;
		}
		return numGuess;
	}
}
