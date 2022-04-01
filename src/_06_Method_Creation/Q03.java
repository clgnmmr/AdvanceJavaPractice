package _06_Method_Creation;

import java.util.Scanner;

public class Q03 {

    static  Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

/*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.
1 mil =1,609344 km
1 saat=3600 sn
1 kg=1000g

 */
        System.out.println("lutfen cevirmek istediginiz değeri seçiniz");
        double sayi=scan.nextInt();
        cevir(sayi);





    }

    private static void cevir(double sayi) {
       if (sayi>0) {

           System.out.println("Saati saniyeye cevirmek 1\n mili kilometreye cevirmek 2 \nkilogramı gram a cevirme 3");
           int secim = scan.nextInt();

           switch (secim) {


               case 1:
                   System.out.println(sayi * 3600 + "sn");
                   break;
               case 2:
                   System.out.println(sayi * 1.609344 + "km");
                   break;
               case 3:
                   System.out.println(sayi * 1000 + "g");

           }

       }else   System.out.println("negatif değerin karşılıgı olmaz");





    }
}

