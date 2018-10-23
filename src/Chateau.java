import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Chateau {

	private Heros heros;
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Piece> pieces = new ArrayList<Piece>();
	private boolean leave = false;
	Random r = new Random();
	
	public Chateau() {
		
		askName();
		this.generateChateau();
		this.play();
		
	}
	
	private void askName() {
		
		System.out.println("\nMais en fait quel est ton nom d'aventurier?");
		String nom = sc.nextLine();
		System.out.println("Bonjour " + nom + "! Prêt pour l'aventure? Alors c'est parti!");
		
		this.heros = new Heros(nom, 100, 50);
		
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
		
		String nameMonstre;
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
			SalleMonstre salleMonstre = new SalleMonstre(null, monstre, this.getHeros());
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
				((SalleMonstre) piece).combat();
			}else {
				System.out.print("Vous arrivez dans " + piece.getName() + "!");
			}
			
			if (this.heros.getLifePoints() <= 0) {
				System.out.println("Les ténèbres vous entourent et vous sombrez dans le sommeil éternel...");
				break;
			}
			
			System.out.println("\nVoulez-vous continuer?(O/N)");
			String rep = sc.nextLine();
			if (!(rep.equals("O") || rep.equals("o"))) {
				System.out.println("Vous quittez prématurément le donjon...");
				this.leave = true;
				break;
			}
		}
		if (this.heros.getLifePoints() > 0 && this.leave == false) {
			System.out.println("Bravo ! Vous avez réussi à arriver au bout du donjon ! Vous êtes le véritable héros !");
		}
	}

	public Heros getHeros() {
		return heros;
	}

	public void setHeros(Heros heros) {
		this.heros = heros;
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
