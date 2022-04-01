package _03c_IfStatement_TernaryOperator;

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


        Scanner scan =new Scanner(System.in);

        System.out.print("vizeden aldiginiz sonucu yazınız :");
        double vizeNot=scan.nextDouble();

        System.out.print("Vize sınavı yüzdesini giriniz :");
        double vizeYuzdesi=scan.nextDouble()/100;



        System.out.print("Finalden aldiginiz sonucu yazınız :");
        double finalNot=scan.nextDouble();

        System.out.print("Final sınavı yüzdesini giriniz :");
        double finalYuzdesi=scan.nextDouble()/100;



        double ortalamanız=(vizeNot*vizeYuzdesi)+(finalNot*finalYuzdesi);

        System.out.println("ortalamanız :"+ortalamanız);

        if (vizeNot<0 || finalNot<0 ) {//eksi deger girme kontrolu

            System.out.println("bos kagıt versen 0 alırdın neyin kafasısana - not aldırdı ");



        }else if (vizeNot<=100 && finalNot<=100){



            if (ortalamanız>=90){
             System.out.println("agam tebrikler kim kopya verdiyse gayet basarılı  : AA");

            }else if (ortalamanız<90 && ortalamanız>=80){
                System.out.println("gayet basarılı : BA");

            }else if (ortalamanız<80 && ortalamanız>=70){
                System.out.println("gayet basarılı : BB");

            }else if (ortalamanız<70 && ortalamanız>=60){
                System.out.println("gayet basarılı : CB");

            }else if (ortalamanız<60 && ortalamanız>=50){
                System.out.println("gayet basarılı  : CC");

            }else if (ortalamanız<50 && ortalamanız>=40){
                System.out.println("gayet basarılı : DC");

            }else if (ortalamanız<40 && ortalamanız>=30){
                System.out.println("gayet basarılı : DD ");

            }else if (ortalamanız<30) {
                System.out.println("gayet basarılı FF");


            }else System.out.println("agam malesef hiçmi kopya veren olmadı caktın : FF");



        }else System.out.println("girdiginiz notlar hatalı tekrar deneyiniz");
    }
}
