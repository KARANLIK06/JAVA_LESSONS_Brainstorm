package day20_Arrays;

public class Task {
    public static void main(String[] args) {
       /*
Ali , Mustafa , Merve
Emin , Mehmet , Tugba
Bünyamin , Bilal , Bekir
 */
        String [] word = {"Ali","Mustafa","Merve","Emin","Mehmet","Tugba","Bünyamin","Bilal","Bekir"};

        for (int i = 0; i < word.length; i+=3) {
            System.out.println(word[i]+ " , "+word[i+1]+" , "+word[i+2]);
        }

        System.out.println("=======================================================================================");

        /*
Ali , Mustafa
Merve , Emin
Mehmet , Tugba
Bünyamin , Bilal
         */
        String [] word2 = {"Ali","Mustafa","Merve","Emin","Mehmet","Tugba","Bünyamin","Bilal"};
        for (int i = 0; i < word2.length; i+=2) {
            System.out.println(word2[i]+" , "+word2[i+1]);
        }
    }

}
