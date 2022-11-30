package com.chayma.joueurs.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomJou", types = { Joueur.class })

public interface JoueurProjection {

	public String getNomJoueur();

	
}
