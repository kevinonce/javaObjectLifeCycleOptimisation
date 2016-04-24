package pattern.object.lifecycle.staticFactoryMethod.example;

import static org.junit.Assert.*;

import org.junit.Test;

import pattern.object.lifecycle.staticFactoryMethod.archi.Service;
import pattern.object.lifecycle.staticFactoryMethod.archi.Services;
import pattern.object.lifecycle.staticFactoryMethod.example.provider.InternetProvider;
import pattern.object.lifecycle.staticFactoryMethod.example.provider.TelephoneProvider;
import pattern.object.lifecycle.staticFactoryMethod.example.service.Internet;
import pattern.object.lifecycle.staticFactoryMethod.example.service.Telephone;

public class StaticFactoryMethodTest {

	@Test
	public void test() {
		InternetProvider internetProvider = new InternetProvider();
		TelephoneProvider telephoneProvider = new TelephoneProvider();
		
		Services.registerDefaultProvider(internetProvider);
		Services.registerProvider(Telephone.NAME, telephoneProvider);
		
		Service telephone = Services.getService(Telephone.NAME);
		Service internet = Services.getService();
		
		assertTrue(internet instanceof Internet );
		assertTrue(telephone instanceof Telephone);
		
		assertTrue(telephone == Services.getService(Telephone.NAME));
		assertTrue(internet == Services.getService());
	}

}
