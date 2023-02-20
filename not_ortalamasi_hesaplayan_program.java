import java.util.Scanner;

public class not_ortalamasi_hesaplayan_program {
    public static void main(String[] args) {
        /**
         NOT ORTALAMASI HESAPLAYAN PROGRAM
         Java ile matematik,fizik,kimya,türkçe,tarih,müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastıran program yazın.
         KUllanıcı ortalaması 60 dan büyük ise ekrana "Sınıfı Geçti", küçük ise "Sınıfta Kaldı" yazsın.
         */

        int matematik,fizik,kimya,turkce,tarih,muzik;

        Scanner input= new Scanner(System.in);

        System.out.print("Lütfen matematik notunuzu giriniz:");
        matematik = input.nextInt();

        System.out.print("Lütfen fizik notunuzu giriniz:");
        fizik = input.nextInt();

        System.out.print("Lütfen kimya notunuzu giriniz:");
        kimya = input.nextInt();

        System.out.print("Lütfen turkce notunuzu giriniz:");
        turkce = input.nextInt();

        System.out.print("Lütfen tarih notunuzu giriniz:");
        tarih = input.nextInt();

        System.out.print("Lütfen muzik notunuzu giriniz:");
        muzik = input.nextInt();

        float avarage = (matematik + fizik + kimya + turkce + tarih +muzik ) / 6 ;
        System.out.println("Not ortalamanız:" + avarage);

        boolean avarage1 = avarage > 60;
        String str = avarage1 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);


    }

}
