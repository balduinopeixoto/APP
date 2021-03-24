package com.apirh.modelo;

import java.sql.Time;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ponto {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private LocalDate data;
private Time horaentrada;
private Time horasaida;
@ManyToOne
private Funcionario funcionario;
@ManyToOne
private ParametrizacaoPonto ParametrizacaoPonto ;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public LocalDate getData() {
	return data;
}
public void setData(LocalDate data) {
	this.data = data;
}
public Time getHoraentrada() {
	return horaentrada;
}
public void setHoraentrada(Time horaentrada) {
	this.horaentrada = horaentrada;
}
public Time getHorasaida() {
	return horasaida;
}
public void setHorasaida(Time horasaida) {
	this.horasaida = horasaida;
}
public Funcionario getFuncionario() {
	return funcionario;
}
public void setFuncionario(Funcionario funcionario) {
	this.funcionario = funcionario;
}

public ParametrizacaoPonto getParametrizacaoponto() {
	return ParametrizacaoPonto ;
}
public void setParametrizacaoponto(ParametrizacaoPonto parametrizacaoponto) {
	this.ParametrizacaoPonto  = parametrizacaoponto;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (id ^ (id >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Ponto other = (Ponto) obj;
	if (id != other.id)
		return false;
	return true;
}




}
