package pattern.object.lifecycle.avoidUselessInstanciation;

//exemple du problème de l'autoBoxing, préférez les types primitifs au wrapper
public class AutoBoxingProblemMain {
	
	public static void main(String[] args) {
		Long sumWrapper = 0L;
		long sumPrimitive = 0l;
		long startTime,endTime,resultWrapper, resultPrimitive;
		
		System.out.println("Execution sans wrapper: ");
		startTime = System.currentTimeMillis();
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sumPrimitive += i;
		}
		endTime = System.currentTimeMillis();
		System.out.println(sumPrimitive);
		resultPrimitive = endTime-startTime;
		System.out.println("temps d'exécution: "+(endTime-startTime));
		
		System.out.println("Execution avec wrapper: ");
		startTime = System.currentTimeMillis();
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sumWrapper += i;
		}
		endTime = System.currentTimeMillis();
		System.out.println(sumWrapper);
		resultWrapper = endTime-startTime;
		System.out.println("temps d'exécution: "+(endTime-startTime));
		
		System.out.println();
		System.out.println("wrapper "+(resultWrapper/resultPrimitive)+ " fois plus lent !!!");
	}
}
