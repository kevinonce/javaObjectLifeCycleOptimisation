package pattern.object.lifecycle.singleton;

/* technique optimale pour cr�er un singlton
 * impossible d'instancier un autre objet, m�me par reflexivit�
 * g�re la s�rialisation automatiquement (�vite de cr�er une nouvelle instance
 * � chaque fois que l'objet est d�s�rialis�
 * */
public enum Personne {
	INSTANCE("Once","K�vin");
		
	private String nom;
	private String prenom;
	
	private Personne(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}

	

}
