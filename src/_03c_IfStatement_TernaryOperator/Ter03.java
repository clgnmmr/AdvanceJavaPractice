package _03c_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter03 {

    public static void main(String[] args) {
        /*
        TASK :
         Kullanıcıdan bir pozitif tamsayı girmesini isteyin,3 Basama o pozitif tamsayı 3 basamaklı ise ekrana “klı” yazdırın.
         3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
         Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen bir pozitif tam sayı giriniz :");

        int sayi = scan.nextInt();

      /*    if (sayi <= 0) {
            System.out.println("lutfen pozitif bir tamsayi sayi giriniz");

        } else if (sayi > 99 && sayi < 1000) {

            System.out.println("Giridiginiz sayi : " + sayi + " > 3 basamaklıdır");

        } else if (sayi % 2 == 0) {

            System.out.println("Giridiginiz sayi : " + sayi + " >  çift sayidir");

        } else {

            System.out.println("Giridiginiz sayi : " + sayi + " >  tek sayidir");


        }   */



        String sonuc=  (sayi>99 && sayi<1000)  ?  ("3 basamaklı bir sayi girdiniz" )  : ( (sayi%2==0) ? ("çift sayidir"): ("tek sayidir"));

        System.out.println(sonuc);


    }
}