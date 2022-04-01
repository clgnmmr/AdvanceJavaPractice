package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */
         Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen IT bilginizi giriniz");
		String It=scan.next().toLowerCase();

		if (It.equals("qa")){
			System.out.println("Quality Analyst");
		}else if (It.equals("dev")){
			System.out.println("Developer");
		}else if (It.equals("ba")){
			System.out.println("Busines Analyst");
		}else if (It.equals("pm")){
			System.out.println("Project Manager");
		}else {
			System.out.println("lutfen gecerlı IT giriniz");
		}
	}
}