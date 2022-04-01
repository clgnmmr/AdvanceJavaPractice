package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter02 {

    public static void main(String[] args) {
        /*
        TASK :
         Kullanicidan bir character girmesini isteyiniz
         Character harf ise kucuk harf olup olmadigini kontrol ediniz
         Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
         Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
         Harf degilse ekrana "Harf degil" yazdiriniz
        97:a  122:z ascii değeri
         */

Scanner scan=new Scanner(System.in);
        System.out.print("lutfen bir karekter giriniz :");

       char character=scan.next().charAt(0);


        String result=(character >='a' && character<='z')?("Kucuk harf"):
                (character>='A' && character<='Z'?("Buyuk harf"):("Harf degil")) ;

        System.out.println(result);
    }
}
