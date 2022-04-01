package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
	Scanner scan=new Scanner(System.in);
		System.out.println("lutfen yasinizi giriniz");
		int yas=scan.nextInt();

		System.out.println("lutfen kilonuzu giriniz");
		int kilo=scan.nextInt();

		if (yas>18 && kilo>50){
			System.out.println("Kan bagisi yapabilir");
		}else if (yas>18 && kilo<=50){
			System.out.println("Kan bagisi yapamaz");
		}else if (yas>0 && yas<18){
			System.out.println("Kan bagisi yapamaz");
		}else {
			System.out.println("Gecerli ölculer giriniz");
		}


	}

}
