package pattern.object.lifecycle.staticFactoryMethod.example.provider;

import pattern.object.lifecycle.staticFactoryMethod.archi.Provider;
import pattern.object.lifecycle.staticFactoryMethod.archi.Service;
import pattern.object.lifecycle.staticFactoryMethod.example.service.Telephone;

public class TelephoneProvider implements Provider {

	@Override
	public Service getService() {
		return Telephone.INSTANCE;
	}

}
