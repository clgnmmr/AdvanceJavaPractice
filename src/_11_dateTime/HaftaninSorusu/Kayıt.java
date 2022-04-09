package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayıt {
    List<Kullancı> kisiler = new ArrayList<>(); // bos list create edildi method bu listeye ekleme yapacal

public  List<Kullancı>  kayıtAll(){
    Scanner scan = new Scanner(System.in);
    System.out.print("adınızı giriniz : ");
    String isim=scan.nextLine();
    Kullancı k1=new Kullancı(isim, LocalDateTime.now());// kllanıcı clastan p'li constructor creat edidi
    kisiler.add(k1);

    return kisiler;
}
public  void sansliKullanici(List<Kullancı>  kll){

    for (Kullancı each:kll){
        if (each.kayıtZamanı.getSecond()<10){
            System.out.println("Sanslı kullanıcı : "+each.name+" bir hediye kullandınız");
        }else System.out.println("maalesef sanslı kullanıcı degilsiniz "+each.name);

    }
}
public void listele(List<Kullancı> kullanıcılar){

    for (Kullancı k:kullanıcılar
         ) {
        System.out.println("isim :"+k.name+" kayıt zamanı : "+k.kayıtZamanı);

    }
}


}
