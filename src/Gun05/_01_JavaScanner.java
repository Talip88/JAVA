package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {

        Scanner okuyucu=new Scanner(System.in);
        // oku ismine bir okuyucu tanımlandı, (System.in)klavyeden giriş yapmak üzere
        System.out.print("Sayi Giriniz=");
        int sayi=okuyucu.nextInt();
        // oku.nextInt() ekrandan sayıyı aldı ve bizde sayi değikenine attık

        System.out.println("sayi = " + sayi);
    }
}

 /*
         oku.next() -> bir kelime okuyor (char)
         oku.nextLine() -> tüm satırı okur

         oku.nextInt() ->  int değeri okur
         oku.nextByte() -> byte degerı okur
         oku.nextLong() -> long degeri okur
         oku.nextShort() -> Short degeri okur

         oku.nextFloat() -> float degeri okur
         oku.nextDouble() -> double degeri okur
         */