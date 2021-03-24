package com.apirh.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class FuncionarioMensalista   extends Funcionario{

private boolean isentodeponto;
private BigDecimal salariomes;
private BigDecimal bonospormes;

public boolean isIsentodeponto() {
	return isentodeponto;
}
public void setIsentodeponto(boolean isentodeponto) {
	this.isentodeponto = isentodeponto;
}
public BigDecimal getSalariomes() {
	return salariomes;
}
public void setSalariomes(BigDecimal salariomes) {
	this.salariomes = salariomes;
}
public BigDecimal getBonospormes() {
	return bonospormes;
}
public void setBonospormes(BigDecimal bonospormes) {
	this.bonospormes = bonospormes;
}




	
}
