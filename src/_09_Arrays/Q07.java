package _09_Arrays;

import java.util.Arrays;

public class Q07 {

    public static void main(String[] args) {
        /* TASK :
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 80
         */

        int [][] ınput = {{1,25,-3},{125,55},{-61,-17,65}};

        maxDegeriBulan(ınput);
        System.out.println("girilen array in max elemanı = "+  maxDegeriBul(ınput));

    }

    private static int  maxDegeriBul(int[][] ınput) {
        int max=0;

        for (int i = 0; i <ınput.length ; i++) {
            for (int j = 0; j <ınput[i].length; j++) {
                    if (ınput[i][j]>max ){
                        max=ınput[i][j];
                    }

            }

        }


      return max;

    }

    private static void maxDegeriBulan(int[][] ınput) {

        Arrays.sort(ınput[0]);
        Arrays.sort(ınput[1]);
        Arrays.sort(ınput[2]);

        int ilkBuyuk=ınput[0][ınput[0].length-1];
        int ikinciBuyuk=ınput[1][ınput[1].length-1];
        int ucuncuBuyuk=ınput[2][ınput[2].length-1];

        if (ilkBuyuk>ikinciBuyuk       &&     ilkBuyuk>ucuncuBuyuk){

            System.out.println("max değer ="+ilkBuyuk);

        }else if (ikinciBuyuk>ilkBuyuk  &&  ikinciBuyuk>ucuncuBuyuk){

            System.out.println("max değer ="+ikinciBuyuk);

        }else if (ucuncuBuyuk>ilkBuyuk  &&  ucuncuBuyuk>ikinciBuyuk){

            System.out.println("max değer ="+ucuncuBuyuk);


        }
    }
}
