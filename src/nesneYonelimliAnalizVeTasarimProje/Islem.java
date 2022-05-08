package nesneYonelimliAnalizVeTasarimProje;

public abstract class Islem {
	protected final ISogutucu sogutucu;
	
	public abstract void IslemYap();
	protected Islem(ISogutucu sogutucu) {
		this.sogutucu = sogutucu;
	}
}
