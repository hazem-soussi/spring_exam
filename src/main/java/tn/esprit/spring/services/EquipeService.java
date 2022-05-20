package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Equipe;
import tn.esprit.spring.repository.EquipeRepository;

@Service
public class EquipeService implements IEquipeService {
	@Autowired
	EquipeRepository equipeRepository;
	
	@Override
	public Equipe ajouterEquipe(Equipe equipe) {
		return equipeRepository.save(equipe);
	}

}
