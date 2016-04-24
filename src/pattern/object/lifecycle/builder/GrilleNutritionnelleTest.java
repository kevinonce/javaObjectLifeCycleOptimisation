package pattern.object.lifecycle.builder;

import static org.junit.Assert.*;

import org.junit.Test;

public class GrilleNutritionnelleTest {

	@Test
	public void test() {
		GrilleNutritionnelle filetDePoulet = new GrilleNutritionnelle.
				Builder(100,100).glucides(1.3f).graisses(1.5f).proteines(21).build();
		
		assertEquals(1.3f, filetDePoulet.getGlucides(),0);
		assertEquals(21,filetDePoulet.getProteines(),0);
	}

}
