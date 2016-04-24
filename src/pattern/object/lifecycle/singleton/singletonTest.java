package pattern.object.lifecycle.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class singletonTest {

	@Test
	public void test() {
		assertEquals("Once",Personne.INSTANCE.getNom());
		assertEquals("Kévin",Personne.INSTANCE.getPrenom());
	}

}
