package Gun19;

import java.util.Arrays;

public class _04_Java2DArray {
    public static void main(String[] args) {
        // 2 boyutlu 3x4 diziyi random 1-10 arası sayılarla doldurup,
        // başka döngüde yazdırınız.


        int[][] tablo=new int[3][4]; //2 boyutlu 3x4 diziyi

        for(int i=0; i< 3;i++)
            for(int j=0; j< 4;j++)
                tablo[i][j]=(int)(Math.random()*10);  // bütün elemanlara random 1-10 arası sayı atandı

        System.out.println(Arrays.deepToString(tablo));

        // ekarana yazdırma işlemi
        for(int i=0; i< 3;i++) {

            for (int j = 0; j < 4; j++)
                System.out.print(tablo[i][j]+" ");

            System.out.println();
        }

    }
}
