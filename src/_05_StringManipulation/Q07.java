package _05_StringManipulation;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 3 harfli isminizi giriniz");
        String isminiz= scan.nextLine().toLowerCase();


        char c1=isminiz.charAt(0);
        char c2=isminiz.charAt(1);
        char c3=isminiz.charAt(2);

    String sonuc=    isminiz.length()==3?(c1!=c2 && c1!=c3 && c2!=c3 ?("girdiginiz isim  3 harfli ve uniq karektere sahip"):
                " lutfen uniq karekterli giriniz") :
              " Girdiginiz 3 harfi degilldir";
        System.out.println(sonuc);
















    }
}