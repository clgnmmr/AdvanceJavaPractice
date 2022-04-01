package _10_List;

import java.util.Scanner;

public class QTasKagitMakas01 {

    public static void main(String[] args) {

        /* TASK:
         tas >makas
         makas >kagit
         kagit >tas

	Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
	Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
	While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
	Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
	Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
	Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
	En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
	dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.

	 */
        Scanner scan = new Scanner(System.in);
        int kpuanı = 0;
        int bpuanı = 0;
        while (true) {
            System.out.println("Tas icin 0\n kagit icin 1\n makas icin 2\n tuslayiniz seceneklerinden birini giriniz");
            int secim = scan.nextInt();
            int random = (int) (Math.random() * 3);
            System.out.println(random);
            switch(secim){

                case 0:
                    if (random == 0){

                    }else if (random ==1){
                        bpuanı++;

                    }else kpuanı++;

                    break;
                case 1:
                    if (random == 1){

                    }else if (random ==0){
                        kpuanı++;

                    }else bpuanı++;

                    break;
                case 2:
                    if (random == 2){

                    }else if (random ==1){
                        kpuanı++;

                    }else bpuanı++;

                    break;
            }
            System.out.println("devam etmek için 1 \n bitirmek için 0 \n basınız");
            int karar= scan.nextInt();
            if (karar ==1){
                continue;
            }else {
                break;
            }


        }
        System.out.println("bilgisayar puanı ="+bpuanı);
        System.out.println("kullanıcı puanı ="+kpuanı);

        if (kpuanı>bpuanı) {
            System.out.println("kullanıcı kazandı");
        }else if (bpuanı>kpuanı) {
            System.out.println("bilgisayar kazandı");
        }else{
            System.out.println("berabere bitti");
        }












    }
}



