
public class Heros extends Personnage {

	private int bourse = 0;

	public Heros(String name, int lifePoints, int bourse) {
		super(name, lifePoints);
		this.bourse = bourse;
	}

	public int getBourse() {
		return bourse;
	}

	public void setBourse(int bourse) {
		this.bourse = bourse;
	}

	@Override
	public String toString() {
		return "Heros [bourse=" + bourse + "]";
	}

}
