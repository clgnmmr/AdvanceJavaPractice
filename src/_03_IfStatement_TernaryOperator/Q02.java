package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
	/*  TASK :
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

	    INFO :
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 pozitif tamsayi giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();
		if ((sayi1 + sayi2) > sayi3 && sayi3 > (sayi1 - sayi2) ||
				(sayi1 + sayi3) > sayi2 && sayi2 > (sayi1 - sayi3) ||
				(sayi2 + sayi3) > sayi1 && sayi1 > (sayi2 - sayi3)) {
			System.out.println("Ucgen");
			if ( sayi1==sayi2 && sayi2==sayi3 ){
				System.out.println("eskenar ucgen");
			}
		} else {
			System.out.println("Hatali giris yaptiniz");
		}

		

	}

}
