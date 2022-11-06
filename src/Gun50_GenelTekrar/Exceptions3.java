package Gun50_GenelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {

        Scanner scan;
        boolean tekrar=true;
        int girilensayi=0;

        while(tekrar){
            scan = new Scanner(System.in);
            System.out.println("Lutfen bir tamsayi giriniz");

            try {
                girilensayi= scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                // System.out.println(e.getMessage()); // null
                // System.out.println(e.toString());
                // java.util.InputMismatchException
                // e.printStackTrace(); // uzun hata mesaji

                System.out.println("Adam gibi tamsayi degeri girsene");
            }
        }
        System.out.println("girilen sayinin karesi : " + girilensayi*girilensayi);
    }
}
