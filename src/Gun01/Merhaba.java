package Gun01;

public class Merhaba {
    public static void main(String[] args)
    {
        // Java ya hosgeldiniz.
        System.out.println("Merhaba Dünya");



        String originalStr = "Hello";
        String reversedStr = "";
        System.out.println("Original string: " + originalStr);

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: "+ reversedStr);



    }
}
