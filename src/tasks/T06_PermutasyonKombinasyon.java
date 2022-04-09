package tasks;

import java.util.Scanner;

public class T06_PermutasyonKombinasyon {
    /*  Problem Tanımı
            Verilen iki sayının kombinasyonunu bulan kodu yazınız.
            Hatırlatma C(n,r) = n! / (r!(n-r)!)

            Verilen iki sayının permütasyonunu bulan kodu yazınız.
            Hatırlatma P(n,r) = n! / (n-r)!

            Ekran Çıktısı
            Birinci sayıyı giriniz: 15
            Ikinci sayıyı giriniz: 4
            Kombinasyon: 1365
            permütasyon: 32760

            Birinci sayıyı giriniz: 5
            Ikinci sayıyı giriniz: 3
            Kombinasyon: 10
            permütasyon: 60
          */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("kombinasyonunu ve permutasyonun bulmak istediginiz 1. sayiyi giriniz :");
        double s1=scan.nextInt();
        System.out.print("kombinasyonunu ve permutasyonun bulmak istediginiz 2. sayiyi giriniz :");
       double s2=scan.nextInt();


        System.out.println("Kombinasyon :"+kombinasyonBul(s1, s2));
        System.out.println("Permutasyon :"+permutasyonBul(s1, s2));


    }

   protected static  double permutasyonBul( double c,  double d) {
        double permutasyon=0;
        if (c>=d){
            permutasyon=faktoriyel(c)/(faktoriyel(c-d));
        }else if (d>c){
            permutasyon=faktoriyel(d)/(faktoriyel(d-c));
        }
        return permutasyon;

    }



    private static double kombinasyonBul(double a, double b) {
        double kombinasyon=0;
        if (a>=b){
            kombinasyon=faktoriyel(a)/(faktoriyel(b)*(faktoriyel(a-b)));
        }else  if (b>a){
            kombinasyon=faktoriyel(b)/(faktoriyel(a)*(faktoriyel(b-a)));
        }
        return kombinasyon;
    }


    private static double faktoriyel(double x) {
        double faktoriyel=1;
        for (int i = 2; i <=x ; i++) {
            faktoriyel*=i;

        }
        return faktoriyel;
    }
}
