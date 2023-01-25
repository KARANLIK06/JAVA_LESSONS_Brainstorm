package day13_StringClass;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        for (int i = 0, k = 'Z'; i < alphabets.length && k >= 'A'; i++,k--) {

            alphabets[i] = (char) k;

        }
        System.out.println(Arrays.toString(alphabets)); // [Z, Y, X, W, V, U, ....]
    }
}
