package Gun16;

import javafx.scene.shape.SVGPath;

import java.util.Scanner;

public class _14_Odev {
    public static void main(String[] args) {
        // 7-Girilen bir cumledeki a harfi sayısını bulunuz.(Regex kullanmayın)

        Scanner oku =new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cumle=oku.nextLine();
        int aMiktar=0;
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)=='a'){
                aMiktar++;
            }
        }
                      System.out.println(aMiktar);
    }

}