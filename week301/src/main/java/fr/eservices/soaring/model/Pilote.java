package fr.eservices.soaring.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Pilote {

	@Id
	@GeneratedValue
	public int id;
	
	public String nom;
	public String prenom;
	public Date dateNaissance;
	public String adresse;
	public String codePostal;
	public String ville;
	public String telPortable;

	@OneToMany
	public List<Vol> vols;

	@ManyToOne
	public Club club;

	@OneToMany
	public List<Reservation> reservations;
}
