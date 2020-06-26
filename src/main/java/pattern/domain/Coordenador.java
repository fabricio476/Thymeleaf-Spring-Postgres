package pattern.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coordenador implements Cargo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	
	private String nome;
    private String tipo = "Gerente"; 
	
	
	
	
	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getIdFuncionario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNomeFuncionario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long setIdFuncionario(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setNomeFuncionario(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
