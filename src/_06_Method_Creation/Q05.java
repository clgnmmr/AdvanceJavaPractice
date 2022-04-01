package _06_Method_Creation;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
         /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */

Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String name1=scan.nextLine();

        kacKelimeOldugunuBul(name1);

    }

    private static void kacKelimeOldugunuBul(String name1) {

        int sayac=0;

        for (int i = 0; i <name1.length() ; i++) {
            if (name1.charAt(i) == ' '){
                sayac++;

            }


        }
        System.out.println("bulunan kelime adedi ="+(sayac+1));

        }





}
