package Gun50_GenelTekrar;

public class SwitchCase {
    public static void main(String[] args) {
// Soru3 : verilen sayiyi inceleyin
        // Girilen sayi
        // 10  ise “Iki basamakli en kucuk sayi
        // 100 ise “uc basamakli en kucuk sayi”
        // 1000 ise “dort basamakli en kucuk sayi”
        // diger durumlarda “Girdigin sayiyi degistir” yazdirin

        int sayi=1000;

        switch(sayi) {

            case 10 :
                System.out.println("Iki basamakli en kucuk sayi");
                break;
            case 100 :
                System.out.println("Uc basamakli en kucuk sayi");
                break;
            case 1000 :
                System.out.println("Dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("Sayiyi degistirin");

        }
        //**************************************************************************************************************

//gun numarasina gore hafta ici veya hafta sonu yazdiralim


        int gunNo=8;

        switch(gunNo) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta Ici");
                break;
            case 6:
            case 7:
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun numarasi yaziniz");
        }

    }
}
