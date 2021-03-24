package com.apirh.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;




@Entity
public class Contacto {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String tipo;
	private  String contacto;
	@ManyToOne
	private Funcionario funcionario;
	
	public Contacto(String tipo,String contacto,Funcionario funcionario) {
		this.contacto=contacto;
		this.tipo=tipo;
		this.funcionario=funcionario;
		
	}
	
	public Funcionario getfuncionario() {
		return funcionario;
	}
	public void setIdfuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
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
		Contacto other = (Contacto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
}
