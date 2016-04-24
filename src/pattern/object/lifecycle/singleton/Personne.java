package pattern.object.lifecycle.singleton;

/* technique optimale pour créer un singlton
 * impossible d'instancier un autre objet, même par reflexivité
 * gère la sérialisation automatiquement (évite de créer une nouvelle instance
 * à chaque fois que l'objet est désérialisé
 * */
public enum Personne {
	INSTANCE("Once","Kévin");
		
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
