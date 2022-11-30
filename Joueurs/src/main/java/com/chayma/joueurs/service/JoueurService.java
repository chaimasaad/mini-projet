package com.chayma.joueurs.service;

import java.util.List;

import com.chayma.joueurs.entities.Equipe;
import com.chayma.joueurs.entities.Joueur;

public interface JoueurService {
	
	Joueur saveJoueur(Joueur j);
	Joueur updateJoueur(Joueur j);
	void deleteJoueur(Joueur j);
	 void deleteJoueurById(Long id);
	 Joueur getJoueur(Long id);
	List<Joueur> getAllJoueurs();
	List<Joueur> findByNomJoueur(String nom);
	List<Joueur> findByNomJoueurContains(String nom);
	List<Joueur> findByEquipe(Equipe equipe);
	List<Joueur> findByEquipeIdEqui(Long id);
	List<Joueur> findByOrderByNomJoueurAsc();
	List<Joueur> trierJoueursNomsAge();
	List<Joueur> findByNomAge(String nom, int age);

	
	
	
	

}
