package _09_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_Proje1 {
    /*
 * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
 * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
 * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
 * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
 *
 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
 * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
 * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
 * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
 * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
 *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
 *            ortalama kazançtan yüksekse o günleri return yap.
 * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
 *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
 *            ortalama kazançtan aşağıysa o günleri return yap.
 *
 * */
    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {

        List<String> gunler=new ArrayList<>();
        gunler.add("PAZARTESI");
        gunler.add("SALI");
        gunler.add("CARSAMBA");
        gunler.add("PERSEMBE");
        gunler.add("CUMA");
        gunler.add("CUMARTES");
        gunler.add("PAZAR");

        List<Integer> gunlukKazanclar=new ArrayList<>();

        int sayac = 0;

        while (sayac != 7) {
            System.out.print("lutfen "+gunler.get(sayac) + " gunu  kazancınızı giriniz  : ");
            gunlukKazanclar.add(scan.nextInt());
            sayac++;
        }

        getOrtalamaKazanc(gunlukKazanclar);

        getOrtalamaninUstundeKazancGünleri(gunlukKazanclar,gunler);

        getOrtalamaninAltindaKazancGünleri(gunlukKazanclar,gunler);

        System.out.println("Haftalik ortalama kazanc : " + " $" + getOrtalamaKazanc(gunlukKazanclar));
        System.out.println("Kazancin ortalamanin ustunde oldugu gunler : " + getOrtalamaninUstundeKazancGünleri(gunlukKazanclar,gunler));
        System.out.println("Kazancin ortalamanin altinda oldugu gunler : " + getOrtalamaninAltindaKazancGünleri(gunlukKazanclar,gunler));




    }



    private static String getOrtalamaninAltindaKazancGünleri(List<Integer> gunlukKazanclar, List<String> gunler) {


        String ortalamaninAltındakiKazancGünleri="";
        for (int i = 0; i < gunlukKazanclar.size() ; i++) {

            if (gunlukKazanclar.get(i)<getOrtalamaKazanc(gunlukKazanclar)){

                ortalamaninAltındakiKazancGünleri+=gunler.get(i)+" ";
            }

        }



        return ortalamaninAltındakiKazancGünleri;

    }





    private static String getOrtalamaninUstundeKazancGünleri(List<Integer> gunlukKazanclar,List<String> gunler) {
String ortalamaninUstundeKazancGünleri="";
        for (int i = 0; i < gunlukKazanclar.size() ; i++) {

            if (gunlukKazanclar.get(i)>getOrtalamaKazanc(gunlukKazanclar)){

                ortalamaninUstundeKazancGünleri+=gunler.get(i)+" ";
            }

        }




      return ortalamaninUstundeKazancGünleri;
    }





    private static int getOrtalamaKazanc(List<Integer> gunlukKazanclar) {

     int toplam=0;

     for (int i = 0; i < gunlukKazanclar.size() ; i++) {
            toplam+= gunlukKazanclar.get(i);

        }



     return toplam/ gunlukKazanclar.size();
    }



}
