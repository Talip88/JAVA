package Gun50_GenelTekrar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        Set<Integer> sayilarKumesi= new HashSet<>();


        sayilarKumesi.add(10);
        sayilarKumesi.add(30);
        sayilarKumesi.add(50);
        sayilarKumesi.add(40);
        sayilarKumesi.add(20);

        System.out.println(sayilarKumesi); // [50, 20, 40, 10, 30]

        sayilarKumesi.add(10);
        sayilarKumesi.add(30);
        sayilarKumesi.add(40);
        sayilarKumesi.add(60);

        System.out.println(sayilarKumesi); // [50, 20, 40, 10, 60, 30]


        List<Integer> sayilarList=new ArrayList<>();
        sayilarList.add(1);
        sayilarList.add(2);

        sayilarKumesi.addAll(sayilarList);
        System.out.println(sayilarKumesi); // [1, 50, 2, 20, 40, 10, 60, 30]

    }
}
