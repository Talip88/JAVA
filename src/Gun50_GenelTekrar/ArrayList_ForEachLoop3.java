package Gun50_GenelTekrar;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ForEachLoop3 {
    public static void main(String[] args) {
        List<String> liste=new ArrayList<>();
        liste.add("Eyup");
        liste.add("Yahya");
        liste.add("Esra");
        liste.add("Seher");

        System.out.println(liste.subList(1, 3)); // [Yahya, Esra]



        // Verilen bir array'in tum elementlerini yazdirin

        int [] arr1 ={2,3,4,5,6};

        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("");
        /*
        For Each Loop index yapisi kullanmadan
        array ve list gibi yapilarin
        tum elementlerini bize getirir.
         */

        for (int each: arr1) {
            System.out.print(each + " ");
        }




         /*
         verilen bir array'in tum elementlerini
         olusturacaginiz bir list'e ekleyin
         */

        int[] arr = {2,3,5,6,7,5,3,2,5,7,76,4,3,3,56,7,4};

        List<Integer> sayilar=new ArrayList<>();

        for (int each: arr) {
            sayilar.add(each);
        }

        System.out.println("Listenin son hali : " + sayilar);

 /*
          Verilen int bir array'deki
          tum elementlerin karelerini toplayip yazdirin
         */

        int[] arr2 = {3,4,5,1};

        int toplam=0;

        for (int each: arr2) {

            toplam+= each*each;
        }

        System.out.println("arraydeki sayilarin kareleri toplami : " + toplam);
    }
}
