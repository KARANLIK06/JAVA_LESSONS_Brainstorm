package day10_NestedIf;

public class NameOfMonth {
    public static void main(String[] args) {
        int number=9;
        String result ="";

        if (number>=1 && number<=12){
            if(number==1){
                result = "Ocak";
            }else if (number==2){
                result = "Şubat";
            }else if (number==3){
                result = "Mart";
            }else if (number==4){
                result = "Nisan";
            }else if (number==5){
                result = "Mayıs";
            }else if (number==6){
                result = "Haziran";
            }else if (number==7){
                result = "Temmuz";
            }else if (number==8){
                result = "Ağustos";
            }else if (number==9){
                result = "Eylül";
            }else if (number==10){
                result = "Ekim";
            }else if (number==11){
                result = "Kasım";
            }else {
                result = "Aralık";
            }




        }else{
            result="Invalid Number";
        }
        System.out.println(result);
    }
}
