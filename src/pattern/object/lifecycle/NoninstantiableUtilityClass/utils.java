package pattern.object.lifecycle.NoninstantiableUtilityClass;

public class utils {

	private static final String METHODE_UTILE = "METHODE SUPER UTILE";
	
	//empeche l'instanciation de la classe, meme par reflexion
	private utils() {
		throw new IllegalAccessError("Une classe utilitaire ne doit pas etre instanciee !");
	}
	public static String methodeUtil1(){
		return METHODE_UTILE;
	};
	
	public static String methodeUtil2(){
		return METHODE_UTILE;
	};
	
	public static String methodeUtil3(){
		return METHODE_UTILE;
	};
	
}
