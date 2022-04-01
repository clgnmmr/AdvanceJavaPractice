package _06a_Method_Creation;

import java.util.Scanner;

public class AsalCarpan {
	static 	int bolen=0;
	static boolean isAsal=false;

	public static void main(String[] args) {
		/* TASK :
		 * Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir
		 * METHOD create ediniz.
		 * 
		 * Ör: Input : 50 
		 *     Bolenler : 2,5,10,20,50
		 *     Asal Bolenler: 2,5 
		 *     En buyuk asal carpan: 5
		 */
      Scanner scan=new Scanner(System.in);

		System.out.print("sayı giriniz : ");
		int sayi=scan.nextInt();

		asalCarpan(sayi);


	}

	private static void asalCarpan(int sayi) {
int asalBolen=0;
		for (int i = 2; i <=sayi ; i++) {

			if (sayi%i==0){
				bolen=i;
				asalMı(bolen);//method call bolen sayının asal olup olmadıgını kontrol eder

			}if (isAsal){
				asalBolen=bolen;

			}



		}
		System.out.println("girdiginiz sayının en buyuk asal boleni : "+asalBolen);

	}

	private static boolean asalMı(int bolen) {

		for (int i = 2; i <bolen ; i++) {
			if (bolen%i!=0){//bolen sayısına kadar tum tam sayılar boldugunde kalan sıfır değilse:bu sayı kendisinden başka hiçbir sayıya bolunmez
				isAsal=false;

			}else isAsal=false;
			break;
		}

		return isAsal;

	}


}