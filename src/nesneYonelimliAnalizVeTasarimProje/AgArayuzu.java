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

		System.out.print("Giriþ yapýnýz\n");

		System.out.print("Kullanýcý adý: ");

		input = scanner.nextLine();
		
		while (true) {
			kullanici = veritabani.kullaniciKontrol(input);
			if(kullanici != null) break;
			System.out.print("Kullanýcý yanlýþ lütfen tekrar giriniz: ");

			input = scanner.nextLine();
		}

		System.out.print("Sifre: ");
		input = scanner.nextLine();

		while (!veritabani.sifreKontrol(kullanici, input)) {
			System.out.print("Sifre yanlýþ lütfen tekrar giriniz: ");
			input = scanner.nextLine();
		}
		
		return true;
	}
	
	public MenuReturn menu() {
		Scanner scanner = new Scanner(System.in);
		String input;
		
		System.out.println("Menüden bir iþlem seçiniz:\n" + "1- Sýcaklýðý görüntüle\n" + "2- Soðutucuyu aç\n"
				+ "3- Soðutucuyu kapat\n" + "0- Çýkýþ\n" + "Seçiminiz: ");
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
