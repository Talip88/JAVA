package Gun50_GenelTekrar;

public class Scope4 {


    static int a=10;
    int b;
    static int c;

    public static void main(String[] args) {

        Scope4 obj1= new Scope4();


        System.out.println(obj1.b); // 0
        System.out.println(obj1.a); // 10  static variable'lara ulasmak icin objeye ihtiyac yoktur
        System.out.println(a); // 10
        System.out.println(obj1.c); // 0
        System.out.println(c); // 0

        obj1.b++;
        obj1.a++;

        Scope4 obj2= new Scope4();

        System.out.println(obj2.a); // 11

        Scope4 obj3= new Scope4();

    }
}