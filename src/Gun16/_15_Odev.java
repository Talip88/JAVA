package Gun16;

import java.util.Scanner;

public class _15_Odev {
    public static void main(String[] args) {
        //8-Girilen bir cümledeki kelime sayısını bulunuz.(Regex kullanmayın)

        Scanner input=new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cumle=input.nextLine();
        int miktar=0;
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)==' '){
                miktar++;
            }
            System.out.println("kelime sayısı="+(miktar+1));
            }
        }
}
