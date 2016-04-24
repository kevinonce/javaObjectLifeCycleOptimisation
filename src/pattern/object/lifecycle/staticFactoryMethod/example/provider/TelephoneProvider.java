package pattern.object.lifecycle.staticFactoryMethod.example.provider;

import pattern.object.lifecycle.staticFactoryMethod.archi.Provider;
import pattern.object.lifecycle.staticFactoryMethod.archi.Service;
import pattern.object.lifecycle.staticFactoryMethod.example.service.Telephone;

public class TelephoneProvider implements Provider {

	private static final Service TELEPHONE = new Telephone();
	@Override
	public Service getService() {
		return TELEPHONE;
	}

}
