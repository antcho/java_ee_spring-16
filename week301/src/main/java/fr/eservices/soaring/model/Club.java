package fr.eservices.soaring.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Club {

	@Id
	@GeneratedValue
	public int id;
	
	public String nom;
	public String ville;

	@OneToMany
	public List<Pilote> pilotes;

	@ManyToOne
	public Region region;

}
