package Gun50_GenelTekrar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_ForEachLoop2 {
    public static void main(String[] args) {

        /*
          verilen bir listeyi kucukten buyuge siralayin
         */

        List<String> liste=new ArrayList<>();
        liste.add("Eyup");
        liste.add("Yahya");
        liste.add("Esra");
        liste.add("Seher");

        System.out.println(liste); // [Eyup, Yahya, Esra, Seher]

        Collections.sort(liste);

        System.out.println(liste); // [Esra, Eyup, Seher, Yahya]

    }
}
