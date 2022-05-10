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
		IIslemFactory islemFactory = new SogutucuyuAcFactory();
		Islem islem = islemFactory.factoryMethod();
		islem.IslemYap(sogutucu);
	}

	public void sogutucuKapat(ISogutucu sogutucu) {
		IIslemFactory islemFactory = new SogutucuyuKapatFactory();
		Islem islem = islemFactory.factoryMethod();
		islem.IslemYap(sogutucu);
	}
}
