package Gun50_GenelTekrar;

public class ReplaceAll {
    public static void main(String[] args) {
        String str= "*Java 98ogrenmek c..ok k876olay";

        // replaceAll methodlari kullanarak Java ogrenmek cok kolay

        str=str.replaceAll("\\d", "");// *Java ogrenmek c..ok kolay // SAYILARI YOK EDER

        str=str.replaceAll("\\s", "x"); // *Javaxogrenmekxc..okxkolay // SPACE LERİ X E ÇEVİRİR

        str=str.replaceAll("\\W", ""); // Javaxogrenmekxcokxkolay // NOKTALARI YOK EDER

        str=str.replace("x", " ");
        System.out.println(str); //Java ogrenmek cok kolay

        //*************************************************************************************************************
        String cumle= "Java    cok         zevkli";
        cumle=cumle.replaceAll("\\s+", " ");
        System.out.println(cumle); //Java cok zevkli
        System.out.println(cumle.replaceAll("[a-z]", "")); //J
        System.out.println(cumle.replaceAll("\\S", "*")); // **** *** ******
        System.out.println(cumle.replaceAll("\\s", "*")); //Java*cok*zevkli

//********************************************************************************************************************

        // Soru 1) String methodlarini kullanarak “  Java ogrenmek123 Cok guzel@  ”
        // String’ini “Java ogrenmek cok guzel.” sekline getirin.


        String cumlee="  Java ogrenmek123 Cok guzel@  ";
        cumlee=cumlee.trim();
        cumlee=cumlee.replaceAll("\\s", "x");
        cumlee=cumlee.replaceAll("\\W", "");
        cumlee=cumlee.replaceAll("\\d", "");
        cumlee=cumlee.replace("x", " ");
        System.out.println(cumlee);


    }
}
