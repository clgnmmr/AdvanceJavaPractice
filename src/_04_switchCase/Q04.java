package _04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi

        Scanner scan=new Scanner(System.in);
        System.out.println(" Pazartesi :1 \n Salı :2 \n Carsamba :3\n Persembe :4\n Cuma :5 \n Cumartesi :6 \n Pazar :7\n " +
                "Haftanın kacıncı gununde oldugunuzu giriniz ");

        int kacıncıGun=scan.nextInt();

        if (kacıncıGun<=0 || kacıncıGun>7){
            System.out.println("hatalı veri girdiniz");
        }else {

            System.out.println("Kac un sonrasını ogrenmek istiyorsunuz");

            int kacGunSonrası = scan.nextInt();

            int bulunanGun = (kacGunSonrası + kacıncıGun) % 7;


            switch (bulunanGun) {
                case 1:
                    System.out.println(kacGunSonrası + " gun sonra gunlerden PAZARTESİ");
                    break;
                case 2:
                    System.out.println(kacGunSonrası + " gun sonra gunlerden SALI");
                    break;
                case 3:
                    System.out.println(kacGunSonrası + " gun sonra gunlerden CARSAMBA");
                    break;
                case 4:
                    System.out.println(kacGunSonrası + " gun sonra gunlerden PERSEMBE");
                    break;
                case 5:
                    System.out.println(kacGunSonrası + " gun sonra gunlerden CUMA");
                    break;
                case 6:
                    System.out.println(kacGunSonrası + " gun sonra gunlerden CUMARTESİ");
                    break;
                case 0:
                    System.out.println(kacGunSonrası + " gun sonra gunlerden PAZAR");
                    break;
                default:
                    System.out.println("agam hafta 7 gundur ");


            }


        }




    }
}

