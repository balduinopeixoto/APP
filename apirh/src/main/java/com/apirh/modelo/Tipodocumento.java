package com.apirh.modelo;

public enum Tipodocumento {
BI("Bilhete de Identidade"),
PASSAPORTE("Passaporte"),
OUTROS("Outros");

private String descricao;	

Tipodocumento (String descricao){
this.descricao=descricao;	
}

public String  getDescricao() {
	return descricao;
}
}
