package pattern.factory;

import pattern.domain.Cargo;

public interface Factory {
	
	public Cargo escolherCargo(String tipoDeFuncao);
	

}