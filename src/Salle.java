import java.util.ArrayList;

public class Salle extends Piece {

	private ArrayList<String> listName = new ArrayList<String>();

	public Salle(String name) {
		super(name);
		generateName();
	}

	private void generateName() {
		
		String name1 = "une salle vide...";
		String name2 = "une salle éclairée par un grand chandelier...";
		String name3 = "une salle sans issues...";
		String name4 = "une salle avec un monstre géant qui vous surveille...";
		String name5 = "une salle avec un trésor flamboyant...";
		String name6 = "une salle miteuse...";
		
		this.listName.add(name1);
		this.listName.add(name2);
		this.listName.add(name3);
		this.listName.add(name4);
		this.listName.add(name5);
		this.listName.add(name6);
		
	}

	public ArrayList<String> getListName() {
		return listName;
	}

	public void setListName(ArrayList<String> listName) {
		this.listName = listName;
	}

	@Override
	public String toString() {
		return "Salle [name=" + this.getName() + "]";
	}

}
