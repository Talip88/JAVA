package Gun44;

public class S59 {
    public static void main(String[] args) {

          int[] intArr={8,16,32,64,128};

          //a out of bounds hatası
//          for(int i : intArr)
//              System.out.println(intArr[i]);

        // b doğru
        for(int i : intArr)
            System.out.println(i);

        //c  int sayi=0; compile error
//        for(int i=0 : intArr){
//            System.out.println(intArr[i]);
//            i++;
//        }

            //d
        //sadece indexi yazdırır
       // for(int i=0; i< intArr.length; i++)
          //  System.out.println(i);

        //e doğru
        for (int i = 0; i <intArr.length ; i++) {
            System.out.println("intArr[i] = " + intArr[i]);

            //f compile error
            //for (int j;j j <intArr.length ; j++) {
          //      System.out.println(intArr[i]);
            }

        }


    }