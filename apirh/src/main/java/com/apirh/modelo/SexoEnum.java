package com.apirh.modelo;

public enum SexoEnum {
MASCULINO("Masculino"),
FEMENINO("Femenino");
	
private String descricao;	

SexoEnum(String descricao){
this.descricao=descricao;	
}

public String  getDescricao() {
	return descricao;
}
}
