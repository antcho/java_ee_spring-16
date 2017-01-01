package fr.eservices.soaring.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Epreuve {
	
	public enum Type {
		AAT,
		AST
	}
	
	public enum Status {
		PREVU,
		ANNULE,
		PROVISOIRE,
		NONOFFICIEL,
		OFFICIEL
	}

	@Id
	@GeneratedValue
	public int id;

	public String jour;

	@OneToMany
	public List<Vol> vols;
	public Type type;
	public Status status;

	@OneToMany
	public List<Secteur> secteurs;
	
	
	

}
