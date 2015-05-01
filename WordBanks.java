
import java.util.ArrayList;
import java.util.Random;

/**
 * A framework for storing lists of words and retrieving words based on length
 * @author Jacob
 *
 */
public class WordBank {

	private ArrayList<String> threeLetters;
	private ArrayList<String> fourLetters;
	private ArrayList<String> fiveLetters;
	private ArrayList<String> sixLetters;
	private ArrayList<String> sevenLetters;
	private ArrayList<String> eightLetters;
	private Random rand;
	
	public WordBank()
	{
		rand = new Random(647);
		
		threeLetters = new ArrayList<String>();
		fourLetters = new ArrayList<String>();
		fiveLetters = new ArrayList<String>();
		sixLetters = new ArrayList<String>();
		sevenLetters = new ArrayList<String>();
		eightLetters = new ArrayList<String>();
		
		// Some stock words to begin with; requires expansion or loading from a file
		threeLetters.add("cat");
		threeLetters.add("dog");
		threeLetters.add("toe");
		threeLetters.add("tap");
		threeLetters.add("bow");
		threeLetters.add("you");
		fourLetters.add("frog");
		fourLetters.add("card");
		fourLetters.add("tape");
		fourLetters.add("ball");
		fourLetters.add("high");
		fourLetters.add("loud");
		fiveLetters.add("oxide");
		fiveLetters.add("knife");
		fiveLetters.add("crazy");
		fiveLetters.add("whale");
		fiveLetters.add("watch");
		fiveLetters.add("chair");
		sixLetters.add("jacket");
		sixLetters.add("gopher");
		sixLetters.add("shroud");
		sixLetters.add("bucket");
		sixLetters.add("window");
		sixLetters.add("finger");
		sevenLetters.add("speaker");
		sevenLetters.add("picture");
		sevenLetters.add("platter");
		sevenLetters.add("sweater");
		sevenLetters.add("handbag");
		sevenLetters.add("skyfall");
		eightLetters.add("trousers");
		eightLetters.add("envelope");
		eightLetters.add("computer");
		eightLetters.add("cylinder");
		eightLetters.add("shoelace");
		eightLetters.add("mechanic");
	}
	
	/**
	 * Gets a random word of specified length
	 * @param numLetters the number of letters in the desired word
	 * @return a word with number of letters numLetters
	 */
	public String getNewWord(int numLetters)
	{
		if (numLetters == 3)
			return threeLetters.get(rand.nextInt(threeLetters.size()));
		else if (numLetters == 4)
			return fourLetters.get(rand.nextInt(fourLetters.size()));
		else if (numLetters == 5)
			return fiveLetters.get(rand.nextInt(fiveLetters.size()));
		else if (numLetters == 6)
			return sixLetters.get(rand.nextInt(sixLetters.size()));
		else if (numLetters == 7)
			return sevenLetters.get(rand.nextInt(sevenLetters.size()));
		else if (numLetters == 8)
			return eightLetters.get(rand.nextInt(eightLetters.size()));
		else
			return "";
	}
}
