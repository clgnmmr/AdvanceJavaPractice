package tasks;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen biir sayi giriniz :");
        int sayi=scan.nextInt();

        powesofTwo(sayi);


    }

    private static void powesofTwo(int sayi) {

        while (sayi>2){

            if (sayi%2!=0){
                break;
            }else {
                sayi=sayi/2;
            }

        }
        if (sayi%2==0){
            System.out.println("2 nin kuvvetidir");
        }else {
            System.out.println("2 nin kuvveti degildir");
        }








    }
}

