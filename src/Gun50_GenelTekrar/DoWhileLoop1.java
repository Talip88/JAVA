package Gun50_GenelTekrar;

public class DoWhileLoop1 {
    public static void main(String[] args) {
        // Soru 2 ) âmâ harfinden baslayarak âcâ harfine kadar tum harfleri yazdirin.

        // =====================for loop ile ================
        for (char i = 'm'; i >'c' ; i--) {

            System.out.print(i + " ");
        }


        // =====================  while loop ile =============
        System.out.println(" ");
        char krk='m';

        while(krk > 'c') {
            System.out.print(krk + " ");
            krk--;
        }


        // =====================  do while loop ile =============
        System.out.println(" ");

        char harf='m';
        do {
            System.out.print(harf +" ");
            harf--;
        }while(harf>'c');
    }
}
