package tp2;


/**
 * Classe permettant la représentation d'un étudiant
 * @author Virginie Van den Schrieck
 */
public class Etudiant {
	//Variables d'instance
	private String nom;
	private String prénom;
	private int matricule;
	//Cette variable d'instance est du type Date, disponible dans le même package
	private Date dateNaissance;
	
	
	
	
	
	
	
	
	/**
	 * @param nom
	 * @param prénom
	 * @param matricule
	 * @param dateNaissance
	 */
	public Etudiant(String nom, String prénom, int matricule, Date dateNaissance) {
		super();
		setNom(nom);
		setPrénom(prénom);
		this.matricule = matricule;
		this.dateNaissance = dateNaissance;
	}

	
	/**
	 * 
	 */
	public Etudiant() {
		super();
		setNom("Toto");
		setPrénom("Dupont");
		this.matricule = 1234;
		this.dateNaissance = new Date();
	}





	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prénom
	 */
	public String getPrénom() {
		return prénom;
	}

	/**
	 * @param prénom the prénom to set
	 */
	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}


	/**
	 * @return the matricule
	 */
	public int getMatricule() {
		return matricule;
	}

	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	/**
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * Permet de changer la date de naissance par une nouvelle date. 
	 * La date doit être postérieur à 1900, sinon le changement n'est pas effectué. 
	 * @param dateNaissance date dont l'année est plus grande que 1900
	 */
	public void setDateNaissance(Date dateNaissance) {
		if(dateNaissance.année > 1900) {
			this.dateNaissance = dateNaissance;
		}
		//else Notification d'erreur
	}

	public String toString() {
		return "L'étudiant s'appelle " + prénom + " " + nom; 
	}


	/*
	 * Méthode main qui crée un étudiant et initialise les variables d'instance au départ de la ligne de commande
	 * 
	 */
	public static void main(String[] args) {
		Etudiant etu = new Etudiant();
		etu.setNom(args[0]);
		etu.setPrénom(args[1]);
		etu.setMatricule(Integer.parseInt(args[2]));
		Date dateNaissance = new Date();
		dateNaissance.jour = Integer.parseInt(args[3]);
		dateNaissance.mois = Integer.parseInt(args[4]);
		dateNaissance.année = Integer.parseInt(args[5]);
		etu.setDateNaissance(dateNaissance);
		System.out.println(etu);
	}

}
