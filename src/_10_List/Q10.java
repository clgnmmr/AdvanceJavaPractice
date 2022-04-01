package _10_List;

import java.util.ArrayList;
import java.util.Arrays;

public class Q10 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {

          ArrayList<Integer> list=new ArrayList<>(Arrays.asList(3, 5, 1, 2, 7, 9, 2, 3, 5, 7 ));
             ArrayList<Integer> list1=new ArrayList<>();
               int sayac=0;
              int sayılacakSayılarAdedi=1;

               while (list.size()-sayılacakSayılarAdedi>=sayac){
              int toplam=0;
                   for (int i = 0; i <=sayac ; i++) {
                toplam+=list.get(sayılacakSayılarAdedi-1+i);

                 }
                 sayac++;
                 sayılacakSayılarAdedi+=sayac;
                 list1.add(toplam);


              }
           System.out.println(list1);





    }

}

