package pattern.object.lifecycle.staticFactoryMethod.example.service;

import pattern.object.lifecycle.staticFactoryMethod.archi.Service;

public enum Internet implements Service {
	
	INSTANCE;
	
	public static final String NAME = "Internet";

	@Override
	public String getName() {
		return NAME;
	}

}
