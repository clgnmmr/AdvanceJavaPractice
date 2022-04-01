package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	/*
	 * TASK :

	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapan code create ediniz.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("lütfen aldıgınız urun adediniz giriniz");

		int urunAdeti= scan.nextInt();

		System.out.println("lutfen aldıgınız urunun liste fiyatını giriniz");

		double urunfiyat=scan.nextDouble();

		System.out.println("bir musteri kartınız varsa v yazınız \n yoksa y yazınız");

		char kart=scan.next().charAt(0);

		if (kart=='v' && urunAdeti>10){
			System.out.println("aldıgınız ındırım sonucu ödemeniz gereken :"+((urunfiyat*urunAdeti)*80/100));


		}else if (kart=='y' && urunAdeti>10){
			System.out.println("musteri kartınız olmadıgı ıcın aldıgınız ındırım sonucu ödemeniz gereken :"+((urunfiyat*urunAdeti)*85/100));
		}else if (kart=='y' && urunAdeti<=10) {
			System.out.println("musteri kartınız olmadıgı ıcın aldıgınız ındırım sonucu ödemeniz gereken :" + ((urunfiyat * urunAdeti) * 90 / 100));
		}

	}

}
