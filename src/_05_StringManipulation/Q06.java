package _05_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("lUTFEN BİR email GİRİNİZ");

        String str=scan.nextLine();


        if (!str.contains("@")){
            System.out.println("geçerli bir email giriniz");
        }else {
            if (str.endsWith("@gmail.com")){
                System.out.println("email onaylandı");

            }else if (!str.endsWith("@gmail.com")){
                System.out.println(str.replaceAll(str.substring(str.indexOf("@") + 1, str.indexOf(".")), "gmail"));


            }


        }

    }
}
