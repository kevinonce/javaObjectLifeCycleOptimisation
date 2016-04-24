package pattern.object.lifecycle.staticFactoryMethod.example.service;

import pattern.object.lifecycle.staticFactoryMethod.archi.Service;

public enum Telephone implements Service {

	INSTANCE;
	
	public static final String NAME = "Phone";
	
	@Override
	public String getName() {
		return NAME;
	}

}
