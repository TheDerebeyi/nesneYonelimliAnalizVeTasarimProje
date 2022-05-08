package nesneYonelimliAnalizVeTasarimProje;

public class SicaklikAlgilayici implements ISicaklikAlgilayici{


	public int sicaklikOku(ISogutucu sogutucu)
	{
		return sogutucu.getSicaklik();
	}

}
