package nesneYonelimliAnalizVeTasarimProje;

public class SogutucuyuAcFactory implements IIslemFactory{

	private ISogutucu sogutucu;
	
	public SogutucuyuAcFactory(ISogutucu sogutucu) {
		this.sogutucu = sogutucu;
	}
	
	public Islem factoryMethod() {

		return new SogutucuyuAc(sogutucu);
	}

}
