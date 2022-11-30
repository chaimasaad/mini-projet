package com.chayma.joueurs.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.chayma.joueurs.entities.Equipe;
import com.chayma.joueurs.entities.Joueur;
@RepositoryRestResource(path = "rest")
public interface JoueurRepository extends JpaRepository<Joueur, Long> {
	
	
	List<Joueur> findByNomJoueur(String nom);
	 List<Joueur> findByNomJoueurContains(String nom); 
	
	 @Query("select j from Joueur j where j.nomJoueur like %?1 and j.ageJoueur > ?2")
	 List<Joueur> findByNomAge (String nom, int age);
	
	 @Query("select j from Joueur j where j.equipe = ?1")
	 List<Joueur> findByEquipe (Equipe equipe);
	 List<Joueur> findByEquipeIdEqui(Long id);

	 
	 List<Joueur> findByOrderByNomJoueurAsc();
	 
	 @Query("select j from Joueur j order by j.nomJoueur ASC, j.ageJoueur DESC")
	 List<Joueur> trierJoueursNomsAge ();

	 
	 

	 
}


