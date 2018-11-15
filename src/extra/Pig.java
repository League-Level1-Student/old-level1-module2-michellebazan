package extra;
///3. Finish the Pig constructor.
public class Pig {
	

	       private String name;
	       private boolean isSheepHerder;

	       public Pig(String name, boolean canHerdSheep) {
	            // write code here
	    	   this.name = name;
	    	   this.isSheepHerder = canHerdSheep;

	      }
	      public boolean willBecomeBacon() {
	            if(this.isSheepHerder)
	                  return false;
	            else return true;
	      }

	////4. Instantiate two pigs, “Babe” and “Rasher”.


	///5. Imagine there is a pig instance called ziggy. Write code that will print “bacon for breakfast” 
	///if ziggy is destined to be turned into bacon, or “eggs for breakfast” if he is not.
	      
	}   