package nesneYonelimliAnalizVeTasarimProje;

public class SogutucuyuAc extends Islem{
	
	public void IslemYap(ISogutucu sogutucu) {
		sogutucu.durumDegistir(Durumlar.Online);
		System.out.println("Soðutucu baþarýyla açýldý.");
	}
}
