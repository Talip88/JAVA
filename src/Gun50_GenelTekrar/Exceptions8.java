package Gun50_GenelTekrar;

import java.util.Scanner;

public class Exceptions8 {
    public static void main(String[] args) {

        // 1- NullPointerException
        String str=null;

        System.out.println(str); // null

        // System.out.println(str.concat("Ali")); // NullPointerException

        // 2- StringIndexOutOfBoundsException

        String str2="Java";
        // System.out.println(str2.charAt(6)); // StringIndexOutOfBoundsException

        // 3- ArrayIndexOutOfBoundsException

        int[] arr={3,5,7,9};
        System.out.println(arr[8]); // ArrayIndexOutOfBoundsException

        // 4- NumberFormatException
        //    parseInt () kullandigimizda string'de sayi disinda bir karakter olursa 56a vb..
        String strr= "567";

        System.out.println(Integer.parseInt(strr) +3); // NumberFormatException


        // 5 - ClassCastException  uygun olmayan cast islemlerinde ortaya cikar

        String a= "Java";

        //  Integer b= a;  farkli data turlerindeki variable'lari birbirine atayamayiz

        Object b = a; // Object class'i String'in parent class'i oldugundan kabul eder

        Integer c= (Integer)b;
        // object class'i Integer'in da parent'i oldugundan casting ile kabul etti

        System.out.println(c);


        /*
          Biz kodumuzun istedigimiz satirinda exception firlattirabiliriz
          bu exception'in turu tamamen bizim tercihimize baglidir
          bir throw keyword'u ile sadece 1 exception firlatilabilir
          throw kelimesinden sonra new + exception class'i + ("hata mesaji")  yazilir
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        int sayi=scan.nextInt();

        if (sayi<0){
            throw new IllegalArgumentException("Yas negatif olamaz");
        }
    }
}
