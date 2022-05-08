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
			sicaklikGonder();
			break;
		case SogutucuAc:
			sogutucuAc();
			break;
		case SogutucuKapat:
			sogutucuKapat();
			break;
		}
	}
	
	private void sogutucuAc() {
		eyleyici.sogutucuAc(sogutucu);
	}

	private void sogutucuKapat() {
		eyleyici.sogutucuKapat(sogutucu);
	}

	private void sicaklikGonder() {
		System.out.println("Mevcut sýcaklýk: " + sicaklikAlgilayici.sicaklikOku(sogutucu));
	}
}
