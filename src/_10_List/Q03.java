package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
          Scanner scan=new Scanner(System.in);
        System.out.print("list uzunluu giriniz :");

        int uzunluk= scan.nextInt();

        List<Integer> list = new ArrayList<>();


        for (int i = 0; i<uzunluk; i++){

            System.out.print((i+1)+". elemanı giriniz : ");

            list.add(scan.nextInt());


        }

        int toplam=0;

        for (int i = 0; i < list.size() ; i++) {

            toplam += list.get(i)*list.get(i);
        }
        System.out.println("girdiginiz degerlerin kareleri toplamı :"+toplam);

    }
}
