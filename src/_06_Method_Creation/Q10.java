package _06_Method_Creation;

import java.util.Scanner;



public class Q10 {

    /*
         TASK :
        powerOfThree isminde bir Parametre olarak int Return tipi boolean method create edin.
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını kontrol edin. 3'ün üssü(kuvveti) ise true, değilse false return edin.
        Örnek 1:
        input: 27
        output: true

        Örnek 2:
        Girdi: 0
        Çıktı: false

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayı giriniz");
        int sayi=scan.nextInt();

        System.out.println(powerOfThree(sayi));


    }
public static boolean powerOfThree(int sayi){
        boolean kuvvetiMi=false;
        int carpma=1;

    for (int i = 1; i <sayi ; i++) {
        carpma*=3;
        if (carpma==sayi){
            kuvvetiMi=true;
       break;
        }


    }




        return kuvvetiMi;
}


}
