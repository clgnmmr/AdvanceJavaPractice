package _10_List;

import java.util.Arrays;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */
        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen bir String giriniz");
        String str[]= scan.nextLine().split("");

        String enCokTekrarEden="";
        int maxSayac=0;
        int sayac=0;

        for (int i=0; i<str.length; i++){
            for (int j=i+1; j<str.length; j++){

                if (str[i].equalsIgnoreCase(str[j])){
                    sayac++;

                }
            }
            if(sayac>maxSayac){
                maxSayac=sayac;
                enCokTekrarEden=str[i];
            }else if(sayac==maxSayac){
                enCokTekrarEden+=","+str[i];

            }
                 sayac=0;
        }
        System.out.println(enCokTekrarEden);





    }
}

