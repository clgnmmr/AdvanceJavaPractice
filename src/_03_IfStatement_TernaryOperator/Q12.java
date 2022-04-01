package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        /*
        TASK :
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen vize notunuzu giriniz ");

        double vize = scan.nextDouble();

        System.out.println("Lutfen final notunuzu giriniz ");

        double ffinal = scan.nextDouble();

        System.out.println("Lutfen vize sinavinin yuzdesini yaziniz");

        double vizeYuzde = scan.nextDouble();

        System.out.println("Lutfen final sinavinin yuzdesini yaziniz");

        double ffinalYuzde = scan.nextDouble();

        double ortalama = (vize*vizeYuzde) + (ffinal*ffinalYuzde);

        System.out.println("Ortalamaniz : " + ortalama);

        if (ortalama>=50){

            System.out.println("Tebrikler dersi başarı ile gectiniz");

        }else {

            System.out.println("Maalesef dersten kaldiniz");

        }


    }
}
