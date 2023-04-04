package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {        // outer class can not be static
   static class class1{         //  inner class can be static

    }

    public static int num = 100;
    public static void Method(){

    }
    static {

    }
}

class A{
    static class B{
        public static void method1(){

        }
    }
}

class C{
    public static void main(String[] args) {

        A.B.method1();
    }
}

class X{

}

class Y {

}

 class Z{
    public class Q{

    }
}