package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen bir string giriniz :");
        String cumle= scan.nextLine();

        System.out.println( longWord(cumle));



    }

         private static String longWord(String cumle) {

        cumle=cumle.trim().replaceAll("\\p{Punct}","");

       String [] arr=cumle.split(" ");

             System.out.println(Arrays.toString(arr));


         String uzunOlanKelime="";
         int uzunluk=0;

             for (int i = 0; i <arr.length ; i++) {
                 if (arr[i].length()>uzunluk){

                     uzunluk=arr[i].length();
                     uzunOlanKelime=arr[i];

                 }

                 }


        return uzunOlanKelime;
    }
}
