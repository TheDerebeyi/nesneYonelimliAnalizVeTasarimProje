package nesneYonelimliAnalizVeTasarimProje;

public class SogutucuyuKapat extends Islem{
	public void IslemYap(ISogutucu sogutucu) {
		sogutucu.durumDegistir(Durumlar.Offline);
		System.out.println("So�utucu ba�ar�yla kapat�ld�.");
	}

}
