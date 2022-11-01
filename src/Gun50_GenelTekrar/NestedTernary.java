package Gun50_GenelTekrar;

import java.util.Scanner;

public class NestedTernary {
    public static void main(String[] args) {



        // Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin,
        // negatifse sayinin karesini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        double sayi=scan.nextDouble();

        // sayi>0 ? System.out.println("sayi pozitif") : System.out.println(sayi*sayi);
        // ternary de direk sonuc veya sonuc dondurecek bir islem yapabiliriz

        System.out.println(sayi>0 ? "sayi pozitif" : sayi*sayi );
        scan.close();



        //*************************************************************************************************************


        // Soru2 : verilen karakteri inceleyin,
        // kucuk harf ise consola “Kucuk Harf” ,
        // buyuk harfse consola “Buyuk Harf”
        // yoksa “girdiginiz karakter harf degil” yazdirin.

        char krk='&';

        // String sonuc = (krk>='a' && krk<='z') ? "Kucuk Harf" : (//sart yanlis ise sonuc);
        String sonuc = (krk>='a' && krk<='z') ? "Kucuk Harf" : (

                (krk>='A'&& krk<='Z') ? "Buyuk Harf" : "girilen karakter harf degil"

        );

        System.out.println(sonuc);
    }
}
