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
	public List<Voto> listaVotiUguali(int punteggio){
	//creo una lista nuova ed aggiungo i voti uguali
	//ricorda che l'oggetto v è lo stessso che appartiene
	//alle 2 liste diverse, perchèsino a che non faccio new
	//v rappresenta quell'oggetto.	
		List<Voto> risultato =  new ArrayList<>();
		for(Voto v : this.voti) {
			if(v.getVoto() == punteggio) {
				risultato.add(v);
			}		
		}
		return risultato;
	}
	public Libretto votiUguali (int punteggio) {
		Libretto risultato = new Libretto();
		for(Voto v: this.voti) {
			if (v.getVoto()==punteggio){
				risultato.add(v);
			}
		}
	return risultato;
	}
	/**
	 * Il toString() della classe Libretto costruisce a mano, 
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
