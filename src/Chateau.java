import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Chateau {

	private Scanner sc = new Scanner(System.in);
	private ArrayList<Piece> pieces = new ArrayList<Piece>();
	Random r = new Random();
	
	public Chateau() {
		
		this.generateChateau();
		this.play();
		
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
	
	private Monstre generateMonstre() {
		
		String name, nameMonstre;
		int nb = 0;

		nb = r.nextInt(6);
		Monstre monstre = new Monstre(null, 100);
		nameMonstre = monstre.getListName().get(nb);
		monstre.setName(nameMonstre);
		
		return monstre;
		
	}
	
	private void generateSalle() {
		
		String name;
		int nb = 0;
		int randomSalle = 0;
		
		randomSalle = r.nextInt(3);
		nb = r.nextInt(6);
		
		if(randomSalle == 1 || randomSalle == 2) {
			Monstre monstre = this.generateMonstre();
			SalleMonstre salleMonstre = new SalleMonstre(null, monstre);
			name = salleMonstre.getListName().get(nb);
			salleMonstre.setName(name);
			this.pieces.add(salleMonstre);
		}else {	
			Salle salle = new Salle(null);
			nb = r.nextInt(6);
			name = salle.getListName().get(nb);
			salle.setName(name);
			this.pieces.add(salle);
		}
		
	}
	
	private void play() {
		
		System.out.println("Vous ouvrez la prochaine porte et ");
		for (Piece piece : pieces) {
			if(piece instanceof SalleMonstre) {
				System.out.print("Vous arrivez dans " + piece.getName());
				System.out.print(" et vous faites face à " + ((SalleMonstre) piece).getMonstre().getName() + "!");
			}else {
				System.out.print("Vous arrivez dans " + piece.getName() + "!");
			}
			System.out.println("\nVoulez-vous continuer?(O/N)");
			String rep = sc.nextLine();
			if (rep.equals("O") || rep.equals("o")) {
				continue;
			}else {
				System.out.println("Vous quittez prématurément le donjon...");
				break;
			}
		}
		
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
