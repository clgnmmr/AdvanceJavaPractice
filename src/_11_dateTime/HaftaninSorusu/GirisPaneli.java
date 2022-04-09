package _11_dateTime.HaftaninSorusu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GirisPaneli {

    public static void panel(){
        Scanner scan = new Scanner(System.in);
        // System.out.print("İsleminizi seciniz :");



        Kayıt yeniKayıt=new Kayıt(); // obje olusturuldu method call edilecek

        List<Kullancı> kisi = new ArrayList<>();

        boolean cikilsinMi=false;

        while (!cikilsinMi){
            System.out.print("Lutfen \n kayıAl 1\n sanslı kullanıcı bul 2\n kullanıcı listele 3\n cıkıs 4 :");
            int isleminiz = scan.nextInt();
            switch(isleminiz){
                case 1:
                    kisi=yeniKayıt.kayıtAll();
                    break;
                case 2:
                    yeniKayıt.sansliKullanici(kisi);
                    break;
                case 3:
                    yeniKayıt.listele(kisi);
                    break;
                case 4:
                    cikilsinMi=true;
                    break;
                default:
                    System.out.println("Hatalı veri girdiniz....");

            }
        }

    }
}
