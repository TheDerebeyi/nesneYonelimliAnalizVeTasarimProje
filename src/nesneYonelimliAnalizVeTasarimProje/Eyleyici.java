package nesneYonelimliAnalizVeTasarimProje;

public class Eyleyici implements IEyleyici{

	public void sogutucuAc(ISogutucu sogutucu) {
		Islem islem = new SogutucuyuAc(sogutucu);
		islem.IslemYap();
	}

	public void sogutucuKapat(ISogutucu sogutucu) {
		Islem islem = new SogutucuyuKapat(sogutucu);
		islem.IslemYap();
	}
	
	
}
