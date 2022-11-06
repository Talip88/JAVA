package Gun50_GenelTekrar;

import java.util.Scanner;

public class ArrayList_ForEachLoop5 {
    public static void main(String[] args) {
         /*
        Kullanicidan bir cumle ve bir harf alin
        for-each loop kullanarak
        harfin cumlede kac kez gectigini bulup yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();

        System.out.println("Lutfen aramak istediginiz harfi giriniz");
        String harf = scan.next().substring(0, 1);


        String[] karakterler = cumle.split("");

        int sayac = 0;

        for (String each : karakterler
        ) {
            if (each.equals(harf)) {
                sayac++;
            }
        }


        if (sayac == 0) {
            System.out.println("Istediginiz harf cumlede yok");
        } else {
            System.out.println("Istediginiz " + harf + " harfi cumlede " + sayac + " kere kullanilmis");
        }
    }}