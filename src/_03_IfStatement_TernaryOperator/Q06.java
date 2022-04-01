package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.


        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen bir x kordinatini yaziniz");

        int x=scan.nextInt();

        System.out.println("lutfen bir y kordinatını giriniz");
        int y=scan.nextInt();

        if (x>0&&y>0){
            System.out.println("girdiginiz degerler 1. bölgededir");

        }else if (x<0&&y>0){
            System.out.println("girdiginiz degerler 2.bolgededir");
        }else if (x<0&&y<0){
            System.out.println("girdiginiz degerler 3.bolgededir");
        }else if (x>0&&y<0){
            System.out.println("girdiginiz degerler 4.bolgededir");
        }else if (x!=0&&y==0){
            System.out.println("girdiginiz degerler x ekseni uzerinde");
        }else if (x==0&&y!=0){
            System.out.println("girdiginiz degerler y ekseni uzerinde");
        }else System.out.println("orjindesin");








    }
}
