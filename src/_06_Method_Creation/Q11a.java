package _06_Method_Creation;

import java.util.Scanner;

public class Q11a {
    static int bakiye = 1000;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {



         /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
  ve cekme, çıkış işlemlerinin yapıldıgı bir
   ATM app. method create ediniz
   */
        System.out.println("    ****    ");
        System.out.println("    ATM'ye hos geldiniz  :-)    ");
        System.out.println("Bakiye sorgulama : 1\nPara cekme : 2\nPara yatırma : 3\ncıkıs : 4 ");

        secim();


    }





    private static void secim() {

        System.out.print("Yapacagınız işlemi seçiniz :");
        int secim=scan.nextInt();

        switch(secim){
            case 1:
                bakıyeSorgulama();
                break;
            case 2:
                paraCek();
                break;
            case 3:
                paraYatır();
                break;
            case 4:
                cıkıs();
                break;





        }

    }







    private static void paraYatır() {

        System.out.println("Bakiyeniz :"+bakiye);

        System.out.println("yatırmak istediğiniz değeri giriniz :");

        int paraYatırma=scan.nextInt();

        bakiye+=paraYatırma;

        System.out.println("paranız yatırılmıştır.");

        System.out.println("   ***  ");

        System.out.print("işleme devam etmek istiyorsanız 1\n işleme devam etmek istemiyorsanız 0\n tuslayınız :");

        int karar= scan.nextInt();
        if (karar ==1) {
            secim();
        }else cıkıs();



    }







    private static void paraCek() {

        System.out.println("Bakiyeniz :"+bakiye);

        System.out.println("cekmek istediğiniz değeri giriniz :");

        int paraCekme=scan.nextInt();

        if (paraCekme>bakiye){

            System.out.println("bakiyeniz yetersiz");

        }else{

            bakiye-=paraCekme;

            System.out.println( "kalan bakiye"+bakiye);
        }

        System.out.println("   ***  ");

        System.out.print("işleme devam etmek istiyorsanız 1\n işleme devam etmek istemiyorsanız 0\n tuslayınız :");

        int karar= scan.nextInt();

        if (karar ==1) {

            secim();

        }else cıkıs();

    }







    private static void bakıyeSorgulama() {

        System.out.print("Bakiyeniz :"+bakiye);

        System.out.println("   ***  ");

        System.out.println("işleme devam etmek istiyorsanız 1\n işleme devam etmek istemiyorsanız 0\n tuslayınız");

        int karar= scan.nextInt();

        if (karar ==1) {

            secim();

        }else cıkıs();

    }







    private static void cıkıs() {
        System.out.println("cıkışınız yapıldı \n yine bekleriz \n hosca kalın");
    }


}



