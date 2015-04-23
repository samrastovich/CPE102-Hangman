
import java.util.ArrayList;
import java.util.Random;

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
		
		threeLetters.add("cat");
		fourLetters.add("frog");
		fiveLetters.add("house");
		sixLetters.add("jacket");
		sevenLetters.add("speaker");
		eightLetters.add("shoelace");
	}
	
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
	
	public String get3word()
	{
		return threeLetters.get(ran.nextInt(threeLetters.size()));
	}
	
	public String get4word()
	{
		return fourLetters.get(ran.nextInt(fourLetters.size()));
	}
	
	public String get5word()
	{
		return fiveLetters.get(ran.nextInt(fiveLetters.size()));
	}
	
	public String get6word()
	{
		return sixLetters.get(ran.nextInt(sixLetters.size()));
	}
	
	public String get7word()
	{
		return sevenLetters.get(ran.nextInt(sevenLetters.size()));
	}
	
	public String get8word()
	{
		return eightLetters.get(ran.nextInt(eightLetters.size()));
	}
	
}
