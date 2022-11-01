package Gun16;

import java.util.Scanner;

public class _16_Odev {
    public static void main(String[] args) {

        // 9-Girilen bir cümledeki kelimelerin baş
        // harflerini yazdırınız.(Regex kullanmayın)

        Scanner oku=new Scanner (System.in);
        System.out.println("Bir cümle giriniz");
        String cumle=oku.nextLine();
        System.out.println("İlk kelimenin baş harfi="+cumle.charAt(0));
        for (int i = 0; i <cumle.length() ; i++) {
                     if(cumle.charAt(i)==' '){
                         System.out.println(cumle.charAt(i)+1);
                     }

    }
}}
