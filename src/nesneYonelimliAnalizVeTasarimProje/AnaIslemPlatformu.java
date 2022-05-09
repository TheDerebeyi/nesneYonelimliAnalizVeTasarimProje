package nesneYonelimliAnalizVeTasarimProje;

public class AnaIslemPlatformu {
	private IEyleyici eyleyici;
	private IAgArayuzu agArayuzu;
	private ISicaklikAlgilayici sicaklikAlgilayici;
	private Durumlar durum;
	private ISogutucu sogutucu;
	private IVeritabani veritabani;

	public AnaIslemPlatformu() {
		veritabani = new PostgreSQLSurucu();
		eyleyici = new Eyleyici();
		agArayuzu = new AgArayuzu(veritabani);
		sicaklikAlgilayici = new SicaklikAlgilayici();
		sogutucu = new Sogutucu();
	}

	public void Basla() {
		if (agArayuzu.girisYap()) {

			while (true) {
				switch (agArayuzu.menu()) {
				case SicaklikOlc:
					System.out.println("Mevcut s�cakl�k: " + sicaklikAlgilayici.sicaklikOku(sogutucu));
					break;
				case SogutucuAc:
					eyleyici.sogutucuAc(sogutucu);
					break;
				case SogutucuKapat:
					eyleyici.sogutucuKapat(sogutucu);
					break;
				}
			}
		}
	}

}
