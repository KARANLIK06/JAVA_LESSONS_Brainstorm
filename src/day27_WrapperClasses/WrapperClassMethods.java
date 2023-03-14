package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str = "123";
        int num1=Integer.parseInt(str);
        System.out.println(num1+1);     //124
        System.out.println(str+1);      //1231

        System.out.println("---------------------------");

        String str2="10.5";
        double num2=Double.parseDouble(str2);
        System.out.println(num2+1);     //11.5

        System.out.println("---------------------------");

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("---------------------------");

        long max2=Long.MAX_VALUE;
        long min2=Long.MIN_VALUE;

        System.out.println("min2 = " + min2);
        System.out.println("max2 = " + max2);


        System.out.println("---------------------------");

        String  s1="true";
        boolean r1=Boolean.parseBoolean(s1);
        System.out.println(r1);

        String  s2="false";
        boolean r2=Boolean.parseBoolean(s2);
        System.out.println(r2);

        String  s3="maybe";                         // default olarak false döndürüyor
        boolean r3=Boolean.parseBoolean(s3);
        System.out.println(r3);

        System.out.println("---------------------------");

        String s4 = "123";
        Integer x = Integer.valueOf(s4);
        int y = Integer.valueOf(s4);
        System.out.println(x);
        System.out.println(y);

        String s5 ="1.5";
        Double z=Double.valueOf(s5);
        System.out.println(z);


        System.out.println("---------------------------");

        //  isDigit()
        char ch1='0';
        boolean c1 =Character.isDigit(ch1);
        System.out.println(c1);


        //  isLetter(9
        char ch2='A';
        boolean c2 =Character.isLetter(ch2);
        System.out.println(c2);


        // special char
        char ch3='!';
        boolean c3 =!Character.isLetterOrDigit(ch3);
        System.out.println(c3);

        //upperCase
        char ch4='A';
        boolean c4 =Character.isUpperCase(ch4);
        System.out.println(c4);

        //lowerCase
        char ch5='%';
        boolean c5 =Character.isLowerCase(ch5);
        System.out.println(c5);



        System.out.println("---------------------------");


        String s = "ab1cde2efg3hi4";

        int sum=0;

        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }
        System.out.println("sum = " + sum);

    }
}
