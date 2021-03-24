package com.apirh.modelo;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class FuncionarioContrato {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDate datainicio;
	private LocalDate datafim;
	private boolean activo;
	private String motivocancelamento;
	@ManyToOne
	private Funcionario idfuncionario;
	@ManyToOne
	private TipodeContrato tipodecontrato;
	

	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getDatainicio() {
		return datainicio;
	}
	public void setDatainicio(LocalDate datainicio) {
		this.datainicio = datainicio;
	}
	public LocalDate getDatafim() {
		return datafim;
	}
	public void setDatafim(LocalDate datafim) {
		this.datafim = datafim;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public String getMotivocancelamento() {
		return motivocancelamento;
	}
	public void setMotivocancelamento(String motivocancelamento) {
		this.motivocancelamento = motivocancelamento;
	}
	
	public TipodeContrato getTipodecontrato() {
		return tipodecontrato;
	}
	public void setTipodecontrato(TipodeContrato tipodecontrato) {
		this.tipodecontrato = tipodecontrato;
	}
	
	
	public void setIdfuncionario(Funcionario idfuncionario) {
		this.idfuncionario = idfuncionario;
	}
	public Funcionario getIdfuncionario() {
		return idfuncionario;
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
		FuncionarioContrato other = (FuncionarioContrato) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
}
