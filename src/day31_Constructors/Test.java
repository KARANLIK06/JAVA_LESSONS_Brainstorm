package day31_Constructors;

public class Test {
/*
        public Test(){ // line 1
            System.out.print("Default ");
        }
        public static void main(String[] args) {
            Test obj = new Test(); // line 2
        }
    }

 */

    /*
    public Test(){ // line 1
        System.out.print("A ");
        this (10); // line 2
    }
    public Test (int a){ System.out.print("B "); // line 3
    }
    public static void main(String[] args) {
        Test obj = new Test(); // line 4
    }

     */

/*
        public Test(){
            System.out.print("A ");
        }
        public Test (int a){
            this(); // line 1
            System.out.print("B ");
        }
        public Test(String str) {
            this(); // line 2
            this (100); // line 3 System.out.print(str);
        }
        public static void main(String[] args) { Test obj = new Test(); // line 4
        }
    }

 */

    public Test(){
        System.out.println("Developer");
    }
    public void Test(){
        System.out.println("SDET");
    }
    public static void main(String[] args) {
        Test obj =new Test();

    }
}


