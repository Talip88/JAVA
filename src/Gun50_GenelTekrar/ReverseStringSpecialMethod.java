package Gun50_GenelTekrar;

import java.util.Scanner;

public class ReverseStringSpecialMethod {
    public static void main(String[] args) {

        // Reverse String SPECIAL METHODS

        Scanner scan = new Scanner(System.in);
        System.out.print("bir kelime girin: ");
        String yazi = scan.nextLine();


        String cevrilen = cevir(yazi);
        System.out.println("Çevrilen Yazi: " + cevrilen);
        scan.close();
    }
    public static String cevir(String yazi) {
        if (yazi.isEmpty()) {
            return yazi;
        }
        return cevir(yazi.substring(1)) + yazi.charAt(0) ;
    }
    }

