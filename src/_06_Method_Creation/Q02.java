package _06_Method_Creation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluşturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
       Scanner scan=new Scanner(System.in);
        System.out.println("1.stringi giriniz");

       String name1=scan.next();
        System.out.println("2.stringi giriniz");

        String name2=scan.next();

        ikiyeBolen(name1, name2);





    }

    private static void ikiyeBolen(String name1, String name2) {

        int name1Uzunluk=name1.length();

        if (name1Uzunluk%2==0){

            System.out.println(name1.substring(0, name1Uzunluk / 2) + name2 + name1.substring(name1Uzunluk / 2, name1Uzunluk));

        }else System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");


    }


}
