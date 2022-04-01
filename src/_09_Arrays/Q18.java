package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=2, v=1, o=2, f=1, l=2, J=1, i=2}
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz ");
        String str= scan.nextLine();

        String harfler="";




        String sayı="";

        for (int i = 0; i <str.length(); i++) {

            if (!harfler.contains(str.substring(i,i+1))){

                harfler+=str.substring(i,i+1);

            }

        }


        int sayac=0;

        for (int i = 0; i <harfler.length(); i++) {

            for (int j = 0; j < str.length(); j++) {

                if (harfler.charAt(i)==str.charAt(j)){
                    sayac++;

                }
            }
            sayı=sayı.concat(""+sayac);
            sayac=0;

        }



        String arr[]=new String[harfler.length()];

        for (int i = 0; i <arr.length ; i++) {

            arr[i]=harfler.substring(i,i+1)+"="+sayı.substring(i,i+1);

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



    }
}
    

