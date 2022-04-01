package _09_Arrays;

import java.util.Arrays;

public class Q03 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
        int [] arr={1,2,-3,4,-5,-6};

        arrIsaretDegıstıren(arr);

    }

    private static int[] arrIsaretDegıstıren(int[] arr) {

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] <0){
                arr[i] =arr[i]*-1;
            }else
                arr[i]=arr[i]*-1;
        }
        System.out.println(Arrays.toString(arr));
return arr;
    }


}
