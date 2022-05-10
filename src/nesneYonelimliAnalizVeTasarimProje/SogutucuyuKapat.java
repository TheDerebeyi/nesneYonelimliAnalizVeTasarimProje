package nesneYonelimliAnalizVeTasarimProje;

public class SogutucuyuKapat extends Islem{
	public void IslemYap(ISogutucu sogutucu) {
		sogutucu.durumDegistir(Durumlar.Offline);
		System.out.println("Soðutucu baþarýyla kapatýldý.");
	}

}
