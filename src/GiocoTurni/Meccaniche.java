package GiocoTurni;

import java.util.Scanner;

public class Meccaniche {

	public static void settaggioVita(Personaggio j, Personaggio k) {
		j.setVita(j.getVitaMassima());
		k.setVita(k.getVitaMassima());
	}

	public static void attaccailPg(Personaggio attaccante, Nemico bersaglio) {
		System.out.println(attaccante.getNome() + " sta attaccando " + bersaglio.getNome());
		bersaglio.setVita(bersaglio.getVita() - attaccante.getAttacco());
		if (bersaglio.getVita() < 0) {
			bersaglio.setVita(0);
		}
	}

	public static void attaccailNemico(Nemico attaccante, Personaggio bersaglio) {
		System.out.println(attaccante.getNome() + " sta attaccando " + bersaglio.getNome());
		bersaglio.setVita(bersaglio.getVita() - attaccante.getAttacco());
		if (bersaglio.getVita() < 0) {
			bersaglio.setVita(0);
		}
	}

	public static void controlloAttaccoOpportunità(Personaggio j, Personaggio k, Nemico m) {
		if (m.getVelocità() > j.getVelocità()) {
			System.out.print("Il nemico ha avuto l'attacco di opportunità su: " + j.getNome() + "\n");
			attaccailNemico(m, j);

		} else if (m.getVelocità() > k.getVelocità()) {
			System.out.print("Il nemico ha avuto l'attacco di opportunità su: " + k.getNome());
			attaccailNemico(m, k);
		}
		System.out.println();
	}

	public static void combattimento(Personaggio personaggio1, Personaggio personaggio2, Nemico nemico) {
		while (personaggio1.getVita() > 0 && personaggio2.getVita() > 0 && nemico.getVita() > 0) {

			attaccailPg(personaggio1, nemico);
			System.out.println("Danno inflitto da " + personaggio1.getNome() + ": " + personaggio1.getAttacco()
					+ "\nSalute rimanente di " + nemico.getNome() + ": " + nemico.getVita());
			System.out.println();

			if (nemico.getVita() <= 0) {
				System.out.println("Il nemico è stato sconfitto");
				System.out.println();
				break;
			}

			if (Math.random() < 0.1) {
				System.out.println(personaggio1.getNome() + " ha attivato: " + personaggio1.abilitàNome);
				nemico.setVita(nemico.getVita() - personaggio1.getAbilitàDanno());
				System.out
						.println("Danno inflitto da " + personaggio1.getNome() + ": " + personaggio1.getAbilitàDanno());
				System.out.println();
			}

			attaccailPg(personaggio2, nemico);
			System.out.println("Danno inflitto da " + personaggio2.getNome() + ": " + personaggio2.getAttacco()
					+ "\nSalute rimanente di " + nemico.getNome() + ": " + nemico.getVita());
			System.out.println();

			if (nemico.getVita() <= 0) {
				System.out.println("Il nemico è stato sconfitto");
				System.out.println();
				break;
			}

			if (Math.random() < 0.1) {
				System.out.println(personaggio2.getNome() + " ha attivato: " + personaggio2.abilitàNome);
				nemico.setVita(nemico.getVita() - personaggio2.getAbilitàDanno());
				System.out
						.println("Danno inflitto da " + personaggio2.getNome() + ": " + personaggio2.getAbilitàDanno());
				System.out.println();
			}

			attaccailNemico(nemico, personaggio1);
			System.out.println("Danno inflitto dal " + nemico.getNome() + ": " + nemico.getAttacco()
					+ "\nSalute rimanente di " + personaggio1.getNome() + ": " + personaggio1.getVita());
			System.out.println();

			attaccailNemico(nemico, personaggio2);
			System.out.println("Danno inflitto dal " + nemico.getNome() + ": " + nemico.getAttacco()
					+ "\nSalute rimanente di " + personaggio2.getNome() + ": " + personaggio2.getVita());
			System.out.println();

			if (personaggio1.getVita() > 0 && personaggio1.getVita() <= personaggio1.vitaMassima / 4
					&& personaggio1.getInventarioPg1().contains("Pozione")) {
				personaggio1.aumentoVita(200);
				System.out.println(personaggio1.getNome() + " ha usato correttamente: "
						+ Contenitore.getOggettiCurativi()[0] + ", 200 punti vita recuperati");
				personaggio1.getInventarioPg1().remove("Pozione");
				System.out.println("INVENTARIO: " + personaggio1.getInventarioPg1());
				System.out.println();

			} else if (personaggio1.getVita() > 0 && personaggio1.getVita() <= personaggio1.vitaMassima / 4
					&& personaggio1.getInventarioPg1().contains("Granpozione")) {
				personaggio1.aumentoVita(300);
				System.out.println(personaggio1.getNome() + " ha usato correttamente: "
						+ Contenitore.getOggettiCurativi()[1] + ", 300 punti vita recuperati");
				personaggio1.getInventarioPg1().remove("Granpozione");
				System.out.println("INVENTARIO: " + personaggio1.getInventarioPg1());
				System.out.println();
			}

			if (personaggio2.getVita() > 0 && personaggio2.getVita() <= personaggio2.vitaMassima / 4
					&& personaggio2.getInventarioPg2().contains("Pozione")) {
				personaggio2.aumentoVita(200);
				System.out.println(personaggio2.getNome() + " ha usato correttamente: "
						+ Contenitore.getOggettiCurativi()[0] + ", 200 punti vita recuperati");
				personaggio2.getInventarioPg2().remove("Pozione");
				System.out.println("INVENTARIO: " + personaggio2.getInventarioPg2());
				System.out.println();

			} else if (personaggio2.getVita() > 0 && personaggio2.getVita() <= personaggio2.vitaMassima / 4
					&& personaggio2.getInventarioPg2().contains("Granpozione")) {
				personaggio2.aumentoVita(300);
				System.out.println(personaggio2.getNome() + " ha usato correttamente: "
						+ Contenitore.getOggettiCurativi()[1] + ", 300 punti vita recuperati");
				personaggio2.getInventarioPg2().remove("Granpozione");
				System.out.println("INVENTARIO: " + personaggio2.getInventarioPg2());
				System.out.println();
			}

		}

		if (personaggio1.getVita() <= 0) {
			System.out.println(personaggio1.getNome() + " è stato sconfitto...");
			System.out.println();
		}
		if (personaggio2.getVita() <= 0) {
			System.out.println(personaggio2.getNome() + " è stato sconfitto...");
			System.out.println();
		}

		System.out.println("La battaglia è terminata.");
	}

