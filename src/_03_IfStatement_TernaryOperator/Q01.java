package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */

		Scanner scan = new Scanner(System.in);//kullanıcıdan impot almak icin scanner obj create ettik
		System.out.println("toplama icin 1\ncıkarma icin 2\nbolme icin 3\ncarpma icin 4 ");
		//kullanıcıya secim icin islemmenüsü
		 int  islem=scan.nextInt();

		System.out.println("lütfen iki tam sayı giriniz :");//kullanıcıya bildirimde bullunuldu



		double num1= scan.nextDouble();//1 sayı assing edildi
		double num2= scan.nextDouble();//2 sayı assing edildi

		if (islem==1){
			System.out.println("toplama işleminin sonucu:" +num1+" + "+ num2+" = "+(num1+num2) );


		}else if (islem==2){
			System.out.println("cıkarma işleminin sonucu:" +num1+" - "+ num2+" = "+(num1-num2) );


		}else if (islem==3){
			System.out.println("bolme işleminin sonucu:" +num1+" / "+ num2+" = "+(num1/num2) );


		}else if (islem==4){
			System.out.println("carpma işleminin sonucu:" +num1+" * "+ num2+" = "+(num1*num2) );


		}else {
			System.out.println("lütfen gecerli sayılar giriniz");
		}

	}

}
