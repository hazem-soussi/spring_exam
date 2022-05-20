package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Joueur;

@Repository
public interface JoueurRepository extends JpaRepository<Joueur, Integer> {

}
