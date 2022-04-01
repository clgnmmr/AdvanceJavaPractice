package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q06 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

int [] arr={1,2,2,3,1,4,2,5,6,8,7,5,9,1};


List<Integer> list1=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            if (!list1.contains(arr[i])) {
                list1.add(arr[i]);

            }

        }
        Collections.sort(list1);
        System.out.println(list1);

        //2. cozüm

        for (int s:arr){

            if (!list1.contains(s)){
                list1.add(s);
            }

        }
        Collections.sort(list1);
        int tekrrasızArr[]=new int[list1.size()];

        for (int i=0 ; i<list1.size() ; i++){

            tekrrasızArr[i]= list1.get(i);

        }
        System.out.println(Arrays.toString(tekrrasızArr));



    }

}
