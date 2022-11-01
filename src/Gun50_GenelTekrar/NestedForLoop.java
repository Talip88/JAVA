package Gun50_GenelTekrar;

public class NestedForLoop {
    public static void main(String[] args) {
        // 3 satırdan oluşacak bir döngüde sayıları TEK çİFT TEK SIRAYLA yazdırma


        for (int satir = 1; satir <= 3; satir++) {

            for (int i = 1; i <=5; i++) {
                System.out.print(satir*i + " ");
            }
            System.out.println("");

        }
    }
}
