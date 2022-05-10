package nesneYonelimliAnalizVeTasarimProje;

public interface IAgArayuzu{
	public Durumlar getDurum();
	public void durumDegistir(Durumlar durum);
	public MenuReturn menu();
	public boolean girisYap();
}
