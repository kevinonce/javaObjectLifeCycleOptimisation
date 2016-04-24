package pattern.object.lifecycle.staticFactoryMethod.example.provider;

import pattern.object.lifecycle.staticFactoryMethod.archi.Provider;
import pattern.object.lifecycle.staticFactoryMethod.archi.Service;
import pattern.object.lifecycle.staticFactoryMethod.example.service.Internet;

public class InternetProvider implements Provider {
	
	@Override
	public Service getService() {
		return Internet.INSTANCE;
	}

}
