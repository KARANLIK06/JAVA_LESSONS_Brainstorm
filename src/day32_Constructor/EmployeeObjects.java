package day32_Constructor;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 =new Employee("John");
        Employee employee2 =new Employee("Muhtar",'M');
        Employee employee3 =new Employee("Adam",'M',"Dev");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

    }
}
