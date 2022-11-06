package Gun50_GenelTekrar;

import java.util.ArrayList;
import java.util.List;

public class ArrayList8 {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(15);
        sayilar.add(20);
        sayilar.add(2);

        System.out.println(sayilar); // [10, 15, 20, 2]

        sayilar.remove(2);
        System.out.println(sayilar);// [10, 15, 2]

        Integer silinecek=10;
        sayilar.remove(silinecek);
        System.out.println(sayilar); // [15, 2]

        sayilar.clear(); // tum listeyi temizler
        System.out.println(sayilar); // []

    }
}

// List<Integer> sayilar = new ArrayList<>();
//
//        sayilar.add(10);
//        sayilar.add(15);
//        sayilar.add(20);
//        sayilar.add(2);
//
//        System.out.println(sayilar); // [10, 15, 20, 2]
//
//        sayilar.remove(2);
//        System.out.println(sayilar);// [10, 15, 2]
//
//        Integer silinecek=10;
//        sayilar.remove(silinecek);
//        System.out.println(sayilar); // [15, 2]
//
//        sayilar.clear(); // tum listeyi temizler
//        System.out.println(sayilar); // []

 // List<String> liste=new ArrayList<>();
 //     liste.add("Fatih");
 //             liste.add("Esra");
 //             liste.add("Levent");
 //             liste.add("Esra");
 //             liste.add("Seher");

 //             System.out.println(liste.indexOf("Esra")); // 1

 //             System.out.println(liste.lastIndexOf("Esra")); // 3