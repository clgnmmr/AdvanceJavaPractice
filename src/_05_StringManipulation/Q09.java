package _05_StringManipulation;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */

        String str="esra";

        int uzunluk=str.length();


        String ilkYarı=str.substring(0,uzunluk/2);

        if (uzunluk%2==0){

            System.out.println(ilkYarı);
        }else System.out.println("girdiginiz string çift uzunlukta değildir");


    }
}
