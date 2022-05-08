package nesneYonelimliAnalizVeTasarimProje;

public interface ISogutucu {
	public int getSicaklik();
	public void durumDegistir(Durumlar durum);
	public Durumlar getDurum();
}
