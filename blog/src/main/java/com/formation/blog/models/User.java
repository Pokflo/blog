package com.formation.blog.models;

import java.util.Date;

public class User {
	private String email;
	private String nom;
	private String prenom;
	private String mdp;
	private Date naissance;
	private int role;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public Date getNaissance() {
		return naissance;
	}

	public void setNaissance(Date naissance) {
		this.naissance = naissance;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User{" +
				"email='" + email + '\'' +
				", nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", mdp='" + mdp + '\'' +
				", naissance=" + naissance +
				", role=" + role +
				'}';
	}
}
