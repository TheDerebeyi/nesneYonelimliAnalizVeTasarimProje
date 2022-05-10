package nesneYonelimliAnalizVeTasarimProje;

public class SicaklikAlgilayici implements ISicaklikAlgilayici, IObserver{
	private Durumlar durum;
	
	public void update(Durumlar durum) {
		this.durum = durum;
	}
	
	public SicaklikAlgilayici() {
		durum = Durumlar.Online;
	}
	
	public Durumlar getDurum() {
		return durum;
	}
	
	public void durumDegistir(Durumlar durum) {
		this.durum = durum;
	}

	public int sicaklikOku(ISogutucu sogutucu)
	{
		return sogutucu.getSicaklik();
	}

}
