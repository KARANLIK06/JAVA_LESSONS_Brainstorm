package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {
        /*
        3. Write a program that can return the unique characters from a
String
Ex:
input:
AABCCD
output:
BD
Hint: You will need indexOf() and
lastIndexOf()
  if the first and last index
numbers of the character are same, then it's unique
         */
        String str = "aabccdffa";
        String result = "";

        for (int i = 0; i <= str.length()-1; i++) {         //i<str.length()
            char ch = str.charAt(i);

            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                result+=ch;

            }

        }
        System.out.println(result);
    }
}
