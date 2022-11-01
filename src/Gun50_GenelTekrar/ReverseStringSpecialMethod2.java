package Gun50_GenelTekrar;

public class ReverseStringSpecialMethod2 {
    public static void main(String[] args) {
                                     //REVERSE STRİNG METHODS
//1.*******************************************************************************************************************
        String sent="He wants to come with me.";
        String reverse = new StringBuilder(sent).reverse().toString();
        System.out.println(reverse);
        //****
        String string = "abcdef";
        String reverset = new StringBuffer(string).reverse().toString();
        System.out.println("\nString before reverse: "+string);
        System.out.println("String after reverse: "+reverset);
//2.*******************************************************************************************************************
        String s1 = "neelendra";
        for(int i=s1.length()-1;i>=0;i--)
        {
            System.out.print(s1.charAt(i));
        }
//3.*******************************************************************************************************************
        String str = "Hello";
        String result = "";

        for(int i = str.length()-1; i>=0; i--){
            result += str.charAt(i); // first solution, charAt method
            //  result += str1.substring(i, i+1); // first solution,  substring method
        }
        System.out.println(result);




    }
}
