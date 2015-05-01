
import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
	
	public WordBank() throws FileNotFoundException
	{
		rand = new Random();
		
		threeLetters = new ArrayList<String>();
		fourLetters = new ArrayList<String>();
		fiveLetters = new ArrayList<String>();
		sixLetters = new ArrayList<String>();
		sevenLetters = new ArrayList<String>();
		eightLetters = new ArrayList<String>();
		
		loadWords("wordlists.txt");
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
	/**
	 * Framework to pull words from file
	 * @param input the name of the file to load from
	 * @throws FileNotFoundException
	 */
	public void loadWords(String input) throws FileNotFoundException
	{
		File inputFile = new File(input);
		Scanner in = new Scanner(inputFile);
		
		while ( in.hasNext() )
			storeWord( in.next() );
		
		in.close();		
	}
	/**
	 * Loads a word into the word banks. Automatically sorts by word length
	 * @param word the word to load
	 */
	public void storeWord(String word)
	{
		int length = word.length();
		
		if (length == 3)
			threeLetters.add(word);
		else if (length == 4)
			fourLetters.add(word);
		else if (length == 5)
			fiveLetters.add(word);
		else if (length == 6)
			sixLetters.add(word);
		else if (length == 7)
			sevenLetters.add(word);
		else if (length == 8)
			eightLetters.add(word);
		else
			System.out.println("Word is wrong size");
	}
}
