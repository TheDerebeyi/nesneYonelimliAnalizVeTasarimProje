package nesneYonelimliAnalizVeTasarimProje;

public class SogutucuyuKapatFactory implements IIslemFactory{

	private ISogutucu sogutucu;
	
	public SogutucuyuKapatFactory(ISogutucu sogutucu) {
		this.sogutucu = sogutucu;
	}
	
	public Islem factoryMethod() {

		return new SogutucuyuKapat(sogutucu);
	}

}
