package Gun50_GenelTekrar;

import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {


        //******************

        // Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
        //         ve dikdortgenin kare olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen dikdorgenin bir kenar uzunlugunu girin");

        double kenar1=scan.nextDouble();

        System.out.println("Lutfen dikdorgenin diger kenar uzunlugunu girin");

        double kenar2=scan.nextDouble();

        if (kenar1==kenar2) {
            System.out.println("girilen olculer karedir");
        } else {
            System.out.println("girilen olculer kare degildir");
        }

        scan.close();
        //******************************************************************************


        // Soru 2) Kullanicidan bir karakter girmesini isteyin ve
        //         girilen karakterin harf olup olmadigini yazdirin

        System.out.println("Lutfen bir karekter giriniz");

        char karakter=scan.next().charAt(0);

        if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z')) {

            System.out.println("girdiginiz :" + karakter + " bir harftir");
        } else {

            System.out.println("girdiginiz :" + karakter + " bir harf degildir");
        }

        scan.close();


//**********************************************************************************************************************


        // Soru 8) Kullanicidan maas icin bir teklif isteyin
        //		ve asagidaki degerlere gore cevap azdirin.
        //		Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
        //		60 – 80.000 arasinda ise “Konusabiliriz”,
        //		60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin



        System.out.println("Maas için bir teklif giriniz");
        int teklif = scan.nextInt();

        if (teklif>80000) {
            System.out.println("Kabul ediyorum");
        } else if(teklif>60000){
            System.out.println("Konusabiliriz");
        } else {
            System.out.println("Maalesef Kabul edemem");
        }
        scan.close();
    }
}
