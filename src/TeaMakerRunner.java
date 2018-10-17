

public class TeaMakerRunner {
public static void main(String[] args) {
	
	TeaBag tea = new TeaBag("Passion Fruit");
	Cup cup = new Cup();
	Kettle ket = new Kettle();
	
	
	ket.getWater();
	ket.boil();
	tea.getFlavor();
	

	cup.makeTea(tea, ket.getWater());
 }

}