	public static String raccogliLoot(Personaggio j, Personaggio k, Nemico m) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuoi raccogliere il loot del nemico?(si/no): ");
		String scelta = input.next().toLowerCase();
		if (scelta.equals("si")) {
			System.out.println("Hai lootato: " + m.getLootNemico());

			switch (m.getLootNemico()) {
			case "Pozione":
			case "Granpozione":
			case "GuantiPotenziati":
			case "SpadaPotenziata":
			case "SpadaInfernale":
				j.getInventarioPg1().add(m.getLootNemico());
				k.getInventarioPg2().add(m.getLootNemico());
				break;
			}

		} else if (scelta.equals("no")) {
			System.out.println("Hai deciso di non lootare.");
		}
		return scelta;
	}

	public static void controlloExp(Personaggio p) {
		int[] soglie = { 1000, 2000, 3000, 4000, 5000, 6000, 7000 };
		for (int i = soglie.length; i > 0; i--) {
			if (p.getExp() >= soglie[i - 1]) {
				p.setLivello(i + 1);
				System.out.println(p.getNome() + " ha raggiunto il livello " + (i + 1));
				break;
			}
		}
	}

	public static void aumentoStats(Personaggio p) {
		int[][] incrementi = { { 5, 5, 50 }, // Livello 2
				{ 5, 5, 50 }, // Livello 3
				{ 8, 8, 80 }, // Livello 4
				{ 10, 10, 100 }, // Livello 5
				{ 10, 10, 100 }, // Livello 6
				{ 15, 15, 150 }, // Livello 7
				{ 15, 15, 150 } // Livello 8
		};

		for (int i = 1; i < p.getLivello(); i++) {
			p.attacco += incrementi[i - 1][0];
			p.velocità += incrementi[i - 1][1];
			p.vitaMassima += incrementi[i - 1][2];
		}
	}
}
