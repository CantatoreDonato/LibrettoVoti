package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

//POJO - Plain Old Java Object
//Java bean - classe che non ha logica contiene solo dati
/**
 * Memorizza risultato di un esame singolo
 * @author utente
 *
 */
public class Voto {
	private String nome;
	private int voto;// 30L come lo rappresento?
	private LocalDate data; //esame superato
	
/**
 * Costruttore della classe voto
 * @param nome Nome del corso superato
 * @param voto Voto ottenuto
 * @param data Data dell'esame
 */
	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Esame " + nome + " superato con " + voto + " il " + data;
	}
	
	
	
	
	
}
