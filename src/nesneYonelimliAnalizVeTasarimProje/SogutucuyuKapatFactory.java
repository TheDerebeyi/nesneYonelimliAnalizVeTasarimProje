package nesneYonelimliAnalizVeTasarimProje;

public class SogutucuyuKapatFactory implements IIslemFactory{
	
	public Islem factoryMethod() {

		return new SogutucuyuKapat();
	}

}
