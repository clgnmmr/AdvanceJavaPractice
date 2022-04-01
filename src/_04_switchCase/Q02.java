package _04_switchCase;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
      // 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 3 basamaklı bir sayı giriniz");

        int sayi= scan.nextInt();



        if (sayi<100 || sayi>999){
            System.out.println("Gecerli bir 3 basamaklı sayı giriniz");

        }else {
            switch (sayi / 100) {
                case 1:
                    System.out.println("YUZ");
                    break;
                case 2:
                    System.out.println("IKIYUZ");
                    break;
                case 3:
                    System.out.println("UCYUZ");
                    break;
                case 4:
                    System.out.println("DORTYUZ");
                    break;
                case 5:
                    System.out.println("BESYUZ");
                    break;
                case 6:
                    System.out.println("ALTIYUZ");
                    break;
                case 7:
                    System.out.println("YEDİYUZ");
                    break;
                case 8:
                    System.out.println("SEKIZYUZ");
                    break;
                case 9:
                    System.out.println("DOKUZYUZ");
                    break;
                default:
                    System.out.println("");
            }
            switch (sayi % 100 / 10) {
                case 1:
                    System.out.println(" ON");
                    break;
                case 2:
                    System.out.println(" YIRMI");
                    break;
                case 3:
                    System.out.println(" OTUZ");
                    break;
                case 4:
                    System.out.println(" KIRK");
                    break;
                case 5:
                    System.out.println(" ELLİ");
                    break;
                case 6:
                    System.out.println(" ALTMIŞ");
                    break;
                case 7:
                    System.out.println(" YETMİŞ");
                    break;
                case 8:
                    System.out.println(" SEKSEN");
                    break;
                case 9:
                    System.out.println(" DOKSAN");
                    break;
                default:
                    System.out.println("");


            }
            switch (sayi % 10) {
                case 1:
                    System.out.println(" BIR");
                    break;
                case 2:
                    System.out.println(" IKI");
                    break;
                case 3:
                    System.out.println(" UC");
                    break;
                case 4:
                    System.out.println(" DORT");
                    break;
                case 5:
                    System.out.println(" BES");
                    break;
                case 6:
                    System.out.println(" ALTI");
                    break;
                case 7:
                    System.out.println(" YEDI");
                    break;
                case 8:
                    System.out.println(" SEKIZ");
                    break;
                case 9:
                    System.out.println(" DOKUZ");
                    break;
                default:
                    System.out.println("");


            }


        }
    }
}
