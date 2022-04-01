package _03_IfStatement_TernaryOperator;
import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/
    
    public static void main(String[] args) {
        

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen 1. numarayı giriniz");

        int num1=scan.nextInt();
        System.out.println("lütfen 2. numara giriniz");
        int num2=scan.nextInt();
        System.out.println("lütfen 3. numara giriniz");
        int num3=scan.nextInt();

        if ((num1>num2 && num1>num3) && (num2>num3)){

            System.out.println("en büyük numara :" +num1+ "\n en küçük numara :"+num3);

        }else if ((num1>num2 && num1>num3) && (num3>num2)){

            System.out.println("en büyük numara :" +num1+"\n en küçük numara :"+num2);


        }else if ((num2>num1 && num2>num3) && (num1>num3)){

            System.out.println("en büyük numara :" +num2+"\n en küçük numara :"+num3);


        }else if ((num2>num1 && num2>num3) && (num3>num1)) {

            System.out.println("en büyük numara :" +num2 + "\n en küçük numara :"+ num1);

        }else if ((num3>num1 && num3>num2) && (num1>num2)){

            System.out.println("en büyük numara :" +num3+"\n en küçük numara :"+num2);

        }else if ((num3>num1 && num3>num2) && (num2>num1)){
        System.out.println("en büyük numara :" +num3+"\n en küçük numara :"+num1);

        }

    }
}

