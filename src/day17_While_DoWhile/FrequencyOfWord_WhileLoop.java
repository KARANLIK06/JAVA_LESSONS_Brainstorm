package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String  str = "Java Java Java Python Java Java";
        int counterJava=0;

        while (str.contains("Java")){
            str=str.replaceFirst("Java","");
            counterJava++;
        }
        System.out.println(counterJava);

        System.out.println("-------------------------");

        String  str2 = "Java Java Java Python Java Java Python Python Python";
        int countJava=0;
        int countPyton=0;

        while ((str2.contains("Java")|| str2.contains("Python"))) {

            if (str2.contains("Java")) {
                str2 = str2.replaceFirst("Java", "");
                countJava++;
            }
            if (str2.contains("Python")) {
                str2 = str2.replaceFirst("Python", "");
                countPyton++;
            }
        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPyton = " + countPyton);
    }
}
