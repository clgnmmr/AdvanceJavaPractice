package Projects.P04_okulYönetimi.ogrcOgrtYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrncListesi = new ArrayList<>();
    static List<Ogrenci> ogrenci = new ArrayList<>();
    static ArrayList<Kisi> ogrtmListesi = new ArrayList<>();
    static List<Ogretmen> ogretmen=new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli() {
        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");
        String secim = scan.next().toUpperCase();
        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;

            case "Q":
                cıkıs();
                break;
            default:
                System.out.println("hatalı giriş yaptınız  :(");
                girisPaneli();//recursive method call
                break;


        }


    }

    private static void cıkıs() {

        System.out.println("agam eline sağlık yine bekleriz selametle   :)");
    }

    public static void islemMenusu() {
        System.out.println("Sectiginiz  Kişi turu: " + kisiTuru + " icin  aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LİSTELEME\r\n"
                + "     4-SİLME\r\n"
                + "     0-ANA MENU");

        System.out.print("islem tercihinizi giriniz : ");
        int secilenIslem = scan.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                ara();
                islemMenusu();
                break;
            case 3:
                listele();
                islemMenusu();
                break;
            case 4:
                sil();
                islemMenusu();
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("adam bir şey girrr :( ");
                islemMenusu();

                break;
        }

    }

    private static void sil() {
        System.out.println("   ***   " + kisiTuru + " icin silme sayfası   ***");
        System.out.print("Silmek istediginiz "+ kisiTuru+"'nin kimlik nummarasını giriniz : ");
        String arananNumara=scan.next();

        if (kisiTuru.equals("OGRENCI")) {

            for (int i = 0; i <ogrncListesi.size() ; i++) {
                if (ogrncListesi.get(i).getKimlikNo().contains(arananNumara)) {

                   ogrncListesi.remove(ogrncListesi.get(i));
                    System.out.println("Silindi...");
                }
            }



        }else  {


            for (int i = 0; i < ogrtmListesi.size(); i++) {
                if (ogrtmListesi.get(i).getKimlikNo().contains(arananNumara)) {

                    ogrtmListesi.remove(ogrtmListesi.get(i));
                    System.out.println("Silindi...");

                }
            }
        }


    }


    private static void listele() {
        System.out.println("   ***   " + kisiTuru + " icin listeleme sayfası   ***");
        if (kisiTuru.equals("OGRENCI")) {
            for (int i = 0; i <ogrncListesi.size() ; i++) {
                ogrenci.add((Ogrenci) ogrncListesi.get(i));// ogrenci clasında actıgmız listeye kisi clasındanki listeyi ekledik

                System.out.println(" Ogrencinin ismi-soyismi : "+ogrncListesi.get(i).getAdSoyad()+
                        " \n kimligi :"+ogrncListesi.get(i).getKimlikNo()+"" +
                        "\n yası : "+ogrncListesi.get(i).getYas()+"" +
                        "\n ogrenci no : "+ogrenci.get(i).getOgrcNo()+// eklenen liste sayesinde ogrenci classında olan vaiable getirebildik.
                        "\n sınıf : "+ogrenci.get(i).getSınıf());

            }

        }else {
            for (int i = 0; i < ogrtmListesi.size(); i++) {

                    ogretmen.add((Ogretmen) ogrtmListesi.get(i));// ogretmen clasında actıgmız listeye kisi clasındanki listeyi ekledik

                    System.out.println(" Ogretmen ismi-soyismi : "+ogrtmListesi.get(i).getAdSoyad()+
                            " \n kimligi :"+ogrtmListesi.get(i).getKimlikNo()+"" +
                            "\n yası : "+ogrtmListesi.get(i).getYas()+"" +
                            "\n sicil no : "+ogretmen.get(i).getSicilNo()+// eklenen liste sayesinde ogretmen classında olan vaiable getirebildik.
                            "\n bolumu : "+ogretmen.get(i).getBolum());

            }
        }
    }

    private static void ara() {
        System.out.println("   ***   " + kisiTuru + " icin arama sayfası   ***");
        System.out.print("Aramak istediginiz Ogrenci'nin kimlik nummarasını giriniz : ");
        scan.nextLine();//dummy hayalet komut
        String arananNumara = scan.nextLine();


        if (kisiTuru.equals("OGRENCI")) {
            for (int i = 0; i < ogrncListesi.size(); i++) {

                ogrenci.add((Ogrenci) ogrncListesi.get(i));

            }

            for (int i = 0; i < ogrncListesi.size(); i++) {

                if (ogrncListesi.get(i).getKimlikNo().equals(arananNumara)) {


                    System.out.println(" Ogrencinin ismi-soyismi : " + ogrncListesi.get(i).getAdSoyad() +
                            " \n kimlik numarası :" + ogrncListesi.get(i).getKimlikNo() + "" +
                            "\n yası : " + ogrncListesi.get(i).getYas() + "" +
                            "\n ogrenci no : " + ogrenci.get(i).getOgrcNo() +// eklenen liste sayesinde ogrenci classında olan vaiable getirebildik.
                            "\n sınıf : " + ogrenci.get(i).getSınıf());


                }
            }


        } else if (kisiTuru.equals("OGRETMEN")) {
            for (int i = 0; i < ogrtmListesi.size(); i++) {

                ogretmen.add((Ogretmen) ogrtmListesi.get(i));// ogretmen clasında actıgmız listeye kisi clasındanki listeyi ekledik


            }

            for (int i = 0; i < ogrtmListesi.size(); i++) {
                if (ogrtmListesi.get(i).getKimlikNo().equals(arananNumara)) {

                    System.out.println(" Ogretmen ismi-soyismi : " + ogrtmListesi.get(i).getAdSoyad() +
                            " \n kimligi :" + ogrtmListesi.get(i).getKimlikNo() + "" +
                            "\n yası : " + ogrtmListesi.get(i).getYas() + "" +
                            "\n bolumu :" + ogretmen.get(i).getBolum() +// eklenen liste sayesinde ogretmen classında olan vaiable getirebildik.
                            "\n sicil no :  " + ogretmen.get(i).getSicilNo());

                }
            }


        }
    }

    private static void ekle() {
        System.out.println("   ***   " + kisiTuru + " icin  ekleme sayfası   ***");
        System.out.print("ad soyad giriniz : ");
        scan.nextLine();//dummy hayalet komut

        String adSoyad = scan.nextLine();
        System.out.print("kimlik No giriniz : ");

        String kimlikNo = scan.next();
        System.out.print("yas giriniz : ");
        int yas = scan.nextInt();
        if (kisiTuru.equals("OGRENCI")) {

            System.out.print("ogrenci No giriniz : ");
            scan.nextLine();//dummy hayalet komut
            String ogrcNo = scan.next();

            System.out.print("sınıf giriniz : ");
            String sınıf = scan.next();
            Ogrenci sefilOgrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrcNo, sınıf);//p'li cons ogrc obj create edildi
            ogrncListesi.add(sefilOgrenci);

        } else {


            System.out.print("bolum giriniz : ");
            scan.nextLine();//dummy hayalet komut
            String bolum = scan.next().toUpperCase();

            System.out.print("sicil No giriniz : ");
            String sicilNo = scan.next();
            Ogretmen muhtesemOgretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum,sicilNo);//p'li cons ogrtm obj create edildi
            ogrtmListesi.add(muhtesemOgretmen);
        }
    }
}

