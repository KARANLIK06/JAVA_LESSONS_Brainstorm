package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        System.out.println(numbers);            //  Output  ==>  [10, 20, 30, 40, 50, 60]

        numbers.add(2,25);
        System.out.println(numbers);            //  Output  ==>  [10, 20, 25, 30, 40, 50, 60]
        numbers.add(5,45);
        System.out.println(numbers);            //  Output  ==>  [10, 20, 25, 30, 40, 45, 50, 60]

        System.out.println("-----------------------------------------------------------------");

        System.out.println(numbers.size());
        int lastIndex = numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);

        int num= numbers.get(3);
        System.out.println("num = " + num);
        System.out.println("-----------------------------------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("-----------------------------------------------------------------");

        ArrayList<String > list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");
        System.out.println(list);

        list.set(2,"JavaScript");  //replace
        list.set(3,"C++");

        System.out.println("After set ="+list);



        System.out.println("-----------------------------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);                  //  [Suat, Aygun, Olga, Neira, Ali, Hulya, Kaloyan]
        employees.remove(0);
        employees.remove(0);
        employees.remove(0);
        System.out.println(employees);                  //  [Neira, Ali, Hulya, Kaloyan]
        employees.remove(1);
        System.out.println(employees);                  //  [Neira, Hulya, Kaloyan]
        employees.remove(employees.size()-1);
        System.out.println(employees);                  //  [Neira, Hulya]
        boolean r1 =employees.remove("Hulya");
        System.out.println(employees);                  //  [Neira]
        System.out.println(r1);                         //  true
        boolean r2 =employees.remove("Neira");
        System.out.println(employees);                  //  []
        System.out.println(r2);                         //  true


    }
}
