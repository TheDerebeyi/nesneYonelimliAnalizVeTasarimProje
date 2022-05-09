package nesneYonelimliAnalizVeTasarimProje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
public class Veritabani {


    public class Veritabani {

        static String dburl = "jdbc:postgresql://localhost:5432/nesneyonelimveritabani";
        static Connection conn = null;

        static void baglan() {
            try {
                conn = DriverManager.getConnection(dburl, "postgres", "123456");
                if (conn != null)
                    System.out.println("Baglanti Gerceklesti");
                else
                    System.out.println("Baglanti Basarisiz");
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        public boolean Kontrol(String KullaniciAdi , String Sifre)
        {
            String sql= "SELECT * FROM \"public\".\"nesneyonelimveritabani\"";
            String isim = "";
            String sifre = "";

            Connection conn=this.Baglan();
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                conn.close();

                while(rs.next())
                {
                    isim = rs.getString("ad");
                    sifre = rs.getString("sifre");
                }
                rs.close();
                stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return isim.equals(KullaniciAdi) && sifre.equals(Sifre);

        }
    }

}
