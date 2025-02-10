package GiocoTurni;

public class Nemico extends StatisticheBase {

	private String lootNemico;

	public String getLootNemico() {
		return lootNemico;
	}

	public void setLootNemico(String lootNemico) {
		this.lootNemico = lootNemico;
	}

	public Nemico(int livello, String nome, int attacco, int velocità, int vita, int vitaMassima, String lootNemico, int exp) {
		super(livello, nome, attacco, velocità, vita, vitaMassima, exp);
		this.lootNemico = lootNemico;
	}

	private static Nemico[] nemico = new Nemico[] { 
			new Nemico(1,"goblin", 30, 30, 200, 200,"Pozione",500),
			new Nemico(4,"orco", 50, 15, 400, 400,"Granpozione",1000), 
			new Nemico(3,"scheletro", 40, 40, 300, 300,"GuantiPotenziati",600), 
			new Nemico(6,"minotauro", 60, 40, 600, 600,"SpadaPotenziata",1200),
			new Nemico(6,"centauro", 70, 80, 700, 700,"Granpozione",1300),
			new Nemico(7,"banshee", 120, 100, 1100, 1100,"SpadaInfernale",1500),
			new Nemico(10,"medusa", 250, 120, 1800, 1800,"GemmaFluorescente",1700), 
			};
	
	public void statisticheBaseNemici() {
		livello = getLivello();
		nome = getNome();
		attacco = getAttacco();
		velocità = getVelocità();
		vita = getVita();
		abilitàDanno = getAbilitàDanno();
		abilitàNome = getAbilitàNome();
		lootNemico = getLootNemico();
		System.out.println("NOME NEMICO: " + nome);
		System.out.println("Attacco nemico: " + attacco);
		System.out.println("Velocità nemico: " + velocità);
		System.out.println("Vita nemico: " + vita);
		System.out.println("Danno abilità nemico: " + abilitàDanno);
		System.out.println("Nome abilità nemico: " + abilitàNome);
		System.out.println("Loot del nemico: " + lootNemico);
		System.out.println("EXP che da' il nemico: " + exp);
	}


	public static Nemico[] getNemico() {
		return nemico;
	}

	public static void setNemico(Nemico[] nemico) {
		Nemico.nemico = nemico;
	}

}
