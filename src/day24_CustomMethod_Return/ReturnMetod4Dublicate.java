package day24_CustomMethod_Return;

public class ReturnMetod4Dublicate {
    public static void main(String[] args) {
        String str= "aaassssfddfg";                     // Output : asfdg
        str=removeDublicates(str);

        System.out.println(str);


    }







    public static String removeDublicates(String str){

        String result="";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains(""+each)){
                result+=each;

            }

        }
        return result;
    }
}
