package nesneYonelimliAnalizVeTasarimProje;

public class SogutucuyuKapat extends Islem{
	public void IslemYap() {
		sogutucu.durumDegistir(Durumlar.Offline);
		System.out.println("Soðutucu baþarýyla kapatýldý.");
	}
	public SogutucuyuKapat(ISogutucu sogutucu) {
		super(sogutucu);
	}
}
