package nesneYonelimliAnalizVeTasarimProje;

public interface ISicaklikAlgilayici {
	public Durumlar getDurum();
	public void durumDegistir(Durumlar durum);
	public int sicaklikOku(ISogutucu sogutucu);
}
