package _09_Arrays;

import java.util.Arrays;

public class Q02 {

    public static void main(String[] args) {


        /* TASK :
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

         */
        int [][] arr={{10,20,30},{4},{6,7,20}};

       İcArrayleriTopla(arr);


    }

    private static int[] İcArrayleriTopla(int[][] arr) {
        int toplam=0;
int [] yeniarr=new int[arr.length];

      for (int i = 0; i <arr.length ; i++) {
            for (int j = 0;j<arr[i].length;j++){
                toplam+=arr[i][j];

            }
            yeniarr[i]=toplam;
            toplam=0;
        }
        System.out.println("yeni arrays = "+Arrays.toString(yeniarr));

        return yeniarr;
    }
}
