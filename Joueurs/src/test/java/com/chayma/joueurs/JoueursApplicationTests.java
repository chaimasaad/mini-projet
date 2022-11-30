package com.chayma.joueurs;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.chayma.joueurs.entities.Equipe;
import com.chayma.joueurs.entities.Joueur;
import com.chayma.joueurs.repos.JoueurRepository;

@SpringBootTest
class JoueursApplicationTests {
	@Autowired
	private JoueurRepository joueurRepository;
	
	
	
	
	

	@Test
	 public void testCreateJoueur() {
		Joueur jou = new Joueur ( 25 ,"Bilel");
		joueurRepository.save(jou);
	}
	
	@Test
	public void testFindJoueur()
	{
	Joueur j = joueurRepository.findById(1L).get(); 
	System.out.println(j);
	}
	
	@Test
	public void testUpdateJoueur()
	{
		Joueur j = joueurRepository.findById(1L).get();
	j.setNomJoueur("ala");
	joueurRepository.save(j);
	}
	@Test
	public void testDeleteJoueur()
	{
	joueurRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousJoueurs()
	{
	List<Joueur> jous = joueurRepository.findAll();
	for (Joueur j : jous)
	{
	System.out.println(j);
	}
	
	
	}
	 @Test
	 public void testFindByNomJoueur()
	 {
	 List<Joueur> jous = joueurRepository.findByNomJoueur("Mohamed");
	 for (Joueur j : jous)
	 {
	 System.out.println(j);
	 }
	 }


	 @Test
	 public void testFindByNomJoueurContains ()
	 {
	 List<Joueur> jous=joueurRepository.findByNomJoueurContains("Haroun");
	 for (Joueur j : jous)
	 {
	 System.out.println(j);
	 } 




	 }
	 @Test
	 public void testfindByNomAge()
	 {
	 List<Joueur> jous = joueurRepository.findByNomAge("Ayoub", 30);
	 for (Joueur j : jous)
	 {
	 System.out.println(j);
	 }
	 }
 
	 @Test
	 public void testfindByEquipe()
	 {
	 Equipe equi = new Equipe();
	 equi.setIdEqui(1L);
	
	 List<Joueur> jous = joueurRepository.findByEquipe(equi);
	 for (Joueur j : jous)
	 {
	 System.out.println(j);
	 }
	 }

	 @Test
	 public void findByCategorieIdCat()
	 {
	 List<Joueur> jous = joueurRepository.findByEquipeIdEqui(1L);
	 for (Joueur j : jous)
	 {
	 System.out.println(j);
	 }
	  }
	 @Test
	 public void testfindByOrderByNomJoueurAsc()
	 {
	 List<Joueur> jous = 
	 joueurRepository.findByOrderByNomJoueurAsc();
	 for (Joueur j : jous)
	 {
	 System.out.println(j);
	 }
	 }

	 @Test
	 public void testTrierJoueursNomsAge()
	 {
	 List<Joueur> jous = joueurRepository.trierJoueursNomsAge();
	 for (Joueur j : jous)
	 {
	 System.out.println(j);
	 }
	 }


	 
	 
	 
}
