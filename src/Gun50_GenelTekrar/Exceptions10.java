package Gun50_GenelTekrar;

public class Exceptions10 {
    public static void main(String[] args) {

        /*
         final keyword variable, method ve class icin kullanilabilir
         variable final olarak tanimlanirsa, o variable'a sonradan deger atanamaz
         method final olarak tanimlanirsa, override edilemez
         class final olarak tanimlanirsa, parent ilan edilemz
         finally blogu: try blogu ile kullanilir, exception olussa da olusmasa da calisir
         finalize () : Garbage collectorun calismasi icin on hazirlik yaparak
                       kullanilmayan objeleri toparlar
         */


            final int sayi= 10;

            System.out.println(sayi);

            System.out.println(Integer.MAX_VALUE);


        }

        public static final void method1(){


        }

           /*
    public static final void method1(){
        parent class'daki method1 final olarak tanimlandigi icin
        override edilemez
    }
     */
    }
