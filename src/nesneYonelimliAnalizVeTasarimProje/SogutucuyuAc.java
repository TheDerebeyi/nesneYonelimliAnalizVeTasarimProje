package nesneYonelimliAnalizVeTasarimProje;

public class SogutucuyuAc extends Islem{
	
	public void IslemYap() {
		sogutucu.durumDegistir(Durumlar.Online);
		System.out.println("Soðutucu baþarýyla açýldý.");
	}

	public SogutucuyuAc(ISogutucu sogutucu) {
		super(sogutucu);
	}
}
