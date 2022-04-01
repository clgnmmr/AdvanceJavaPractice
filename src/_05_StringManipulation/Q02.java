package _05_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
                     Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminiz ve soyisminizi boşluk bırakarak giriniz");
        String isimSoyIsim=scan.nextLine();

        int bosluk=isimSoyIsim.indexOf(" ");

        String isim=isimSoyIsim.substring(0,bosluk);
        String soyIsim=isimSoyIsim.substring(bosluk+1,isimSoyIsim.length());

        System.out.println("İsminiz :"+isim+"\nSoyisim :"+soyIsim);


    }
}
