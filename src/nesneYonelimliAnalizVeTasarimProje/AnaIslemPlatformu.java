package nesneYonelimliAnalizVeTasarimProje;

public class AnaIslemPlatformu {
	private IEyleyici eyleyici;
	private IAgArayuzu agArayuzu;
	private ISicaklikAlgilayici sicaklikAlgilayici;
	private Durumlar durum;
	private ISogutucu sogutucu;

	public AnaIslemPlatformu() {
		eyleyici = new Eyleyici();
		agArayuzu = new AgArayuzu();
		sicaklikAlgilayici = new SicaklikAlgilayici();
		sogutucu = new Sogutucu();
	}
	
	public void Basla() {
		switch(agArayuzu.menu()) {
		case SicaklikOlc:
			System.out.println("Mevcut sýcaklýk: " + sicaklikAlgilayici.sicaklikOku(sogutucu));
			break;
		case SogutucuAc:
			eyleyici.sogutucuAc(sogutucu);
			break;
		case SogutucuKapat:
			eyleyici.sogutucuKapat(sogutucu);
			break;
		}
		
		Basla();
	}

}
