package tn.esprit.spring.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Division;
import tn.esprit.spring.entities.Joueur;
import tn.esprit.spring.entities.MatchFootball;
import tn.esprit.spring.entities.Poste;
import tn.esprit.spring.services.IMatchService;

@RestController
@RequestMapping("/match")
public class MatchController {
	@Autowired
	IMatchService matchService;
	
	@PostMapping("/add/{idEquipe1}/{idEquipe2}")
	@ResponseBody
	public MatchFootball ajouterMatchEtAffecterEquipe(@RequestBody MatchFootball match, @PathVariable("idEquipe1") Integer idEquipe1, @PathVariable("idEquipe2") Integer idEquipe2) {
		return matchService.ajouterMatchFootballEtAffecterEquipe(match, idEquipe1, idEquipe2);
	}
	

	
}
