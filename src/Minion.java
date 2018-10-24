
public class Minion {
	///creating variables
	String Name;
	int Eyes; 
	String Color;
	String Master;
	///setting variables
	public Minion(String Name, int Eyes, String Color, String Master) {
		this.Name = Name;
		this.Eyes = Eyes;
		this.Color = Color;
		this.Master = Master; 
		
	}
	///getters
	public String getName() {
		return Name;
	}
	
	public int getEyes() {
		return Eyes;
	}
	
	public String getColor() {
		return Color;
	}
	
	public String getMaster() {
		return Master;
	}
	///setter
	void setMaster(String m) {
		Master = m;
	}
}