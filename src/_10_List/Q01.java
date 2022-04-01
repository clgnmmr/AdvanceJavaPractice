package _10_List;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        List<String> list1 = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));

        for (int i = 0; i < list1.size(); i++) {

            if (list1.get(i).contains("A")) {

                list1.remove(i);

                if (list1.get(i).contains("a")) {
                    list1.remove(i);
                }

            }



        } System.out.println(list1);

        // 2. cözüm

        List<String> list2 = new ArrayList<>();

        for (String w:list1){

            if (!w.toLowerCase().contains("a")){
                list2.add(w);

            }

        }
        System.out.println(list2);




    }
}
