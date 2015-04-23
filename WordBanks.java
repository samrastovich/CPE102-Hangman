
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
	private Random ran;
	
	public WordBank()
	{
		Random ran = new Random();
		
		ArrayList<String> threeLetters = new ArrayList<>();
		ArrayList<String> fourLetters = new ArrayList<>();
		ArrayList<String> fiveLetters = new ArrayList<>();
		ArrayList<String> sixLetters = new ArrayList<>();
		ArrayList<String> sevenLetters = new ArrayList<>();
		ArrayList<String> eightLetters = new ArrayList<>();
		
		// Some stock words to begin with; requires expansion or loading from a file
		threeLetters.add("cat");
		fourLetters.add("frog");
		fiveLetters.add("house");
		sixLetters.add("jacket");
		sevenLetters.add("speaker");
		eightLetters.add("shoelace");
	}
	
	/**
	 * Gets a random word of specified length
	 * @param numLetters the number of letters in the desired word
	 * @return a word with number of letters numLetters
	 */
	public String getNewWord(int numLetters)
	{
		if (numLetters == 3)
			return threeLetters.get(ran.nextInt(threeLetters.size()));
		if (numLetters == 4)
			return fourLetters.get(ran.nextInt(fourLetters.size()));
		if (numLetters == 5)
			return fiveLetters.get(ran.nextInt(fiveLetters.size()));
		if (numLetters == 6)
			return sixLetters.get(ran.nextInt(sixLetters.size()));
		if (numLetters == 7)
			return sevenLetters.get(ran.nextInt(sevenLetters.size()));
		if (numLetters == 8)
			return eightLetters.get(ran.nextInt(eightLetters.size()));
		else
			return "";
	}
}
