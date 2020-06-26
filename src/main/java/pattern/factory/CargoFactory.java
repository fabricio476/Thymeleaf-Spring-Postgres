package pattern.factory;

import pattern.domain.Supervisor;
import pattern.domain.Auxiliar;
import pattern.domain.Cargo;
import pattern.domain.Consultor;
import pattern.domain.Coordenador;
import pattern.domain.Gerente;


public class CargoFactory implements Factory {
	
    public Cargo escolherCargo(String tipoDeFuncao){
    	
        switch(tipoDeFuncao.toLowerCase()){
            case "Supervisor":
                return new Supervisor();
            case "Gerente":
                return new Gerente();
            case "Coordenador":
                return new Coordenador();
            case "Consultor":
                return new Consultor();
            case "Auxiliar":
                return new Auxiliar();
            default:
                throw new UnsupportedOperationException("Cargo invalido!");
        }
    }
}
