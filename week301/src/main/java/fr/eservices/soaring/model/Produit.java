package fr.eservices.soaring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produit {

	@Id
	@GeneratedValue
	public int id;
	
	public String libelle;
	public Float prixUnitaire;

	@ManyToOne
	public Categorie categorie;
}
