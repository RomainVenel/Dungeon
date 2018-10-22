import java.util.Random;

public class Heros extends Personnage {

	private int bourse = 0;

	public Heros(String name, int lifePoints, int bourse) {
		super(name, lifePoints);
		this.bourse = bourse;
	}
	
	protected int hitEnnemy(Monstre monstre) {
		
		int dmg = 20 + (int)(Math.random() * ((50 - 20) + 1));
		monstre.setLifePoints(monstre.getLifePoints() - dmg);
		System.out.println("Vous infligez " +  dmg + " de dommages au monstre.");
		System.out.println("Il lui reste " + monstre.getLifePoints() + " points de vie.");
		
		return monstre.getLifePoints();
		
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
