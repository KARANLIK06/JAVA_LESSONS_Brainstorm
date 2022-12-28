package day01_JavaIntro;

import day24_CustomMethod_Return.ReturnMetod4Dublicate;
import day24_CustomMethod_Return.ReturnMetodReverse;

public class Test {
    public static void main(String[] args) {
        String str= "aaaaaaaabbbbbbbbbbbbbbbbb";
        str=ReturnMetod4Dublicate.removeDublicates(str);
        System.out.println(str);

        String name = "Java Programming";
        name = ReturnMetodReverse.reverse(name);
        System.out.println(name);

    }
}
