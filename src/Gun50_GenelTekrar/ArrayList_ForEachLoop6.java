package Gun50_GenelTekrar;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ForEachLoop6 {
    public static void main(String[] args) {
        /*
        Verilen bir String array'de
        Her bir elementi kontrol edip
        kelimenin uzunlugu cift sayi ise ilk yarisi,
        kelimenin uzunlugu tek sayi ise
        ortadaki harf dahil ikinci yarisini yeni bir listeye ekleyip yazdiralim
         */

        String[] arr = {"Fatih", "Muhammet","Bora", "Seher"};
        List<String> yeniList=new ArrayList<>();

        for (String each:arr
        ) {

            if (each.length()%2==0){ // ciftse

                yeniList.add(each.substring(0,each.length()/2));

            }else{//tekse

                yeniList.add(each.substring((each.length()-1)/2));
            }
        }

        System.out.println(yeniList);




               /*
          Verilen String bir listede istenmeyen harf iceren elementleri
          silip, kalani kismini bize donduren bir method olusturun.
         */

        List<String> liste=new ArrayList<>();
        liste.add("Eyup");
        liste.add("Yahya");
        liste.add("Esra");
        liste.add("Seher");

        String istenmeyenHarf="a";
        List<String> yeniListt=new ArrayList<>();

        for (String each:liste
        ) {

            if (!each.contains(istenmeyenHarf)){
                yeniListt.add(each);
            }
        }

        System.out.println(yeniListt);



          /*
          Verilen int bir array'deki
          tum elementlerin karelerini toplayip yazdirin
         */

        int[] arr3 = {3,4,5,1};

        int toplam=0;

        for (int each: arr3) {

            toplam+= each*each;
        }

        System.out.println("arraydeki sayilarin kareleri toplami : " + toplam);



       // /*************************************************************************************************************
         //verilen bir array'in tum elementlerini
        // olusturacaginiz bir list'e ekleyin
        // */

        int[] arr4 = {2,3,5,6,7,5,3,2,5,7,76,4,3,3,56,7,4};

        List<Integer> sayilar=new ArrayList<>();

        for (int each: arr4) {
            sayilar.add(each);
        }

        System.out.println("Listenin son hali : " + sayilar);





        // Verilen bir array'in tum elementlerini yazdirin

        int [] arr6 ={2,3,4,5,6};

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        /*
        For Each Loop index yapisi kullanmadan
        array ve list gibi yapilarin
        tum elementlerini bize getirir.
         */

        for (int each: arr6) {
            System.out.print(each + " ");
        }
    }
}
