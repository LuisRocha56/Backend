package com.microservice.celulares.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "celulares")
public class Celular implements Serializable{

	private static final long serialVersionUID = 8550556477721078417L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //Para auto-generar el ID
	private Long id;
	
	private String name;
	
	private String marca;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Date getCreatedAt() {
		return createAt;
	}

	public void setCreatedAt(Date createAt) {
		this.createAt = createAt;
	}
	
}
