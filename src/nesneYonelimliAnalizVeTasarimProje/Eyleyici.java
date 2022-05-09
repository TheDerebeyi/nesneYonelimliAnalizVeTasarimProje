package nesneYonelimliAnalizVeTasarimProje;

public class Eyleyici implements IEyleyici{

	public void sogutucuAc(ISogutucu sogutucu) {
		IIslemFactory islemFactory = new SogutucuyuAcFactory(sogutucu);
		Islem islem = islemFactory.factoryMethod();
		islem.IslemYap();
	}

	public void sogutucuKapat(ISogutucu sogutucu) {
		IIslemFactory islemFactory = new SogutucuyuKapatFactory(sogutucu);
		Islem islem = islemFactory.factoryMethod();
		islem.IslemYap();
	}
}
