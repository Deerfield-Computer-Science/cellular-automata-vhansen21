import java.awt.Color;

public class Recovered extends Virus {

	public Recovered(Location l, World w) {
		super (l,w);
		myLifeSpan = 5;//How do we add the age from the previous creature? 
		myColor=Color.green;
	}
	
}
