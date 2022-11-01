package Gun50_GenelTekrar;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {

        // Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        // Kullanicidan bir sifre girmesini isteyin
        // Eger ilk harf buyuk harf ise
        // “A” olup olmadigini kontrol edin.
        // Ilk harf A ise 	“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
        // Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin.
        // Ilk harf z ise 	“Gecerli Sifre” 	degilse “Gecersiz Sifre” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        char ilkKarakter=scan.next().charAt(0);


        if (ilkKarakter>='A' && ilkKarakter<='Z') { // buyuk harfleri secmis olacak
            if (ilkKarakter=='A') {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }


        } else if(ilkKarakter>='a' && ilkKarakter<='z'){ // kucuk harfleri secer

            if (ilkKarakter=='z') {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }

        }else { // geriye kalan tum karakterler

            System.out.println("Gecerli sifre olmasi icin harf ile baslayiniz");

        }



        scan.close();


        //*************************************************************************************************************

        // Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        // Girdiği sayi 5’e bölünüyorsa son rakamını kontrol edin.
        // Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
        // Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        // Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

        System.out.println("Lutfen 4 basamakli bir sayi girin");
        int sayi=scan.nextInt();

        if (sayi<1000 || sayi>9999) {
            System.out.println("4 basamakli pozitif sayi girmelisiniz");
        } else { // 4 basamakli sayilari yakalayacak

            if (sayi%5==0) { // bese tam bolunenler

                if (sayi%10==0) { // son rakam 0

                    System.out.println("bese tam bolunen cift sayi");
                } else { // son rakam 5
                    System.out.println("bese tam bolunen tek sayi");
                }

            } else { // bese tam bolunemeyenler
                System.out.println("Tekrar deneyin");
            }

        }

        scan.close();

//**********************************************************************************************************************

    }
}
