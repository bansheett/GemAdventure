package GiocoTurni;

import java.util.ArrayList;

public class Personaggio extends StatisticheBase {
	
	private ArrayList<String> inventarioPg1 = new ArrayList<String> ();
	private ArrayList<String> inventarioPg2 = new ArrayList<String> ();
	

	public ArrayList<String> getInventarioPg2() {
		return inventarioPg2;
	}

	public void setInventarioPg2(ArrayList<String> inventarioPg2) {
		this.inventarioPg2 = inventarioPg2;
	}

	public ArrayList<String> getInventarioPg1() {
		return inventarioPg1;
	}

	public void setInventarioPg1(ArrayList<String> inventarioPg1) {
		this.inventarioPg1 = inventarioPg1;
	}

	public Personaggio(int livello, String nome, int attacco, int velocità,int vitaMassima, int abilitàDanno, String abilitàNome, int exp) {
		super(livello, nome, attacco, velocità, vitaMassima , abilitàDanno, abilitàNome, exp);
		
	}

	public void statisticheBaseAlleati() {
		System.out.println();
		livello = getLivello();
		nome = getNome();
		attacco = getAttacco();
		velocità = getVelocità();
		vita = getVita();
		vitaMassima = getVitaMassima();
		abilitàDanno = getAbilitàDanno();
		abilitàNome = getAbilitàNome();
		exp = getExp();
		System.out.println("LIVELLO PERSONAGGIO: " + livello);
		System.out.println("NOME PERSONAGGIO: " + nome);
		System.out.println("Attacco personaggio: " + attacco);
		System.out.println("Velocità personaggio: " + velocità);
		System.out.println("Vita attuale del personaggio: " + vita);
		System.out.println("Vita massima del personaggio: " + vitaMassima);
		System.out.println("Danno abilità personaggio: " + abilitàDanno);
		System.out.println("Nome abilità personaggio: " + abilitàNome);
		System.out.println("EXP personaggio: " + exp);
	}

	public void aumentoAttacco(int attaccoMaggiorata) {
		attacco += attaccoMaggiorata;
	}

	public void aumentoVita(int vitaMaggiorata) {
		vita += vitaMaggiorata;
	}
	
	public void aumentoVitaMassima(int vitaMaggiorata) {
		vitaMassima += vitaMaggiorata;
	}
	
	public void aumentoExp(Nemico j) {
		exp += j.getExp();
	}
	

}
