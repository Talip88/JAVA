package Gun50_GenelTekrar;

import java.util.Scanner;

public class FirstCharacter {
    public static void main(String[] args) {
        // Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi yaziniz");

        char ilkHarf=scan.next().charAt(0);////****************************************************


        // isminizin ilk harfi : M
        System.out.println("isminizin ilk harfi : " + ilkHarf);

        scan.close();
    }
}
