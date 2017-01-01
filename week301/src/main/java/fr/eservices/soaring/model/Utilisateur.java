package fr.eservices.soaring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Utilisateur {

	@Id
	@GeneratedValue
	public int identifiant;

	public String motDePasse;
	public String nom;
	public String prenom;

	@ManyToOne
	public Profil profil;

}
