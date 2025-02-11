package ProgettoMain;


import GiocoTurni.Personaggio;
import GiocoTurni.Scripts;
import GiocoTurni.Meccaniche;
import GiocoTurni.Nemico;

public class GemAdventure {

	public static void main(String[] args) {
		// livello,nome,attacco,velocità,vitaMassima,dannoabilità,nomeabilità,exp
		Personaggio pg1 = new Personaggio(1, "Anastasia", 35, 25, 350, 0, "CocoPunch", 0);
		Personaggio pg2 = new Personaggio(1, "Ivan", 30, 30, 450, 0, "Omnislash", 0);

		Meccaniche.settaggioVita(pg1, pg2);

		pg1.statisticheBaseAlleati();
		System.out.println();
		pg2.statisticheBaseAlleati();
		System.out.println();

		boolean vittoria = false;
		while (!vittoria) {
			System.out.println("INIZIO STORIA");
			Scripts.scriptUno();
			Scripts.scriptDue(pg1, pg2);
			Scripts.scriptTre(pg1, pg2, Nemico.getNemico()[0]);
			if (pg1.getVita() == 0 || pg2.getVita() == 0) {
				break;
			}
			Scripts.scriptQuattro(pg1, pg2, Nemico.getNemico()[0], Nemico.getNemico()[1]);
			if (pg1.getVita() == 0 || pg2.getVita() == 0) {
				break;
			}
			Scripts.scriptCinque(pg1, pg2, Nemico.getNemico()[2]);
			if (pg1.getVita() == 0 || pg2.getVita() == 0) {
				break;
			}
			Scripts.scriptSei(pg1, pg2, Nemico.getNemico()[3]);
			if (pg1.getVita() == 0 || pg2.getVita() == 0) {
				break;
			}
			Scripts.scriptSette(pg1, pg2, Nemico.getNemico()[4]);
			if (pg1.getVita() == 0 || pg2.getVita() == 0) {
				break;
			}
			Scripts.scriptOtto(pg1, pg2, Nemico.getNemico()[5]);
			if (pg1.getVita() == 0 || pg2.getVita() == 0) {
				break;
			}
			Scripts.scriptFinale(pg1, pg2, Nemico.getNemico()[6]);
			if (pg1.getVita() == 0 || pg2.getVita() == 0) {
				System.out.println("I due avventurieri non sono riusciti a sconfiggere medusa... TRY AGAIN!");
				break;
			} else {
				vittoria = true;
				break;
			}
		}
	}
}
