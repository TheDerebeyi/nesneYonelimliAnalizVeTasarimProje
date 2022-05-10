package nesneYonelimliAnalizVeTasarimProje;

public class Eyleyici implements IEyleyici, IObserver{

	private Durumlar durum;
	
	public Eyleyici() {
		durum = Durumlar.Online;
	}
	
	public void update(Durumlar durum) {
		this.durum = durum;
	}
	
	public Durumlar getDurum() {
		return durum;
	}
	
	public void durumDegistir(Durumlar durum) {
		this.durum = durum;
	}
	
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
