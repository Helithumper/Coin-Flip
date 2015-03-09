
public class Coin {

	//Instance Fields(Attributes)
	private String face = ""; //String Variables Hold Text
	
	//Methods(Behaivors)
	
	//Constructor, Creates the Object
	public Coin() { }
	
	//Assessors, Returns the value of an Instance Field, Also Called "Getters"
	public String getFace() {return face;}
	
	
	//Mutators, Also Called "Setters", Sets the value of the variable or Instance Field
	public void setFace(String f) { face = f; }
	
	public void flip() {
		//Algorithm, Step-By-Step process for doing something
		int result = (int) (Math.random() * 2); // multiplying a random by 2 will give binary integer
		//Conditional Changes the flow of execution of a program
		if(result == 0) { face = "Heads"; }
		else { face = "Tails"; }
	}
	
	public String toString() {
		return getFace();
	}
}
