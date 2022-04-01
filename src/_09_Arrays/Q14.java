package _09_Arrays;

import java.util.Arrays;
import java.util.List;

public class Q14 {

    public static void main(String[] args) {
        /*  TASK :
         * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

         */

        String str="Congratulations";
        str=str.replace("a","i");
        str=str.replace("o","i");
        str=str.replace("u","i");


        String [] arr=str.split("");
        System.out.println(Arrays.toString(arr));
        String [] arr1=new String[arr.length];


        for (int i = 0; i <arr.length ; i++) {

            arr1[i] = arr[arr.length-1-i];



        }


        System.out.println(Arrays.toString(arr1));





    }

}
