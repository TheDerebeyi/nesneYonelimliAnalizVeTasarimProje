package nesneYonelimliAnalizVeTasarimProje;

public interface IEyleyici {
	public Durumlar getDurum();
	public void durumDegistir(Durumlar durum);
	public void sogutucuAc(ISogutucu sogutucu);
	public void sogutucuKapat(ISogutucu sogutucu);
}
