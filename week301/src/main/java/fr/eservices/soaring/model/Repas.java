package fr.eservices.soaring.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Inheritance
public class Repas extends Produit {

	@Id
	@GeneratedValue
	public int id;

	public Date date;
	public Date heure;
	public String menu;

	@OneToMany
	public List<Reservation> reservations;

}
