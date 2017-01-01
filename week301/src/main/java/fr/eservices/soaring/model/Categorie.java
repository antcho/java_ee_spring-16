package fr.eservices.soaring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Categorie {

	@Id
	@GeneratedValue
	public int id;
	
	public String titre;

	@OneToMany
	public List<Produit> produits;

}
