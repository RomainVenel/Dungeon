
public class SalleMonstre extends Salle{
	
	private Monstre monstre;

	public SalleMonstre(String name, Monstre monstre) {
		super(name);
		this.monstre = monstre;
	}

	public Monstre getMonstre() {
		return monstre;
	}

	public void setMonstre(Monstre monstre) {
		this.monstre = monstre;
	}

	@Override
	public String toString() {
		return "SalleMonstre [monstre=" + monstre + ", name=" + this.getName() + "]";
	}
	
	

}
