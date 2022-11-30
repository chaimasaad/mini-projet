package com.chayma.joueurs.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Joueur {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idJoueur;
	private int ageJoueur;
	private String nomJoueur ;
	
	@ManyToOne
	private Equipe equipe;
	
	
	
	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Joueur(int ageJoueur, String nomJoueur) {
		super();
		this.ageJoueur = ageJoueur;
		this.nomJoueur = nomJoueur;
	}


	public Long getIdJoueur() {
		return idJoueur;
	}
	public void setIdJoueur(Long idJoueur) {
		this.idJoueur = idJoueur;
	}
	public int getAgeJoueur() {
		return ageJoueur;
	}
	public void setAgeJoueur(int ageJoueur) {
		this.ageJoueur = ageJoueur;
	}
	public String getNomJoueur() {
		return nomJoueur;
	}
	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}


	@Override
	public String toString() {
		return "Joueur [idJoueur=" + idJoueur + ", ageJoueur=" + ageJoueur + ", nomJoueur=" + nomJoueur + "]";
	}


	public Equipe getEquipe() {
		return equipe;
	}


	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
	
	
	

}
