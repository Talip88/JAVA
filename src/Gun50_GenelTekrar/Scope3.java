package Gun50_GenelTekrar;

import java.util.Scanner;

public class Scope3 {

    /*
       static variable'lar tum class ve tum objeler icin tekdir
     */

    String str="Java";
    int a= 10;
    int b= 20;


    public static void main(String[] args) {
        /*
          variable'lar instance oldugundan (non static) main method icerisinden
          direk ulasamayiz
          static method icerisinde instance variable'lara ulasmak istyerseniz
          obje olusturup, objke uzerinden ulasabilirsiniz.
          static variable'lar clas uyelrinin tamami icin gecerlidir ve bir tanedir
          degisirse tum class uyeleri icin degismis olur
          okulun ismi veya adresi gibi
          instance variable'lar ise sadece bir objeyi ilgilendirir
          degisirse sadece o obje icin degisir, diger objeleri ilgilendirmez
          bir ogretmenin bransi veya bir ogrencinin matemetik notu gibi
         */

        Scanner scan = new Scanner(System.in);

        Scope3 obj1 = new Scope3();

        Scope3 obj2 = new Scope3();

        Scope3 obj3 = new Scope3();

        /*
          Bir obje olusturdugumuzda java heap memory'de o objeyi olusturur
          ve o obje'ye ozel instance variable'lari objeye ekler
          Her hangi bir satirda obje'ye ait instance deger sorulursa
          obje'nin olusturuldugu satira gidip
          objeyi o satirdan, bize sorulan satira kadar takip etmeliyiz
         */

        obj1.a=11;
        obj2.a++;
        obj3.b=22;


        Scope3 obj4 = new Scope3();

        System.out.println(obj1.a); // 11
        obj1.a+=3;

        System.out.println(obj1.a); // 14
        System.out.println(obj2.a); // 11


        obj2.a +=5;
        System.out.println(obj2.a); // 16

    }




























}