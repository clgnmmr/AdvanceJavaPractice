package _05_StringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminiz ve soyisminizi boşluk bırakarak giriniz");

        String isimSoyIsim=scan.nextLine().toUpperCase();

        int birinciBosluk=isimSoyIsim.indexOf(" ");
        int ikinciBosluk=isimSoyIsim.lastIndexOf(" ");


        String isimKisaltması=isimSoyIsim.substring(0,1)+"."+isimSoyIsim.substring(birinciBosluk+1,birinciBosluk+2)

                +"."+isimSoyIsim.substring(ikinciBosluk+1,ikinciBosluk+2);


        System.out.println(isimKisaltması);


    }
}
