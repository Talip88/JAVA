package Gun37._01_Ornek;

interface IMagaza {
    void bilgileriAl();
    void KredibiliteyiKontrolEt();
    void KrediSecenkleriniAl();
}

//    HepsiBurada
//
//            bilgileriAl
//    KredilibiletisiniKontrolEt
//            KrediSecenkleriniSun
//    BelgeleriImzalat
//            KrediyiKullandır
//
//
//    TrendYol
//            bilgileriAl
//    KredilibiletisiniKontrolEt
//            KrediSecenkleriniSun
//    BelgeleriImzalat
//            KrediyiKullandır

// webarayüz aynı fonksiyonları çağırması lazımbu yüzden metod isimleri deaynı olmalı
// yarın trnedyol geldiğindede,

//2 yazılımcı nın aynı anda aynı işleri hem hepsiburada için hem trendyol içni
// yaptığını düşünün bunların metodlarının isimler ve parametreleri aynı aolmalı.
// bir standart olmadan nasıl yazılabilir. standartı ve planlamayı sağlıyor
//böylece her iki şirkete de aynı manuel yanı fonksiyon isimleri verilebilir.