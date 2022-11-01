package Gun27._03_Ornek;

public class ElektrikHesabi {
    int toplamTuketim=0;
    double birimFiyat=0.7; // birimFiyat
    double fatura=0;

    public void tuketimEkle(int tuketim)
    {
        toplamTuketim+=tuketim;
    }
    public void toplamTuketimYaz()
    {
        System.out.println("toplamTuketim = "
                + toplamTuketim);
    }
    void faturaYaz(String musteriAdi)
    {
        double toplamTutar= toplamTuketim*birimFiyat;
        System.out.println("***************************");
        System.out.println("musteriAdi = " + musteriAdi);
        System.out.println("toplamTuketim = " + toplamTuketim);
        System.out.println("toplamTutar = " +
                Math.round(toplamTutar)+" ₺");
        System.out.println("***************************");
    }

}
