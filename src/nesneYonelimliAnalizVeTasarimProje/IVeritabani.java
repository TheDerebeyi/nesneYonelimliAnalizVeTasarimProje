package nesneYonelimliAnalizVeTasarimProje;

public interface IVeritabani {
	public Kullanici kullaniciKontrol(String kullaniciAdi);
	public boolean sifreKontrol(Kullanici kullanici, String sifre);
}
