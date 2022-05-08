package nesneYonelimliAnalizVeTasarimProje;

public class SogutucuyuAc extends Islem{
	
	public void IslemYap() {
		sogutucu.durumDegistir(Durumlar.Online);
	}

	public SogutucuyuAc(ISogutucu sogutucu) {
		super(sogutucu);
	}
}
