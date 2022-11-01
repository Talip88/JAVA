package Gun18;

public class _01_JavaArray {
    public static void main(String[] args) {

        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 0 atayınız  yazdırınız.

        int[] dizi=new int[50];  // 50 elemanlı bir dizi tanımlayınız,

        for(int i=0; i< dizi.length; i++)
           dizi[i]= (int)(Math.random()*10); //0 a kadar olan sayılardan Random atayarak doldurunuz.


        for(int i=0; i< dizi.length; i++)
            System.out.println("once dizi["+i+"]= "+dizi[i]);

        //Sonrasında ayrı bir döngü ile tek olanlar 1, çift olanlara 2 atayınız
        for(int i=0;i <dizi.length ; i++)
        {
             if (dizi[i]%2==0)
                 dizi[i]=0;
             else
                 dizi[i]=1;
        }

        for(int i=0; i< dizi.length; i++)
            System.out.println("sonra dizi["+i+"]= "+dizi[i]);

 //       soru  1- 50 elemanlı bir dizi tanımlayınız.
//        ilk 25 elemana random olarak tek sayı
//        Son 25 eleman random olarak çift sayı atayınız.

//        2- 10 elemanlı bir diziyi, 10 a kadar olan sayılarla random duldurunuz,
//        sonrasında kullancıdan alacağınız bir sayının dizide olup olmadığını
//        var veya yok diyerek yazdırınız.

         // sonrası büyük kaç sayı olduğunu bulunuz.

    }
}
