package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {




        /* TASK :
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.

        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!

        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.

        5. final notu double değerinde olmalı. (örn: 65,5)

        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.

        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.

        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.



                                        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
                                                                        80(80dahil)   ile 90 arasında ise  BA,
                                                                        70(70 dahil)   ile 80 arasında ise BB,
                                                                        60(60dahil) ile 70 arasında ise CB,
                                                                        50(50 dahil) ile 60 arasında ise CC,
                                                                     40(40 dahil) ile 50 arasında ise DC,
                                                                     30(30 dahil) ile 40 arasında ise DD,
                                                                     30 'dan düşük ise FF            gelmeli.
         */
        double vizeNot, vizeYuzde, finNot, finYuzde, ortalama;
        Scanner scan = new Scanner(System.in);
        System.out.println("Vize sınav sonucunuzu giriniz :");
        vizeNot= scan.nextDouble();
        System.out.println("Vize sınavı yüzdesini giriniz");
        vizeYuzde= scan.nextDouble();
        double ort1 = (vizeNot * (vizeYuzde/100) );
        System.out.println("Vize sinav yuzdeniz:" +ort1);
        System.out.println("Final sınav sonucunuzu giriniz");
        finNot = scan.nextDouble();
        System.out.println("Final sınavı yüzdesini giriniz");
        finYuzde= scan.nextDouble();
        double ort2 = (finNot * (finYuzde/100) );
        System.out.println("Final sinav yuzdeniz:" +ort2);
        System.out.println("Not ortalamaniz:" + (ort1+ort2)  );




        if ((ort1+ort2)>=90){
            System.out.println("AA");
        } else if ((ort1+ort2)>=80 && (ort1+ort2)<=90 ){
            System.out.println("BA");
        } else if ((ort1+ort2)>=70 && (ort1+ort2)<=80 ){
            System.out.println("BB");
        } else if ((ort1+ort2)>=60 && (ort1+ort2)<=70 ){
            System.out.println("CB");
        } else if ((ort1+ort2)>=50 && (ort1+ort2)<=60 ){
            System.out.println("CC");
        }else if ((ort1+ort2)>=40 && (ort1+ort2)<=50 ){
            System.out.println("DC");
        }else if ((ort1+ort2)>=30 && (ort1+ort2)<=40 ){
            System.out.println("DD");
        }else if ((ort1+ort2)<=30) {
            System.out.println("FF");
        }
    }
}
