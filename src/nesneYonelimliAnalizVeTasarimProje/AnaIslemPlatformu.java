package nesneYonelimliAnalizVeTasarimProje;

public class AnaIslemPlatformu {
	private IEyleyici eyleyici;
	private IAgArayuzu agArayuzu;
	private ISicaklikAlgilayici sicaklikAlgilayici;
	private Durumlar durum;
	private ISogutucu sogutucu;
	private IVeritabani veritabani;
	private ISubject publisher;

	public AnaIslemPlatformu() {
		veritabani = new PostgreSQLSurucu();
		eyleyici = new Eyleyici();
		agArayuzu = new AgArayuzu();
		sicaklikAlgilayici = new SicaklikAlgilayici();
		sogutucu = new Sogutucu();
		durum = Durumlar.Offline;
		publisher = new Publisher();
		publisher.attach((Eyleyici)eyleyici);
		publisher.attach((AgArayuzu)agArayuzu);
		publisher.attach((SicaklikAlgilayici)sicaklikAlgilayici);
		publisher.attach((Sogutucu)sogutucu);
	}

	public boolean acilisTesti() {
		if(eyleyici.getDurum() == Durumlar.Online && sicaklikAlgilayici.getDurum() == Durumlar.Online &&  agArayuzu.getDurum() == Durumlar.Online &&  sogutucu.getDurum() == Durumlar.Online) {
			this.durum = Durumlar.Online;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void durumDegis(Durumlar durum) {
		this.durum = durum;
		publisher.notify(durum);
	}
	
	public void basla() {
		
		if(!acilisTesti()) {
			System.out.println(agArayuzu.getDurum());
			System.out.println("Sistem baþlatýlamadý.");
			System.exit(1);
		}
		
		if (agArayuzu.girisYap(veritabani)) {

			while (true) {
				switch (agArayuzu.menu()) {
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
			}
		}
	}

}
