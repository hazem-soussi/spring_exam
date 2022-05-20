package tn.esprit.spring.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@ToString
public class Equipe {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idEquipe;
	
	String nomEquipe;
	
	@Enumerated(EnumType.STRING)
	@NonNull Division division;
	
	String pays;
	
	@OneToMany(mappedBy = "equipe",cascade = CascadeType.REMOVE)
	@JsonIgnore
	@ToString.Exclude
	List<Joueur> joueurs;
	
	@ManyToMany(fetch = FetchType.EAGER, mappedBy="equipes")
	@ToString.Exclude
	@JsonIgnore
	List<MatchFootball> matchs;
}
