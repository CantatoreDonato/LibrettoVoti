package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {
	public static void main (String[] args) {
	System.out.println("Test metodi libretto");//giusto per stampare qualcosa
	Libretto libretto = new Libretto();
	Voto voto1 = new Voto("Analisi-1", 25, LocalDate.of(2020, 3, 12));
	libretto.add(voto1);
	libretto.add(new Voto("Chimica", 25, LocalDate.of(2020, 7, 15)));
	libretto.add(new Voto("Fisica-1", 30, LocalDate.of(2020, 7, 15)));
	libretto.add(new Voto("Informatica", 24, LocalDate.of(2020, 12, 15)));
	
	System.out.println(libretto);// se qui faccio run mi stampa il reference dell'oggetto libretto, mi stampa la memoria dove quello oggetto vive, e non il libretto.
	List<Voto> venticinque = libretto.listaVotiUguali(25);
	System.out.println(venticinque);
	Libretto librettoventicinque = libretto.votiUguali(25);
	System.out.println(librettoventicinque);
	}
	
}
