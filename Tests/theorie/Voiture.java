package theorie;

/**
 * Modélise les caractéristiques principales d'une voiture et permet la gestion du kilométrage. 
 *
 * @author V. Van den Schrieck
 */
public class Voiture{
   	/**
	 * Le nom du fabriquant de la voiture.
	 */ 
	private String marque;
	/**
	 * La couleur de la voiture telle qu'indiquée dans le catalogue du fabriquant.
	 */
	private String couleur;
	/**
	 * Correspond au kilométrage indiqué sur le compteur.
	 */
	private int kilometrage;
	
	//Accesseurs
	
	/**
	 * Fournit la valeur actuelle du kilometrage.
	 *
	 * @return le nombre de kilomètres indiqués sur le compteur de la voiture
	 */
	 public int getKilometrage(){
	 	return kilometrage;
	 }
	/**
	 * Remplace la valeur du kilometrage par la valeur indiquée. 
	 * Le kilométrage ne peut qu'augmenter, donc l'opération n'est 
	 * effectuée que si le nouveau kilométrage est supérieur à l'ancien.
	 *
	 * @param km La nouvelle valeur du kilometrage de cette voiture. 
	 */
	 public void setKilometrage(int km){
		this.kilometrage = km;
	 }
	
	//Méthodes
	
	/**
	 * Permet de simuler le parcours d'un trajet. 
	 * Met à jour le compteur en fonction des kilomètres parcourus. 
	 * 
	 * @param km le nombre de kms parcourus à ajouter au kilométrage.
	 */
	public void roule(int km){			   
		kilometrage = kilometrage+km;
	}
	//Méthode main
	
	/**
	 * La méthode main est le point de départ de 
	 * l'exécution du programme. 
	 *
	 * @param args 	Les arguments de la ligne de commande. 
     *				Le premier argumetn est la marque de la voiture à créer, 
	 *				Le second est sa couleur,
	 * 				Et le troisième est son kilométrage initial. 
	 */
	 public static void main(String [] args){
	 	Voiture maVoiture = new Voiture();
		
		maVoiture.kilometrage = 10000;
		maVoiture.setKilometrage(100);
	 }
}