import java.util.ArrayList;
import java.util.Random;

public class Chateau {

	private ArrayList<Piece> pieces = new ArrayList<Piece>();
	Random r = new Random();
	
	public Chateau() {
		
		generateChateau();
		
	}
	
	private void generateChateau() {
		
		int maxPieces = 20;
		int minPieces = 8;
		int ran = r.nextInt(maxPieces - minPieces + 1) + minPieces;
		int ranGenerate = 0;
		
		for (int i = 0; i < ran; i++) {
			ranGenerate = r.nextInt(2);
			if (ranGenerate == 0) {
				generateCouloir();
			}else {
				generateSalle();
			}
		}
		
	}
	
	private void generateCouloir() {
		
		String name;
		int nb = 0;
		
		Couloir couloir = new Couloir(null);
		nb = r.nextInt(6);
		name = couloir.getListName().get(nb);
		couloir.setName(name);
		this.pieces.add(couloir);
		
	}
	
	private void generateSalle() {
		
		String name;
		int nb = 0;
		
		Salle salle = new Salle(null);
		nb = r.nextInt(6);
		name = salle.getListName().get(nb);
		salle.setName(name);
		this.pieces.add(salle);
		
	}

	public ArrayList<Piece> getPieces() {
		return pieces;
	}

	public void setPieces(ArrayList<Piece> pieces) {
		this.pieces = pieces;
	}

	@Override
	public String toString() {
		return "Chateau [pieces=" + pieces + "]";
	}
	
}
