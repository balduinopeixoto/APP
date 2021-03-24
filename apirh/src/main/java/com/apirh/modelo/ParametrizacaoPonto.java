package com.apirh.modelo;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class ParametrizacaoPonto {
@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalTime horaentrada;
	private LocalTime horasaida;
	private int qtdhorasdias;
		
	public ParametrizacaoPonto(LocalTime horaentrada,LocalTime horasaida,int qtdhorasdias) {
		
		this.horaentrada=horaentrada;
		this.horasaida=horasaida;
		this.qtdhorasdias=qtdhorasdias;
		
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalTime getHoraentrada() {
		return horaentrada;
	}
	public void setHoraentrada(LocalTime horaentrada) {
		this.horaentrada = horaentrada;
	}
	public LocalTime getHorasaida() {
		return horasaida;
	}
	public void setHorasaida(LocalTime horasaida) {
		this.horasaida = horasaida;
	}
	public int getQtdhorasdias() {
		return qtdhorasdias;
	}
	public void setQtdhorasdias(int qtdhorasdias) {
		this.qtdhorasdias = qtdhorasdias;
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
		ParametrizacaoPonto other = (ParametrizacaoPonto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
}
