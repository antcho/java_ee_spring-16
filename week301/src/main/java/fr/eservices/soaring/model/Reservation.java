package fr.eservices.soaring.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Reservation implements Serializable {

    @Id
    public int piloteId;

    @Id
    public int repasId;

	@ManyToOne
	@JoinColumn
	public Pilote pilote;

	@ManyToOne
	@JoinColumn
	public Repas repas;

	
	public int nbPersonnes;

}
