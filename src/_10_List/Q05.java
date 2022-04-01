package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05 {
   static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */
tekListYap();


    }

    private static void tekListYap() {

        List<Integer> liste=new ArrayList<>();

        for (int i = 0; i <6 ; i++) {
            System.out.print((i+1)+". elemanı giriniz :");
            liste.add(scan.nextInt());
        }

        List<Integer> tekList = new ArrayList<>();

        for (int i = 0; i <liste.size(); i++) {

            if (liste.get(i)%2!=0){

                tekList.add(liste.get(i));
            }

        }
        System.out.println("tek sayılar listesi :"+tekList);


    }


}
