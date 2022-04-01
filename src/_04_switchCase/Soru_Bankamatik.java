package _04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {
  /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
   */
    public static void main(String[] args) {
      Scanner scan =new Scanner(System.in);


      System.out.println("   ****   ");
      System.out.println("    ATM ye  hos geldiniz    ");
      System.out.println(" Bakiye Sorgulama : 1 \n Para Cekme : 2 \n Para Yatırma : 3 \nBakiye Sorgulama : 4 \n yapacagınız işlemi seciniz");

          int işlem=scan.nextInt();
          int bakiye=1000;

          switch(işlem){

            case 1:
              System.out.println("mevcut bakiyeniz :"+bakiye);
              break;
            case 2:
              System.out.print("cekeceginiz miktarı giriniz :");
              int cekilenMiktar= scan.nextInt();
              if (cekilenMiktar>bakiye){
                System.out.println("agam ne yaptın olmayan parayımı cekeceksin");
              }else {
                bakiye-=cekilenMiktar;
                System.out.println("bakiyenizin guncel hali :"+bakiye);
              }
              break;
            case 3:
              System.out.print("yatıracagınız miktarı giriniz :");
              int yatırılanMiktar=scan.nextInt();
              bakiye+=yatırılanMiktar;
              System.out.println("guncel bakiyeniz :"+bakiye);
              break;
            case 4:
              System.out.println("cıkısınız yapılmıstır yine bekleriz");
              break;






}

    }
}

