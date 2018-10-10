import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	
	
	
	
	Popcorn pop = new Popcorn("fresh");
	
	Microwave mic = new Microwave();
	mic.putInMicrowave(pop);
	mic.setTime(3);
	mic.startMicrowave();
	
	
	mic.thingToBeCooked.applyHeat();
	mic.thingToBeCooked.eat();
	
 }

}
