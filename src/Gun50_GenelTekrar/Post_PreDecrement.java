package Gun50_GenelTekrar;

public class Post_PreDecrement {
    public static void main(String[] args) {
        int sayi=10;

        sayi--;

        System.out.println(sayi); // 9

        int a=sayi--;


        System.out.println(a); //9
        System.out.println(sayi);//8


        System.out.println(--a); // 8
    }
}
