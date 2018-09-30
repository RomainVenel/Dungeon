import java.util.ArrayList;

public class Couloir extends Piece {

	private ArrayList<String> listName = new ArrayList<String>();

	public Couloir(String name) {
		super(name);
		generateName();
	}

	private void generateName() {
		
		String name1 = "un couloir sombre où on ne voit rien...";
		String name2 = "un couloir éclairé par un grand chandelier...";
		String name3 = "un couloir sans issues...";
		String name4 = "un couloir austère où des dizaines de chauves-souris volent au-dessus de votre tête...";
		String name5 = "un couloir à priori infini...";
		String name6 = "un couloir dont les murs partent en morceaux...";
		
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
		return "Couloir [name=" + this.getName() + "]";
	}

}
