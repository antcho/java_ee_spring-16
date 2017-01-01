package fr.eservices.soaring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Entity
public class Vol {

	@Id
	@GeneratedValue
	public int id;
	
	public Date date;
	public Date heureDecollage;
	public Date heureAtterrissage;

	@ManyToOne
	public Pilote pilote;

	@ManyToOne
	public Epreuve epreuve;

}
