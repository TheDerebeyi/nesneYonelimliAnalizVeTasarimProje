package nesneYonelimliAnalizVeTasarimProje;

import java.util.Scanner;

public class AgArayuzu implements IAgArayuzu {
	
	private IVeritabani veritabani;
	private Scanner scanner;
	
	public AgArayuzu(IVeritabani veritabani) {
		this.veritabani = veritabani;
		scanner = new Scanner(System.in);
	}

	public boolean girisYap() {
		Kullanici kullanici;
		String input;

		System.out.print("Giri� yap�n�z\n");

		System.out.print("Kullan�c� ad�: ");

		input = scanner.nextLine();
		
		while (true) {
			kullanici = veritabani.kullaniciKontrol(input);
			if(kullanici != null) break;
			System.out.print("Kullan�c� yanl�� l�tfen tekrar giriniz: ");

			input = scanner.nextLine();
		}

		System.out.print("Sifre: ");
		input = scanner.nextLine();

		while (!veritabani.sifreKontrol(kullanici, input)) {
			System.out.print("Sifre yanl�� l�tfen tekrar giriniz: ");
			input = scanner.nextLine();
		}
		
		return true;
	}
	
	public MenuReturn menu() {
		Scanner scanner = new Scanner(System.in);
		String input;
		
		System.out.println("Men�den bir i�lem se�iniz:\n" + "1- S�cakl��� g�r�nt�le\n" + "2- So�utucuyu a�\n"
				+ "3- So�utucuyu kapat\n" + "0- ��k��\n" + "Se�iminiz: ");
		input = scanner.nextLine();
		switch (input) {
		case "0":
			scanner.close();
			System.exit(0);
			break;
		case "1":
			return MenuReturn.SicaklikOlc;

		case "2":
			return MenuReturn.SogutucuAc;

		case "3":
			return MenuReturn.SogutucuKapat;	
		}
		scanner.close();
		System.exit(0);
		return null;
	}
}
