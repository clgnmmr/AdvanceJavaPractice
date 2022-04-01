package Projects.P01_FilmTahmin;

import java.util.*;

public class FilmTahmin {

    static List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
/*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");

        System.out.println("1-" + (film.size()) + " arasinda bir sayi giriniz");
        int secilenFilmIndex = scan.nextInt();
        filmGetir(film, secilenFilmIndex-1);


    }

    private static void filmGetir(List<String> filmler, int index) {
        Scanner scan = new Scanner(System.in);
        StringBuilder tahminEdilenFilm=new StringBuilder(filmler.get(index).replaceAll("\\w", " - "));
        System.out.println(tahminEdilenFilm);//tum harf karakterleri - ile değiştir
        System.out.println(filmler.get(index).length() + " harfli yabancı film tahmin etmek için harf giriniz :");

        char harf = ' ';
        int tahminSayısı = 0;
        int dogruTahminSayısı = 0;
        String str = "";

        do {
            System.out.print("tahmin ettiginiz harf :");
            harf=scan.next().toUpperCase().charAt(0);
            str=""+harf;

            for (int i = 0; i <filmler.get(index).length() ; i++) {
                if (filmler.get(index).charAt(i)==harf){
                    if (!tahminEdilenFilm.toString().contains(filmler.get(index).substring(i,i+1))){
                        dogruTahminSayısı++;
                    }
                    tahminEdilenFilm.setCharAt(i,harf);
                }

            }
            if (tahminEdilenFilm.toString().equalsIgnoreCase(filmler.get(index))){
                System.out.println("Tebrikler kazandınız:");
                break;

            }
            System.out.println(tahminEdilenFilm);

        } while ((tahminSayısı - dogruTahminSayısı) != 2 * (filmler.get(index).length()));//yanlış sayısı verlen hakka ulaşana kadar do body calışır



        if ((tahminSayısı - dogruTahminSayısı) == 2 * filmler.get(index).length()) {
            System.out.println("yanlıs tahmin sayısı : "+(tahminSayısı - dogruTahminSayısı));
            System.out.println("agam game over yine bekleriz....tahmin edemedigin film : "+filmler.get(index));
        }
    }
}
