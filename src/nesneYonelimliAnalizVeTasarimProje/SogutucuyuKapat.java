package nesneYonelimliAnalizVeTasarimProje;

public class SogutucuyuKapat extends Islem{
	public void IslemYap() {
		sogutucu.durumDegistir(Durumlar.Offline);
		System.out.println("So�utucu ba�ar�yla kapat�ld�.");
	}
	public SogutucuyuKapat(ISogutucu sogutucu) {
		super(sogutucu);
	}
}
