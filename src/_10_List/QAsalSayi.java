package _10_List;

import java.util.ArrayList;
import java.util.List;

public class QAsalSayi {

    /* TASK :
    100 den kucuk asal sayilari yazdiran bir code create ediniz.
     */
    public static void main(String[] args) {
        ArrayList<Integer> asalsayılarList = new ArrayList<Integer>();

        int sayi=2;
int sayac=0;

while (sayi<100){

    for (int i = 2; i <100 ; i++) {

        if (sayi%i==0){
            sayac++;
        }

    }
    if (sayac==1){
        asalsayılarList.add(sayi);

    }
    sayi++;
    sayac=0;


}
        System.out.println(asalsayılarList);
        System.out.println("100 den kucuk asal sayılar");



    }
}
