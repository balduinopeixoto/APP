package com.apirh.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;


@Entity
public class FuncionarioHorista extends Funcionario{


private BigDecimal salariohora;


public FuncionarioHorista(BigDecimal salario) {
this.salariohora=salario;

	
}

public BigDecimal getSalariohora() {
	return salariohora;
}
public void setSalariohora(BigDecimal salariohora) {
	this.salariohora = salariohora;
}



	
}
