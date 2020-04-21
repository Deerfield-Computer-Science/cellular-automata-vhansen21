import java.awt.Color;

public class Person extends Virus {
	public Person(Location l, World w) {
		super(l,w);
		myLifeSpan = 79;
		myColor = Color.black;
	}

}
