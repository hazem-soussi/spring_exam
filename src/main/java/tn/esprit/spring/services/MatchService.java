package tn.esprit.spring.services;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Equipe;
import tn.esprit.spring.entities.MatchFootball;
import tn.esprit.spring.repository.EquipeRepository;
import tn.esprit.spring.repository.MatchRepository;

@Service
public class MatchService implements IMatchService {
	@Autowired
	EquipeRepository equipeRepository;
	@Autowired
	MatchRepository matchRepository;
	
	@Override
	public MatchFootball ajouterMatchFootballEtAffecterEquipe(MatchFootball matchFootball, Integer idEquipe1,
			Integer idEquipe2) {
		
		if (idEquipe1 != idEquipe2) {
			Equipe equipe1 = equipeRepository.findById(idEquipe1).orElse(null);
			Equipe equipe2 = equipeRepository.findById(idEquipe2).orElse(null);
			matchFootball.getEquipes().add(equipe1);
			matchFootball.getEquipes().add(equipe2);
			return matchRepository.save(matchFootball);
		}
		
		return matchFootball;
	}

	

}
