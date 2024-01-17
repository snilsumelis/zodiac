import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int mount,day;

        Scanner input = new Scanner(System.in);
        System.out.print("enter the mount: ");
        mount = input.nextInt();

        System.out.print("enter the day: ");
        day = input.nextInt();

        if(mount==1){
            if(day>0 && day<=21){
                System.out.print("Oglak ");
            }else if (day>21 && day<=31 ){
                System.out.print("kova ");
            }else{
                System.out.print("Gecerli bir deger giriniz ");
            }
        }else if(mount==2){
            if(day>0 && day<=19){
                System.out.print("Kova ");
            }else if (day>19 && day<=28 ){
                System.out.print("Balık ");
            }else{
                System.out.print("Gecerli bir deger giriniz ");
            }
        }else if(mount==3){
            if(day>0 && day<=20){
                System.out.print("Balık ");
            }else if (day>21 && day<=31 ){
                System.out.print("koc ");
            }else{
                System.out.print("Gecerli bir deger giriniz ");
            }
        }else if(mount==4){
            if(day>0 && day<=20){
                System.out.print("Koc ");
            }else if (day>20 && day<=30 ){
                System.out.print("Boga ");
            }else{
                System.out.print("Gecerli bir deger giriniz ");
            }
        }else if(mount==5){
            if(day>1 && day<=21){
                System.out.print("Boga ");
            }else if (day>21 && day<=31 ){
                System.out.print("İkizler ");
            }else{
                System.out.print("Gecerli bir deger giriniz ");
            }
        }else if(mount==6){
            if(day>1 && day<=22){
                System.out.print("İkizler ");
            }else if (day>22 && day<=30 ){
                System.out.print("Yengec ");
            }else{
                System.out.print("Gecerli bir deger giriniz ");
            }
        }else if(mount==7){
            if(day>1 && day<=22){
                System.out.print("Yengec ");
            }else if (day>22 && day<=31 ){
                System.out.print("Aslan ");
            }else{
                System.out.print("Gecerli bir deger giriniz ");
            }
        }else if(mount==8){
            if(day>1 && day<=22){
                System.out.print("Aslan ");
            }else if (day>22 && day<=31 ){
                System.out.print("Basak ");
            }else{
                System.out.print("Gecerli bir deger giriniz ");
            }
        }else if(mount==9){
            if(day>1 && day<=22){
                System.out.print("Basak ");
            }else if (day>22 && day<=30 ){
                System.out.print("Terazi ");
            }else{
                System.out.print("Gecerli bir deger giriniz ");
            }
        }else if(mount==10){
            if(day>1 && day<=22){
                System.out.print("Terazi ");
            }else if (day>22 && day<=31 ){
                System.out.print("Akrep ");
            }else{
                System.out.print("Gecerli bir deger giriniz ");
            }
        }else if(mount==11){
            if(day>1 && day<=21){
                System.out.print("Akrep ");
            }else if (day>21 && day<=30 ){
                System.out.print("Yay ");
            }else{
                System.out.print("Gecerli bir deger giriniz ");
            }
        }else if(mount==12){
            if(day>1 && day<=21){
                System.out.print("Yay ");
            }else if (day>21 && day<=31 ){
                System.out.print("oglak ");
            }else{
                System.out.print("Gecerli bir deger giriniz ");
            }
        }else {
            System.out.print("Gecerli bir deger giriniz ");
        }
    }
}
