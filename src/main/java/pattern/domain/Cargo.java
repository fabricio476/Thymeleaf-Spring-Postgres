package pattern.domain;

import com.aula.model.Funcionario;

public interface Cargo {
	
    void setNome(String nome);
    String getNome();
    String getTipo();
    Long getIdFuncionario();
    String getNomeFuncionario(); 
    Long setIdFuncionario(Long id);
    String setNomeFuncionario(String nome);  
    
    
}