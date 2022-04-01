package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C10_Proje2 {/*
 * Basit bir 5 ürünlü manav alisveris programi yaziniz.
 *
 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
 * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
 *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
 *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
 *
 * */
    static Scanner scan=new Scanner(System.in);
    static  double toplamFiyat=0;

    public static void main(String[] args) {

        secim();

    }





    private static void secim() {

        String[] manavListesi ={"domates","biber","patlıcan","sogan","patates"};
        System.out.println(Arrays.toString(manavListesi));

        System.out.println("lutfen secim yapınız :\ndomates 1\nbiber 2\npatlıcan 3\nsogan 4\npatates 5\ncıkıs 6 \n  basınız :");

        int secim=scan.nextInt();

        switch(secim){
            case 1:
                domates();
                break;
            case 2:
                biber();
                break;
            case 3:
                patlıcan();
                break;
            case 4:
                sogan();
                break;
            case 5:
                patates();
                break;
            case 6:
                cıkıs();
                break;





        }

    }

    private static void patates() {
        System.out.println("sogan kilo fiyatı 2.5$ ");

        System.out.print("kac kilo aldınız :");

        double kilo1=scan.nextInt();

        toplamFiyat+=(kilo1*2.5);


        System.out.print("işleme devam etmek istiyorsanız 1\n işleme devam etmek istemiyorsanız 0\n tuslayınız :");

        int karar= scan.nextInt();

        if (karar ==1) {

            secim();

        }else cıkıs();
    }

    private static void sogan() {

        System.out.println("sogan kilo fiyatı 3$ ");

        System.out.print("kac kilo aldınız :");

        double kilo1=scan.nextInt();

        toplamFiyat+=(kilo1*3);


        System.out.print("işleme devam etmek istiyorsanız 1\n işleme devam etmek istemiyorsanız 0\n tuslayınız :");

        int karar= scan.nextInt();

        if (karar ==1) {

            secim();

        }else cıkıs();

    }

    private static void patlıcan() {
        System.out.println("patlıcan kilo fiyatı 1$ ");

        System.out.print("kac kilo aldınız :");

        double kilo1=scan.nextInt();

        toplamFiyat+=(kilo1*1);


        System.out.print("işleme devam etmek istiyorsanız 1\n işleme devam etmek istemiyorsanız 0\n tuslayınız :");

        int karar= scan.nextInt();

        if (karar ==1) {

            secim();

        }else cıkıs();

    }

    private static void biber() {
        System.out.println("biber kilo fiyatı 1.5$ ");

        System.out.print("kac kilo aldınız :");
        double kilo1=scan.nextInt();

        toplamFiyat+=(kilo1*1.5);


        System.out.print("işleme devam etmek istiyorsanız 1\n işleme devam etmek istemiyorsanız 0\n tuslayınız :");

        int karar= scan.nextInt();

        if (karar ==1) {

            secim();

        }else cıkıs();

    }

    private static void domates() {
        System.out.println("domates kilo fiyatı 2$ ");

        System.out.print("kac kilo aldınız :");
        double kilo1=scan.nextInt();

        toplamFiyat+=(kilo1*2);


        System.out.print("işleme devam etmek istiyorsanız 1\n işleme devam etmek istemiyorsanız 0\n tuslayınız :");

        int karar= scan.nextInt();

        if (karar ==1) {

            secim();

        }else cıkıs();


    }







    private static void cıkıs() {

        System.out.println("toplam tutar = "+toplamFiyat+"$");

        System.out.println("cıkışınız yapıldı \n yine bekleriz \n hosca kalın");
    }


}
