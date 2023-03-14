package day27_WrapperClasses;

public class WrapperClassesIntro {
    public static void main(String[] args) {
        int num1 = 200;
        Integer n1 =num1;   //autoboxing
        int num2=n1;        //unboxing

        System.out.println("----------------------------------------");

        Integer integerValue = 100;

        long longValue =integerValue;       //    Wrapper Class'ı farklı primitivelere dönüştürebiliyoruz(Integer ===> long)

        Byte num3 = 25;

        byte num4=num3;
        short num5=num3;
        long num6=num3;

        System.out.println("----------------------------------------");
        int num7=100;
        Integer num8=num7;                  //      int primitive i sadece Integer Wrapper Class a dönüştürebiliyoruz.
                                            //      autoboxing


        System.out.println("----------------------------------------");

        Integer z=900;
        Integer y =z;



        System.out.println("----------------------------------------");
        int[] number1={1,2,3,4,5};
        Integer[] number2={1,2,3,4,5};


        System.out.println("----------------------------------------");
    }
}
