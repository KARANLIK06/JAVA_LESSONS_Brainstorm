package day14_String;

public class Substring {
    public static void main(String[] args) {
        String mail="Cydeo.School@gmail.com";
        String email=mail.substring(mail.indexOf("@")+1,mail.lastIndexOf("."));
        System.out.println(email);
    }
}
