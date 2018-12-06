package extra;

public class TeaParty {

	/// creating variables
	String name;

	boolean isWoman;
	boolean isKnighted;

	/// setting variables
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		
		this.name = name;
		this.isWoman = isWoman;
		this.isKnighted = isKnighted;
		
		if (isWoman == true) {
			name = "Ms. " + name;
		}else if (isKnighted == true) {
			name = "Sir " + name;
		}
		else if (isWoman == false) {
			name = "Mr. " + name;
		}
		
		return "Hello " + name;
	}
	
	
	
}

/**
 * Jane Austen is a woman, so say “Hello Ms. Austen”. George Orwell is a man, so
 * say “Hello Mr. Orwell”. Isaac Newton was knighted, so say "Hello Sir Isaac
 * Newton".
 **/
