package nesneYonelimliAnalizVeTasarimProje;

public class SogutucuyuAc extends Islem{
	
	public void IslemYap(ISogutucu sogutucu) {
		sogutucu.durumDegistir(Durumlar.Online);
		System.out.println("So�utucu ba�ar�yla a��ld�.");
	}
}
