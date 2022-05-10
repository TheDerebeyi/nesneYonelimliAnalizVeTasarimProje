package nesneYonelimliAnalizVeTasarimProje;

import java.util.Random;

public class Sogutucu implements ISogutucu, IObserver{

	private int altSicaklikSinir;
	private int ustSicaklikSinir;
	private Durumlar durum;
	
	public Sogutucu() {
		ustSicaklikSinir = 21;
		altSicaklikSinir = -4;
		durum = Durumlar.Online;
	}
	
	public void update(Durumlar durum) {
		this.durum = durum;
	}
	
	public int getSicaklik() {
		Random rand = new Random();
		return rand.nextInt(ustSicaklikSinir)+altSicaklikSinir;
	}

	public void durumDegistir(Durumlar durum) {
		this.durum = durum; 
	}
	
	public Durumlar getDurum() {
		return this.durum;
	}
}
