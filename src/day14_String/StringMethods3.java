package day14_String;

public class StringMethods3 {
    public static void main(String[] args) {
        String word = "Cydeo School";
        String brand = word.substring(0,4);// ending indexi kapsamaz. onu ekrana yazdırmaz.
        System.out.println("brand = " + brand);

        String str = word.substring(4);//eğer tek rakam yazılırsa başlangıç indexi olur
        // ve girilen index dahil kalan herşeyi yazdırır.
        System.out.println("str = " + str);
        System.out.println("-----------------------------");

        String word2="Java Programming Language";
        String s1=word2.substring(0,word2.indexOf(" "));
        String s2=word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));
        String s3=word2.substring(word2.lastIndexOf(" ")+1);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
    }
}
