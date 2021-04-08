package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {

	private List<Voto> voti;
	public Libretto() {
		this.voti = new ArrayList<>(); 
	}
	public void add(Voto v) {
		this.voti.add(v);
		
	}
	/**
	 * Il toString() del libretto costruisca a mano, 
	 * possiamo iterare sulla lista con for e chiedo
	 * a v di stampare il singolo voto e lo metto a capo
	 */
	public String toString() {
		String s = "";
		for(Voto v: this.voti) {
			s= s + v.toString() + "\n";
		}
		return s;
	}
	
}
