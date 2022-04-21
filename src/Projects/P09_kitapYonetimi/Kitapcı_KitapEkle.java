package Projects.P09_kitapYonetimi;

import java.util.ArrayList;

import java.util.Scanner;

public class Kitapcı_KitapEkle {
    static  Scanner scan = new Scanner(System.in);
    static int count = 1000;
    static ArrayList<EklenenKitaplar> kitapEkle=new ArrayList<>();











   public static void secimPaneli(){
       System.out.print( "lutfen secim icin bir numara giriniz : ");
       String secim=scan.next();
       switch(secim){
           case "1":
             kitapEkle();
               menu();
               secimPaneli();
               break;
           case "2":
               numaraBul();
               menu();
               secimPaneli();
               break;
           case "3":
               bilgiBul();
               menu();
               secimPaneli();
               break;
           case "4":
               numaraSil();
               menu();
               secimPaneli();
               break;
           case "5":
               listele();
               menu();
               secimPaneli();
               break;
           case "6":
               cıkıs();
               break;
               default:
                   System.out.println( "Yanlıs secim yaptınız... Tekrar deneyiniz.");
                   secimPaneli();
                   break;
       }





   }

    private static void bilgiBul() {
        System.out.println("============BİLGİ İLE KİTAP BULMA===========");
        System.out.print("Kitap aramak icin bilgi giriniz  :");
        scan.nextLine();//dummy
       String arananBilgi=scan.nextLine();

        for (int i = 0; i <kitapEkle.size() ; i++) {
            if (kitapEkle.get(i).getKitapAdı().equalsIgnoreCase(arananBilgi) ||
                    kitapEkle.get(i).getKitapYazar().equalsIgnoreCase(arananBilgi) ||
                    kitapEkle.get(i).getKitapFiyati().equalsIgnoreCase(arananBilgi)) {

                System.out.println("ARADIGINIZ  KİTAP" +
                        "\nnumarası : "+kitapEkle.get(i).getKitapNo()+"" +
                        "\nismi : " +   kitapEkle.get(i).getKitapAdı()+"" +
                        "\nyazarı : "+kitapEkle.get(i).getKitapYazar()+"" +
                        "\nfiyatı : "+kitapEkle.get(i).getKitapFiyati());

            }else System.out.println("Aradıgınız bilgiye uygun bir kitap bulunamadı.....");




        }

    }

    private static void numaraSil() {

        System.out.println("============NUMARA İLE KİTAP SİLME===========");
        System.out.print("Silmek istediginiz kitabın numarasını giriniz :");
        int arananNumara=scan.nextInt();

        for (int i = 0; i <kitapEkle.size() ; i++) {
            if (kitapEkle.get(i).getKitapNo()==arananNumara){

                kitapEkle.remove(kitapEkle.get(i));
                System.out.println(arananNumara+" numaralı kitap listeden cıkarıldı......");


            }else System.out.println(arananNumara+" numaraya ait bir kitap silinemedi....");




        }


    }

    private static void listele() {
        System.out.println("============ TUM KITAP LISTESI ===========");


        for (int i = 0; i <kitapEkle.size() ; i++) {

   System.out.println("\nnumarası : "+kitapEkle.get(i).getKitapNo()+"" +
                        "\nismi : " +   kitapEkle.get(i).getKitapAdı()+"" +
                        "\nyazarı : "+kitapEkle.get(i).getKitapYazar()+"" +
                        "\nfiyatı : "+kitapEkle.get(i).getKitapFiyati());



        }



    }

    private static void cıkıs() {

       System.out.println("IYI GUNLER.....\nTEKRAR BEKLERİZ....");
    }

    public static void numaraBul() {
        System.out.println("============NUMARA İLE KİTAP BULMA===========");
        System.out.print("Aramak istediginiz kitabın numarasını giriniz :");
       int arananNumara=scan.nextInt();

        for (int i = 0; i <kitapEkle.size() ; i++) {
            if (kitapEkle.get(i).getKitapNo()==arananNumara){

                System.out.println("ARADIGINIZ  KİTAP" +
                        "\nnumarası : "+kitapEkle.get(i).getKitapNo()+"" +
                        "\nismi : " +   kitapEkle.get(i).getKitapAdı()+"" +
                        "\nyazarı : "+kitapEkle.get(i).getKitapYazar()+"" +
                        "\nfiyatı : "+kitapEkle.get(i).getKitapFiyati());

            }else System.out.println(arananNumara+" numaralı kitap bulunamadı...");




        }




    }

   public static void kitapEkle() {
        System.out.println("<<<<<<<<<<<<< KITAP EKLEME >>>>>>>>>>>>");



        while(true) {

            count++;

            System.out.print("Eklemek istediginiz kitabın adı : ");
            scan.nextLine();//dummy hayalet komut
            String ad=scan.nextLine().toUpperCase();


            System.out.print("Eklemek istediginiz kitabın yazarı : ");

            String yazarı=scan.nextLine().toUpperCase();


            System.out.print("Eklemek istediginiz kitabın fiyatı : ");
            String fiyat=scan.nextLine();


            EklenenKitaplar kitap=new EklenenKitaplar(count,ad,yazarı,fiyat);

            kitapEkle.add(kitap);

            System.out.print("Eklemeyi bitirmek icin 0 a basınız \ndevam etmek icin 1 e basınız .....");

            int devam=scan.nextInt();
            if (devam ==0){
                System.out.println("Kitap ekleme bitti.....");
                break;
            }


        }


    }


    public static void menu() {
        System.out.println("---------------------------------");
        System.out.println("              KİTAPCI            ");
        System.out.println("---------------------------------");
        System.out.println("1-kitap ekle" +
                "\n2-numara ile kitap goruntule" +
                "\n3-bilgi ile kitap goruntule" +
                "\n4-numara ile kitap sil" +
                "\n5-tum kitaplari listele" +
                "\n6-cikis");



    }






}
