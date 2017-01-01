package fr.eservices.soaring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Secteur implements Serializable {

	@Id
	public int epreuveId;

	@Id
	public int pointPassageId;

	@ManyToOne
	@JoinColumn
	public PointPassage pointPassage;

	@ManyToOne
	@JoinColumn
	public Epreuve epreuve;

	public int rayon;
	public String type;

}
