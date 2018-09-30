
public class Personnage {

	private String name;
	private int lifePoints = 100;
	
	public Personnage(String name, int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLifePoints() {
		return lifePoints;
	}

	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}

	@Override
	public String toString() {
		return "Personnage [name=" + name + ", lifePoints=" + lifePoints + "]";
	}
		
}
