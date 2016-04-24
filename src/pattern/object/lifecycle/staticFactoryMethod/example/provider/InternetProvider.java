package pattern.object.lifecycle.staticFactoryMethod.example.provider;

import pattern.object.lifecycle.staticFactoryMethod.archi.Provider;
import pattern.object.lifecycle.staticFactoryMethod.archi.Service;
import pattern.object.lifecycle.staticFactoryMethod.example.service.Internet;

public class InternetProvider implements Provider {
	
	private static final Service INTERNET = new Internet();
	
	@Override
	public Service getService() {
		return INTERNET;
	}

}
