
public class Piece {

	private String name;

	public Piece(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Piece [name=" + name + "]";
	}
	
}
