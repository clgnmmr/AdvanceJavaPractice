package _06_Method_Creation;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

		/* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */

Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime=scan.next();

         ılkIkisiz(kelime);//method kol






    }

    private static String ılkIkisiz(String kelime) {
        String kalanHarf="";

        if(kelime.startsWith("gh")){
            kalanHarf=kelime;

        }else if(kelime.startsWith("g")){

            kalanHarf=kelime.charAt(0)+kelime.substring(2);
        }else if(kelime.charAt(1)=='h'){

            kalanHarf=kelime.substring(1);

        }else {

            kalanHarf=kelime.substring(2);
        }
        System.out.println(kalanHarf);
return kalanHarf;
    }


}

