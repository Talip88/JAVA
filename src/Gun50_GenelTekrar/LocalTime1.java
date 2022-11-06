package Gun50_GenelTekrar;

import java.time.*;
import java.time.ZoneId;
public class LocalTime1 {
    public static void main(String[] args) {

       //LocalTime1 saat = LocalTime1.now(ZoneId.of("Europe/London"));

       //System.out.println(saat); // 19:03:27.658174

       //LocalTime1 localSaat1= LocalTime1.now(ZoneId.of("Europe/London"));
       //System.out.println(localSaat1); // 18:06:44.835579

       //LocalTime1 localSaat2= LocalTime1.now(ZoneId.of("Turkey"));
       //System.out.println(localSaat2); // 20:07:19.380256

       //LocalTime1 localSaat3= LocalTime1.now(ZoneId.of("America/New_York"));
       //System.out.println(localSaat3); // 13:09:40.408075


        LocalDateTime ldt=LocalDateTime.now();

        System.out.println(ldt); // 2022-09-01T19:11:45.014862

        /*
        Date ve time'i DateTimeFormatter ile
        istedigimiz gibi manipule edebiliriz
        veya bugune kadarki bilgilerimizle bu isi cozmek istersek
         */

        String tarihVeSaat=ldt.toString();

        // bu tarih 2022'e mi ait ?
        System.out.println(tarihVeSaat.startsWith("2022")); // true





        LocalDate bugun=LocalDate.now();
        LocalDate dogumTarihi=LocalDate.of(1972,01,01);

        Period yas=Period.between(dogumTarihi,bugun);

        System.out.println(yas); // P50Y8M

        System.out.println(yas.getYears()); // 50

    }




}
