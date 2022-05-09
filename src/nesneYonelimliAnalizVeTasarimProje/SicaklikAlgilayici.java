package nesneYonelimliAnalizVeTasarimProje;

public class SicaklikAlgilayici implements ISicaklikAlgilayici{
	private Durumlar durum;
	
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
