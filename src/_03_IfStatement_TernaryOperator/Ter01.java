package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter01 {

            public static void main(String[] args) {

                        /*
                        TASK :
                       Kullanicidan bir sayi aliniz
                       Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
                       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
                       Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
                        */
          Scanner scan =new Scanner(System.in);

                System.out.print("lutfen bir ayı giriniz : ");
                double sayi=scan.nextDouble();


                String sonuc=(sayi>=0)?(sayi<10?"Rakam":"Pozitif sayi"):("Negatif sayi");
                System.out.println(sonuc);





    }
}
