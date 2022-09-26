package personnages;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	public Druide(String nom, int effetPotionMin,int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMax= effetPotionMax;
		this.effetPotionMin= effetPotionMin;
		parler("Bonjour, je suis le druide " + nom + "et ma potion peut aller d'une force " + effetPotionMin + 
				"à" + effetPotionMax + ".");
	}
	public String getName() {
		return nom;
	}
	private void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");		
	}
	private String prendreParole() {
				return "Le druide " + nom + ":";
	}
	
}
