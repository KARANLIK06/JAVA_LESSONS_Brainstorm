package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {
        String str="Java is fun, I love learning Java";
        String str2= str.replace("Java","Python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        email=email.replace("yahoo","gmail");
        System.out.println("email = " + email);

        String sentence= "Java Java Python Python C# C# C++ C++ Python Python Python Python java";
        String sentence2=sentence.replace("Python","").replace("   "," ");
        System.out.println("sentence2 = " + sentence2);

        String s ="Dog Dog Dog Dog Dog Dog ";
        s=s.replace("Dog","Cat");
        System.out.println("s = " + s);

        System.out.println("-----------------------");

        String result= "Java Java Java";
        result=result.replaceFirst("Java","Python");
        System.out.println( result);

        String result2 = "Java";
        result2=result2.replaceFirst("a","o");
        System.out.println("result2 = " + result2);

        String result3 = "Java Programming";
        result3=result3.substring(0,1);
        System.out.println("result3 = " + result3);



    }
}
