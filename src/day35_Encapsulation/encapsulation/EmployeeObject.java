package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Tatiana",'F',28,110000);
        System.out.println(employee1);

        //employee1.age=35; // age is private
        employee1.setAge(35);
        System.out.println(employee1);

        Employee employee2 = new Employee("Tahir",'N',25,120000);
        System.out.println(employee2);
        employee2.setGender('M');
        employee2.setSalary(employee1.getSalary()+20000);
        System.out.println(employee2);
    }
}
