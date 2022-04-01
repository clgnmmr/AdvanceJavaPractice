package _04_switchCase;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {



    Scanner scan = new Scanner(System.in);

        System.out.println ("***Yılmaz seyahat şirketine hoşgeldiniz ***");
        System.out.println ("Frankfurt : 60 KM \n Köln : 80 KM\n 20 KM başına ücretlendşrme yapılır");
        System.out.println ("Yolculuk yapacağınız şehri seçiniz:");

    String hedef = scan.next().toUpperCase(); //şehir büyük harfe update edilecek

    double bakiye = 100;
    double frUcret = (60 / 20) * 5;
    double klUcret = (80 / 20) * 5;

        switch (hedef) {

        default:
            System.out.println("Hatalı giriş yaptınız");

            break;

        case "FRANKFURT":
            System.out.println("Rota : Frankfurt");
            System.out.println("Frankfurt" + frUcret + " Eur");
            System.out.print("kaç kişi seyahat edeceksiniz?");
            int kisi = scan.nextInt();

            switch (kisi) {
                case 1:
                    System.out.println("1 kişilik bilet\nBilet tutarınız: " + frUcret + "Eur" + "güncel bakiyeniz:" + (bakiye -= frUcret));
                    break;
                case 2:
                    System.out.println("2 kişilik bilet \nBilet tutarınız: " + frUcret * 2 + "Eur" + "güncel bakiyeniz:" + (bakiye -= frUcret * 2));
                    break;
                default:
                    System.out.println("2 kişiden fazla yolculuk yapamazsınız");
                    break;

            }
            break;

                case "KOLN":
                    System.out.println("Rota : Köln");
                    System.out.println("Köln" + klUcret + " Eur");
                    System.out.print("kaç kişi seyahat edeceksiniz?");
                    int kisi1 = scan.nextInt();
                    switch (kisi1) {
                        case 1:
                            System.out.println("1 kişilik bilet\nBilet tutarınız: " + klUcret + "Eur" + "güncel bakiyeniz:" + (bakiye -= klUcret));
                            break;
                        case 2:
                            System.out.println("2 kişilik bilet \nBilet tutarınız: " + klUcret * 2 + "Eur" + "güncel bakiyeniz:" + (bakiye -= klUcret * 2));
                            break;
                        default:
                            System.out.println("2 kişiden fazla yolculuk yapamazsınız");
                            break;
                    }
     }

            }
        }


