package Gun50_GenelTekrar;

public class StringBuilder2 {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder(7);

        System.out.println(sb1.capacity()); // 7
        System.out.println(sb1.length()); // 0

        sb1.append("Ali Can");
        System.out.println(sb1.capacity()); // 7
        System.out.println(sb1.length()); // 7

        sb1.append("Bilmeyen var mi ? ");
        System.out.println(sb1.capacity()); // 25
        System.out.println(sb1.length()); // 25

        sb1.append("Inanmayan beri gelsin.");
        System.out.println(sb1.capacity()); // 52
        System.out.println(sb1.length()); // 47

        sb1.trimToSize();
        System.out.println(sb1.capacity()); // 47
        System.out.println(sb1.length()); // 47




        //*************************************************************************************************



        StringBuilder sb11=new StringBuilder("Veli Cem");

        sb11.delete(4,7); // ilk index dahil, 2.index haric olarak aradakile

        System.out.println(sb11); // Velim

        sb11.deleteCharAt(4);

        System.out.println(sb11); // Veli

        sb11.insert(4, " Han");

        System.out.println(sb11); // Veli Han

        sb11.replace(5,8,"Tan");

        System.out.println(sb11); // Veli Tan

        sb11.reverse();

        System.out.println(sb1); //  naT ileV

        StringBuilder sb32= new StringBuilder("12Java45");
        String isim = "Mesut";

        sb32.append(isim,2,4);

        System.out.println(sb32);


//**********************************************************************************************************


        StringBuilder sb12=new StringBuilder("Veli Cem");

        sb12.delete(4,7); // ilk index dahil, 2.index haric olarak aradakile

        System.out.println(sb12); // Velim

        sb12.deleteCharAt(4);

        System.out.println(sb12); // Veli

        sb12.insert(4, " Han");

        System.out.println(sb12); // Veli Han

        sb12.replace(5,8,"Tan");

        System.out.println(sb12); // Veli Tan

        sb12.reverse();

        System.out.println(sb12); //  naT ileV

        StringBuilder sb33= new StringBuilder("12Java45");
        String isimm = "Mesut";

        sb33.append(isimm,2,4);

        System.out.println(sb33);

//**********************************************************************************************************************

        StringBuilder sb122= new StringBuilder("Java Guzeldir");

        sb122.substring(5);
        // String class'indan calisir dolayisiyla immutable olur

        System.out.println(sb122.substring(5)); // Guzeldir

        // sb1= sb1.substring(5); farkli data turu oldugundan atamayi kabul etmez

        System.out.println(sb122); // Java Guzeldir


        // SB'da contains yok
        // sb1 Java iceriyor mu ?

        System.out.println(sb122.toString().contains("Java")); // true

        /*
          String Builder'da olmayip String'de olan ozellik varsa
          toString() ile String'e cevirir, sonra String method'larini kullanabilirriz
         */
    }
}
