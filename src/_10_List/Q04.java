package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
        Scanner scan=new Scanner(System.in);

        System.out.print("hocam girmek istediiniz notların adediniz giriniz :");

        int adet=scan.nextInt();

        List<Integer> notuListesi=new ArrayList<>();

int toplam=0;
        for (int i = 0; i <adet ; i++) {
            System.out.print((i+1)+". ogrencinin notunu giriniz :");
            notuListesi.add(scan.nextInt() );
            toplam+=notuListesi.get(i);
        }
        System.out.println("sınıf ortalaması ="+(toplam/adet));
        int sayac=0;

        for (int i = 0; i < notuListesi.size() ; i++) {

            if (notuListesi.get(i)>toplam/adet){
                sayac++;


            }

        }
        System.out.println("dersi gecen ögrenci sayısı = "+sayac);



    }
}
