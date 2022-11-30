package com.chayma.joueurs.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Equipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long idEqui;
	private String nomEqui;
	private  int nbjoueurEqui;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "equipe")
	private List<Joueur> joueurs;
	
	
	
	
	
	
	
	
	
	

}
