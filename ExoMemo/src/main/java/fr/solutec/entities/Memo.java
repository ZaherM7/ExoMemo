package fr.solutec.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Memo {
	@Id @GeneratedValue
	Long id;
	String note;
	boolean isPrivate;
	
	@ManyToOne
	User u;
}
