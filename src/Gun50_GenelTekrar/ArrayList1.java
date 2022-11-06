package Gun50_GenelTekrar;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        /*
        List interface'dir ve interface'lerden obje olusturulamaz
        bundan dolayi esitligin saginda List<>() kullanamayiz
        Sag tarafda List yerine onun child class'i olan ArrayList<>() kullaniriz
         */


        System.out.println(sayilar); // [] bos liste

        // bir ArrayList'e elementleri tek tek eklememiz gerekir

        sayilar.add(24);
        sayilar.add(32);
        sayilar.add(10);

        System.out.println(sayilar); // [24, 32, 10]

    }
}
//  /*
//          2,3,4,5,3,6,7,3,8,9,1,2,5,3,8,5
//          elementlerini bir listeye ekleyin
//         */
//
//        int[] arr={2,3,4,5,3,6,7,3,8,9,1,2,5,3,8,5};
//
//        List<Integer> sayilar=new ArrayList<>();
//
//        for (int i = 0; i < arr.length ; i++) {
//            sayilar.add(arr[i]);
//        }
//        System.out.println(sayilar); // [2, 3, 4, 5, 3, 6, 7, 3, 8, 9, 1, 2, 5, 3, 8, 5]