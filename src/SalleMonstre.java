
public class SalleMonstre extends Salle{
	
	private Monstre monstre;
	private Heros heros;

	public SalleMonstre(String name, Monstre monstre, Heros heros) {
		super(name);
		this.monstre = monstre;
		this.heros = heros;
	}
	
	protected void combat() {
		
		while (this.heros.getLifePoints() > 0 && this.monstre.getLifePoints() > 0) {
			this.heros.hitEnnemy(this.monstre);
			if (this.monstre.getLifePoints() <= 0) {
				System.out.println("Le monstre est mort !");
				break;
			}
			this.monstre.hitEnnemy(this.heros);
			if (this.heros.getLifePoints() <= 0) {
				System.out.println("Vous êtes mort !");
				break;
			}
		}
		
	}

	public Monstre getMonstre() {
		return monstre;
	}

	public void setMonstre(Monstre monstre) {
		this.monstre = monstre;
	}
	
	public Heros getHeros() {
		return heros;
	}

	public void setHeros(Heros heros) {
		this.heros = heros;
	}

	@Override
	public String toString() {
		return "SalleMonstre [monstre=" + monstre + ", name=" + this.getName() + "]";
	}
	
	

}
