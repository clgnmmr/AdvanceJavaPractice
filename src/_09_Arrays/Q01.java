package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {

	/* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.

	 */
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {




		System.out.print("lutfen bir array uzunlugu giriniz :");
		int [] sayi=new int[scan.nextInt()];

		arrayEkleyenVeDegerlendiren(sayi);

	}
	private static int arrayEkleyenVeDegerlendiren(int[] sayi) {


		for (int i = 0; i <sayi.length ; i++) {
			System.out.print("lutfen   "+(i+1)+" degeri giriniz :" );
			sayi[i]= scan.nextInt();
		}
		System.out.println("girdiginiz array = "+Arrays.toString(sayi));

		Arrays.sort(sayi);

		int enBuyukDeger=sayi[sayi.length-1];
		int enKucukDeger=sayi[0];

		int fark=enBuyukDeger-enKucukDeger;

		System.out.println("girdiginiz değerlerin en büyük ve en kucuk sayıların farkı ="+fark);


		return fark;
	}

}
