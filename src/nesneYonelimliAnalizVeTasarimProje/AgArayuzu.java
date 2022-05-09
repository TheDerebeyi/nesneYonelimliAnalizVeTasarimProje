package nesneYonelimliAnalizVeTasarimProje;

import java.util.Scanner;

public class AgArayuzu implements IAgArayuzu {

	public MenuReturn menu() {

		Scanner scanner = new Scanner(System.in);
		String input;

		System.out.print("Giri� yap�n�z\n");

		System.out.print("Kullan�c� ad�: ");

		input = scanner.nextLine();

		while (!kullaniciAdiDogrula(input)) {
			System.out.print("Kullan�c� yanl�� l�tfen tekrar giriniz: ");

			input = scanner.nextLine();
		}

		System.out.print("Sifre: ");
		input = scanner.nextLine();

		while (!sifreDogrula(input)) {
			System.out.print("Sifre yanl�� l�tfen tekrar giriniz: ");
			input = scanner.nextLine();
		}

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
		return null;
	}

	private Boolean kullaniciAdiDogrula(String username) {
		return true;
	}

	private Boolean sifreDogrula(String password) {
		return true;
	}
}
