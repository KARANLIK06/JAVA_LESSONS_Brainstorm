package day24_CustomMethod_Return;

public class DoubleWordPrint {
    public static void main(String[] args) {
        String words = "gggkkyyoo";

        String result = "";

        for (int i = 0; i < words.length(); i++) {
            char each = words.charAt(i);

            int count = 0;
            for (int j = 0; j < words.length(); j++) {
                if (words.charAt(j) == each) {
                    count++;

                }
            }
            if (count == 2) {
                if (!result.contains(""+each)){
                    result+=each;
                }
            }
        }
        System.out.println(result);
    }
}


