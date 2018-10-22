import java.util.ArrayList;

public class Monstre extends Personnage{
	
	private ArrayList<String> listName = new ArrayList<String>();

	public Monstre(String name, int lifePoints) {
		super(name, lifePoints);
		generateName();
	}
	
	private void generateName() {
			
			String name1 = "un orc gigantesque muni d'une massue...";
			String name2 = "une chauve-souris géante...";
			String name3 = "un lion à 3 têtes...";
			String name4 = "un elf à priori innofensif...";
			String name5 = "une statue de pierre...";
			String name6 = "un nain alcolique...";
			
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
		return "Monstre [name=" + this.getName() + "]";
	}
	
}
