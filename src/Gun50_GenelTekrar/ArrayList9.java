package Gun50_GenelTekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList9 {
    public static void main(String[] args) {
        /*
          Kullanicidan istedigi kadar String alarak bir liste olusturup
          bu listeyi bize donduren bir method olusturun
          Kullanicinin bitirmesi icin Q harfine bastirin
         */

        List<String> istenenList= new ArrayList<>();

        istenenList=listeOlustur();
        System.out.println(istenenList);
    }

    public static List<String> listeOlustur() {

        List<String> olusanList=new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        String kullaniciGiris="";

        while(!kullaniciGiris.equals("Q")){

            System.out.println("Lutfen Listeye eklemek icin bir isim girin " +
                    "\nBitirmekl icin Q ' ya basin");

            kullaniciGiris= scan.nextLine();


            if (!kullaniciGiris.equals("Q")){
                olusanList.add(kullaniciGiris);
            }
        }

        return olusanList;
    }
}
