package day24_CustomMethod_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
        initials("Cydeo","School");

        System.out.println("-------------------------");

        domains("cydeo_school@gmail.com");

        System.out.println("----------------------------");

        String [] emails={"john@gmail.com","muhtar@cydeo.com","mahmut@yahoo.com","vecihi@hotmail.com"};
        for (String email : emails) {
            domains(email);
        }

        System.out.println("------------------------------");


        nameOfMonth(9);

        System.out.println("--------------------------------");

        nameOfDay(6);




    }



//Create a method that can display the initials of the person
public static void initials(String firstName, String  lastName){
        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        initial=initial.toUpperCase();
    System.out.println(initial);

}


//Create a method that can display the domain of the email
public static void domains(String email){
        String domain= email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
    System.out.println(domain);

}


//Create a method that can display the name of the month based on the given number to the method
public static void nameOfMonth(int number){
        String name;

        if(number>=1&&number<=12){

            name=(number==1)?"January":(number==2)?"February":(number==3)?"March":(number==4)?"April":(number==5)?"May":(number==6)?"June":(number==7)?"July":(number==8)?"August":(number==9)?"September":(number==10)?"October":(number==11)?"November":"December";

        }else{
            name="Invalid";
        }
    System.out.println(name);
}


//Create a method that can print the name of the day based on the given number to the method
public static void nameOfDay(int number){
        String days;

        if (number>=1&&number<=7){

            days = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" : (number == 4) ? "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";
        }else{
            days="Invalid";
        }
    System.out.println(days);
}

}

/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

 */
