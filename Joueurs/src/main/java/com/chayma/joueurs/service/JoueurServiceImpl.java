package com.chayma.joueurs.service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chayma.joueurs.entities.Equipe;
import com.chayma.joueurs.entities.Joueur;
import com.chayma.joueurs.repos.JoueurRepository;



@Service
public  class JoueurServiceImpl  implements  JoueurService{
	
	
	
	@Autowired
	JoueurRepository  joueurRepository;

	@Override
	public Joueur saveJoueur(Joueur j) {
		
		return joueurRepository.save(j);
	}

	@Override
	public Joueur updateJoueur(Joueur j) {
		
		return joueurRepository.save(j);
	}

	@Override
	public void deleteJoueur(Joueur j) {
		joueurRepository.delete(j);
		
	}

	@Override
	public void deleteJoueurById(Long id) {
		joueurRepository.deleteById(id);
		
	}

	@Override
	public Joueur getJoueur(Long id) {
		
		return joueurRepository.findById(id).get();
	}

	@Override
	public List<Joueur> getAllJoueurs() {
		
		return joueurRepository.findAll();
	}

	
	
	@Override
	public List<Joueur> findByNomJoueur(String nom) {
	return joueurRepository.findByNomJoueur(nom);
	}
	@Override
	public List<Joueur> findByNomJoueurContains(String nom) {
	return joueurRepository.findByNomJoueurContains(nom);
	}
	@Override
	public List<Joueur> findByNomAge(String nom, int age) {
	return joueurRepository.findByNomAge(nom, age);
	}
	@Override
	public List<Joueur> findByEquipe(Equipe equipe) {
	return joueurRepository.findByEquipe(equipe);
	}
	@Override
	public List<Joueur> findByEquipeIdEqui(Long id) {
	return joueurRepository.findByEquipeIdEqui(id);
	}
	@Override
	public List<Joueur> findByOrderByNomJoueurAsc() {
	return joueurRepository.findByOrderByNomJoueurAsc();
	}
	@Override
	public List<Joueur> trierJoueursNomsAge() {
	return joueurRepository.trierJoueursNomsAge();
	}
	
		
	
	
}
