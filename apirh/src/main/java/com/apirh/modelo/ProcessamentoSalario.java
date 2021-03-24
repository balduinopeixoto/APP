package com.apirh.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class ProcessamentoSalario {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int mes;
	private int exercicio;
	private LocalDate dataprocessamento;
	@ManyToOne
	private FuncionarioContrato  funcionariocontrato;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getExercicio() {
		return exercicio;
	}
	public void setExercicio(int exercicio) {
		this.exercicio = exercicio;
	}
	public LocalDate getDataprocessamento() {
		return dataprocessamento;
	}
	public void setDataprocessamento(LocalDate dataprocessamento) {
		this.dataprocessamento = dataprocessamento;
	}
	public FuncionarioContrato getFuncionariocontrato() {
		return funcionariocontrato;
	}
	public void setFuncionariocontrato(FuncionarioContrato funcionariocontrato) {
		this.funcionariocontrato = funcionariocontrato;
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
		ProcessamentoSalario other = (ProcessamentoSalario) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
