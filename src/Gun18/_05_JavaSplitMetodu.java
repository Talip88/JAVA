package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        // Split: bir Stringi parçalara ayırmak demek

        // Kullanıcıdan alacağınız cumleyi kelimelerine göre alt alta yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String cumle=oku.nextLine();

        String[] kelimeler= cumle.split(" ");
        //bir şey verilmezse karakterlerine ayırır

        System.out.println("kelimeler = " + Arrays.toString(kelimeler));

        System.out.println("kelimeler sayısı = " + kelimeler.length);

        for(int i=0;i<kelimeler.length;i++)
            System.out.println("kelimeler = " + kelimeler[i]);

        //Kullanıcın gireceği 02/11/2022 şeklindeki tarih bilgisini
        // gün ay yıl olarak yazdırınız.
    }
}
