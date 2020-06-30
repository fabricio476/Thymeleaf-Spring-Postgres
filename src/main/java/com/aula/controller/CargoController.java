package com.aula.controller;

import com.aula.model.Funcionario;

import pattern.domain.Cargo;
import pattern.factory.CargoFactory;
import pattern.factory.Factory;

public class CargoController {

	
	
	Factory factory = new CargoFactory();
	
	public void cargoDoFuncionario(Funcionario funcionario) {
		
		Cargo cargo = factory.escolherCargo(funcionario.getCargo());
		
		cargo.setIdFuncionario(funcionario.getId());
		
		cargo.setNomeFuncionario(funcionario.getNome());
			
		
	}
	
	
	
	
}
