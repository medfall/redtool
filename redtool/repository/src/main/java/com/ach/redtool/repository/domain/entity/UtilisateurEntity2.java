package com.ach.redtool.repository.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="user2")
public class UtilisateurEntity2 {
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	@Column(name ="NOM")
	private String nom;
	@Column(name ="PRENOM")
	private String prenom;
	@Column(name ="EMAIL")
	private String email;
	
	
	public long getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
