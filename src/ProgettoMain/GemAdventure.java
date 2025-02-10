package ProgettoMain;


import GiocoTurni.Personaggio;
import GiocoTurni.Scripts;
import GiocoTurni.Meccaniche;
import GiocoTurni.Nemico;

public class GemAdventure {

	public static void main(String[] args) {
		// livello,nome,attacco,velocità,vitaMassima,dannoabilità,nomeabilità,exp
		Personaggio anastasia = new Personaggio(1, "Anastasia", 35, 25, 350, 0, "CocoPunch", 0);
		Personaggio ivan = new Personaggio(1, "Ivan", 30, 30, 450, 0, "Omnislash", 0);

		Meccaniche.settaggioVita(anastasia, ivan);

		anastasia.statisticheBaseAlleati();
		System.out.println();
		ivan.statisticheBaseAlleati();
		System.out.println();

		boolean vittoria = false;
		while (!vittoria) {
			System.out.println("INIZIO STORIA");
			Scripts.scriptUno();
			Scripts.scriptDue(anastasia, ivan);
			Scripts.scriptTre(anastasia, ivan, Nemico.getNemico()[0]);
			if (anastasia.getVita() == 0 || ivan.getVita() == 0) {
				break;
			}
			Scripts.scriptQuattro(anastasia, ivan, Nemico.getNemico()[0], Nemico.getNemico()[1]);
			if (anastasia.getVita() == 0 || ivan.getVita() == 0) {
				break;
			}
			Scripts.scriptCinque(anastasia, ivan, Nemico.getNemico()[2]);
			if (anastasia.getVita() == 0 || ivan.getVita() == 0) {
				break;
			}
			Scripts.scriptSei(anastasia, ivan, Nemico.getNemico()[3]);
			if (anastasia.getVita() == 0 || ivan.getVita() == 0) {
				break;
			}
			Scripts.scriptSette(anastasia, ivan, Nemico.getNemico()[4]);
			if (anastasia.getVita() == 0 || ivan.getVita() == 0) {
				break;
			}
			Scripts.scriptOtto(anastasia, ivan, Nemico.getNemico()[5]);
			if (anastasia.getVita() == 0 || ivan.getVita() == 0) {
				break;
			}
			Scripts.scriptFinale(anastasia, ivan, Nemico.getNemico()[6]);
			if (anastasia.getVita() == 0 || ivan.getVita() == 0) {
				System.out.println("I due avventurieri non sono riusciti a sconfiggere medusa... TRY AGAIN!");
				break;
			} else {
				vittoria = true;
				break;
			}
		}
	}
}
