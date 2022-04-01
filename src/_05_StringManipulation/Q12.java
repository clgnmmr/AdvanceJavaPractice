package _05_StringManipulation;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
		/* TASK :
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */

        Scanner scan=new Scanner(System.in);
        System.out.println("lUTFEN BİR email GİRİNİZ");

        String str=scan.nextLine();


        if (!str.contains("@")){
            System.out.println("geçerli bir email giriniz");
        }else {
            if (str.endsWith("@gmail.com")){
                System.out.println("email onaylandı");

            }else System.out.println("lutfen gmail hesabınızı giriniz");


        }



    }

}
