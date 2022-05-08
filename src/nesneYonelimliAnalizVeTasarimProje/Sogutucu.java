package nesneYonelimliAnalizVeTasarimProje;

import java.util.Random;

public class Sogutucu implements ISogutucu{

	private int altSicaklikSinir;
	private int ustSicaklikSinir;
	
	public Sogutucu() {
		ustSicaklikSinir = 21;
		altSicaklikSinir = -4;
	}
	
	public int getSicaklik() {
		Random rand = new Random();
		return rand.nextInt(ustSicaklikSinir)-altSicaklikSinir;
	}

	public void durumDegistir(Durumlar durum) {
		return;
	}

}
