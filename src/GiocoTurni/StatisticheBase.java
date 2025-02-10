package GiocoTurni;

public abstract class StatisticheBase {
	protected int livello;
	protected String nome;
	protected int attacco;
	protected int velocità;
	protected int vita;
	protected int vitaMassima;
	protected int abilitàDanno;
	protected String abilitàNome;
	protected int exp;
	
	
	

	public int getLivello() {
		return livello;
	}

	public void setLivello(int livello) {
		this.livello = livello;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getVelocità() {
		return velocità;
	}

	public void setVelocità(int velocità) {
		this.velocità = velocità;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVita() {
		return vita;
	}

	public void setVita(int vita) {
		this.vita = vita;
	}
	
	public int getVitaMassima() {
		return vitaMassima;
	}

	public void setVitaMassima(int vitaMassima) {
		this.vitaMassima = vitaMassima;
	}

	public int getAbilitàDanno() {
		abilitàDanno = (int) (getAttacco() * 1.5);
		return abilitàDanno;
	}

	public void setAbilitàDanno(int abilitàDanno) {
		this.abilitàDanno = abilitàDanno;
	}

	public String getAbilitàNome() {
		return abilitàNome;
	}

	public void setAbilitàNome(String abilitàNome) {
		this.abilitàNome = abilitàNome;
	}

	public int getAttacco() {
		return attacco;
	}

	public void setAttacco(int attacco) {
		this.attacco = attacco;
	}

	
	// COSTRUTTORE DEL PG
	public StatisticheBase(int livello, String nome, int attacco, int velocità, int vitaMassima, int abilitàDanno,
			String abilitàNome, int exp) {
		super();
		this.livello = livello;
		this.nome = nome;
		this.attacco = attacco;
		this.velocità = velocità;
		this.vitaMassima = vitaMassima;
		this.abilitàDanno = abilitàDanno;
		this.abilitàNome = abilitàNome;
		this.exp = exp;
	}
	
	// COSTRUTTORE DEL NEMICO
	public StatisticheBase(int livello, String nome, int attacco, int velocità, int vitaMassima, int vita, int exp) {
		super();
		this.livello = livello;
		this.nome = nome;
		this.attacco = attacco;
		this.velocità = velocità;
		this.vitaMassima = vitaMassima;
		this.vita = vita;
		this.exp = exp;
	}

}
