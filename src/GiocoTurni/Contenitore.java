package GiocoTurni;

public class Contenitore {
	private static String[] Armi = {"GuantiPotenziati","GuantiInfernali",
			"SpadaPotenziata","SpadaInfernale"};

	private static String[] Equipaggiamento = {"CorazzaBase","CorazzaPotenziata","TopBase","TopPotenziato"};

	private static String[] OggettiCurativi = {"Pozione", "Granpozione"};//CodaDiFenice

	public static String[] getArmi() {
		return Armi;
	}

	public static void setArmi(String[] armi) {
		Armi = armi;
	}

	public static String[] getEquipaggiamento() {
		return Equipaggiamento;
	}

	public static void setEquipaggiamento(String[] equipaggiamento) {
		Equipaggiamento = equipaggiamento;
	}

	public static String[] getOggettiCurativi() {
		return OggettiCurativi;
	}

	public static void setOggettiCurativi(String[] oggettiCurativi) {
		OggettiCurativi = oggettiCurativi;
	}

	

}
