package day45_Abstraction;

public interface PropertiesOfInterface {
    int a=100;          // static & final by default
    static int b=200;   // final by default

    /*
    public PropertiesOfInterface(int a){   // An interface can not have constructors
        this.a=a;
    }
     */

    /*
    static {       // An interface can not have static blocks
        b=100;
    }

     */

    /*
    public void method1(){                          //  An interface can not have instance methods
        System.out.println("Instance method");
    }

     */
    public static void method2(){
        System.out.println("Static Method");
    }
     void method3();  // Abstract by default

    default void method4(){
        System.out.println("Default method");
    }

}

class Test implements PropertiesOfInterface{

    @Override
    public void method3() {

    }

    public static void main(String[] args) {

        new Test().method4();

    }

}
