package Gun50_GenelTekrar;

public class Arrays9 {
    public static void main(String[] args) {
        // verilen int bir array'in istenen ilk n elementini toplayip yazdirin

        int[] arr = {2,4,5,7,1,7,4,7,3,9};
        int kacElement= 4;

        int toplam=0;

        for (int i = 0; i < kacElement; i++) {
            toplam+=arr[i];
        }

        System.out.println(toplam);

        // ilk n elementi istedigimiz sayi kadar artiralim

        int artisMiktari=2;

        for (int i = 0; i <kacElement ; i++) {

            arr[i]+=artisMiktari;

        }

        //System.out.println(Arrays.toString(arr));
    }
}