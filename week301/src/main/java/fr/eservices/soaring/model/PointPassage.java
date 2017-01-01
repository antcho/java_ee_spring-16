package fr.eservices.soaring.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class PointPassage {

	@Id
	@GeneratedValue
	public int id;
	
	public String nom;
	public int lattitude;
	public int longitude;
	public String description;

	@OneToMany
	public List<Secteur> secteurs;

}
