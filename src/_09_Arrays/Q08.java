package _09_Arrays;

import java.util.Arrays;

public class Q08 {

    public static void main(String[] args) {
		
		/*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */


        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        String [] ayırma=str.split(" ");

        System.out.println(Arrays.toString(ayırma));
        int toplam1=0;
        int toplam2=0;


        for (int i = 0; i < ayırma.length ; i++) {

            if (ayırma[i].contains("$")){

                toplam1+=Integer.parseInt(ayırma[i].replace("$",""));


            }else if (ayırma[i].contains("£")){

                toplam2+=Integer.parseInt(ayırma[i].replace("£",""));


            }



        }
        System.out.println("tum $ isaretli olan elemanların toplamı  "+toplam1);
        System.out.println("tum £ isaretli olan elemanların toplamı  "+toplam2);

    }
}


