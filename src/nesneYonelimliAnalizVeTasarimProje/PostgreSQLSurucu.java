package nesneYonelimliAnalizVeTasarimProje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQLSurucu implements IVeritabani{
	static String dburl = "jdbc:postgresql://localhost:5432/nesneyonelimveritabani";
	static Connection conn = null;

	static Connection Baglan() {
		try {
			conn = DriverManager.getConnection(dburl, "postgres", "123456");
			if (conn != null)
				System.out.println("Baglanti Gerceklesti");
			else
				System.out.println("Baglanti Basarisiz");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;

	}
	
	public Kullanici kullaniciKontrol(String kullaniciAdi) {
		String sql = "SELECT * FROM \"public\".\"nesneyonelimveritabani\"";
		String isim = null;


		Connection conn = Baglan();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			conn.close();

			while (rs.next()) {
				isim = rs.getString("ad");
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return (isim.equals(kullaniciAdi)?new Kullanici(isim):null);

	}
	
	public boolean sifreKontrol(Kullanici kullanici, String sifre) {
		String sql = "SELECT * FROM \"public\".\"nesneyonelimveritabani\"";
		String dbSifre = null;
		String isim = null;

		Connection conn = Baglan();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			conn.close();

			while (rs.next()) {
				isim = rs.getString("kullaniciAdi");
				sifre = rs.getString("sifre");
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isim.equals(kullanici.kullaniciAdi) && sifre.equals(sifre);

	}

}
