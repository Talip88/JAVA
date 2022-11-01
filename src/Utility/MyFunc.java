package Utility;

public class MyFunc {

    public static double yuvarla(double gelenSayi){
        // 18.84955592153876
        // önce yuzle çarpsam  -> 1884.955592153876
        gelenSayi =gelenSayi*100;
        gelenSayi=Math.round(gelenSayi);// 1885
        //tekrar yuze bol -> 18.85
        gelenSayi =gelenSayi / 100;

        return gelenSayi;  // 18.85
    }

    // TODO : bu fonksiyona kaç hane ondalıklı
    // TODO : kısım istediğimizi ekleyelim
}
