package nesneYonelimliAnalizVeTasarimProje;

public class SogutucuyuAc extends Islem{
	
	public void IslemYap() {
		sogutucu.durumDegistir(Durumlar.Online);
		System.out.println("So�utucu ba�ar�yla a��ld�.");
	}

	public SogutucuyuAc(ISogutucu sogutucu) {
		super(sogutucu);
	}
}
