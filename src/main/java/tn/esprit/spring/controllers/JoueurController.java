package tn.esprit.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Division;
import tn.esprit.spring.entities.Joueur;
import tn.esprit.spring.entities.Poste;
import tn.esprit.spring.services.IJoueurService;

@RestController
@RequestMapping("/joueur")
public class JoueurController {
	@Autowired
	IJoueurService joueurService;
	
	@PostMapping("/add/{idEquipe}")
	@ResponseBody
	public Joueur ajouterJoueurEtAffecterEquipe(@RequestBody Joueur joueur, @PathVariable("idEquipe") Integer idEquipe) {
		return joueurService.ajouterJoueurEtAffecterEquipe(joueur, idEquipe);
	}
	
	@GetMapping("/afficher1/{poste}/{taille}")
	@ResponseBody
	public List<Joueur> afficherJoueurParPosteEtTaille(@PathVariable("poste") Poste poste, @PathVariable("taille") float taille) {
		return joueurService.afficherJoueursParPosteEtTaille(poste, taille);
	}
	

	}

