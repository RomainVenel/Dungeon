import java.util.Scanner;

public class Game {
	
	private Scanner sc = new Scanner(System.in);
	
	public Game() {
		
		askName();
		
		//Heros heros = new Heros(100, nom);
		//System.out.println(heros);
		
	}
	
	private void askName() {
		
		System.out.println("\nMais en fait quel est ton nom d'aventurier?");
		String nom = sc.nextLine();
		System.out.println("Bonjour " + nom + "! Prêt pour l'aventure? Alors c'est parti!");
		
	}
}
