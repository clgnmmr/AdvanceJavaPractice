package Projects.P11_depoYonetimi;

import java.util.*;


public class Islemler  implements Methodlar {
    static Scanner scan=new Scanner(System.in);
    static Map<Integer,Urunler> mapList = new HashMap<>();
    static Integer id=1000;


    public static void menu() throws InterruptedException {
        System.out.println( "========================== İŞLEMLER =======================\r\n"
                + "   ____________________              ____________________   \n"
                + "   | 1-URUN TANIMLAMA |              |  2-URUN LİSTELE  |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 3-URUN GIRISI    |              |  4-URUN RAFA KOY |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 5-URUN CIKISI    |              |  6-BITIRME       |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  ");

        System.out.print("islem tercihinizi giriniz : ");
        int Islem = scan.nextInt();

        Methodlar mth=new Islemler();

        switch (Islem){
            case 1:
                mth.urunTanımlama();
                menu();
                break;
            case 2:
                mth.urunListele();
                menu();
                break;
            case 3:
                mth.urunGirisi();
                menu();
                break;
            case 4:
                mth. urunRafaYerlestirme();
                menu();
                break;
            case 5:
                mth .urunCikisi();
                menu();
                break;
            case 6:
                mth.cıkıs();
                break;
            default:
                System.out.println("Lutfen gecerli bir karekter giriniz....");

                break;



        }

    }


    @Override
    public  void urunCikisi() throws InterruptedException {
        System.out.println("<<<<<<<<<<<<<<  URUN CIKISI >>>>>>>>>>>>>>>");

        System.out.print("Eklemek istediginiz urunun ıd'sini giriniz :");
        int arananId=scan.nextInt();

        Set<Integer> keySet= mapList.keySet();

        for (Integer each:keySet){

            if (each==arananId){
                System.out.print("Cikarmak istediginiz miktarı giriniz  :");
                int miktarı=scan.nextInt();
                Urunler urunlerSet= mapList.get(each);
                if (urunlerSet.getMiktar()>miktarı){
                    urunlerSet.setMiktar(urunlerSet.getMiktar()-miktarı);
                }else{
                    System.out.println("elimde sadece "+urunlerSet.getMiktar()+" "+urunlerSet.getBirim()+" "+urunlerSet.getUrunIsmi() +" var.");
                    urunlerSet.setMiktar(0);

                }


            }

        }

        Thread.sleep(3000);


    }

    @Override
    public  void urunRafaYerlestirme() throws InterruptedException {
        System.out.println("<<<<<<<<<<<<<<  URUN RAFA YERLESTIRME >>>>>>>>>>>>>>>");

        System.out.print("Eklemek istediginiz urunun ıd'sini giriniz :");
        int arananId=scan.nextInt();

        Set<Integer> keySet= mapList.keySet();

        for (Integer each:keySet){

            if (each==arananId){
                System.out.print("Yerlestirmek istediginiz rafı  giriniz  :");

                String raf="raf"+scan.next();
                Urunler urunlerSet= mapList.get(each);
                urunlerSet.setRaf(raf);

            }

        }
        Thread.sleep(3000);



    }

    @Override
    public  void urunGirisi() {
        System.out.println("<<<<<<<<<<<<<<  URUN GIRISI >>>>>>>>>>>>>>>");

        System.out.print("Eklemek istediginiz urunun ıd'sini giriniz :");
        int arananId=scan.nextInt();

        Set<Integer> keySet= mapList.keySet();

        for (Integer each:keySet){

            if (each==arananId){
                System.out.print("Eklemek istediginiz miktarı giriniz : ");
                int miktarı=scan.nextInt();
                Urunler urunlerSet= mapList.get(each);

                urunlerSet.setMiktar(miktarı+urunlerSet.getMiktar());

            }



        }

    }

    @Override
    public  void urunListele() throws InterruptedException {
        System.out.println("<<<<<<<<<<<<<<  URUN LISTELEME >>>>>>>>>>>>>>>");

        System.out.printf("%2s     %5s   %10s   %8s    %6s     %3s \n","ID","ISIM","URETICI","MIKTAR","BIRIM","RAF");
        System.out.println("-------------------------------------------------------");

        Set<Integer> keySet= mapList.keySet();

        for (Integer each:keySet) {

            Urunler urunlerSet= mapList.get(each);

            System.out.printf("%4d    %-5s     %-10s   %3.2f      %-6s   %3s \n",each,urunlerSet.getUrunIsmi(),
                    urunlerSet.getUretici(),urunlerSet.getMiktar(),urunlerSet.getBirim(),urunlerSet.getRaf());




        }


        Thread.sleep(3000);




    }

    @Override
    public  void urunTanımlama() throws InterruptedException {
        System.out.println("<<<<<<<<<<<<<<  URUN TANIMLAMA >>>>>>>>>>>>>>>");



        do {
            System.out.print("Urunun ismini giriniz : ");
            String isim=scan.next();

            System.out.print("Urunun ureticisini giriniz : ");
            String ureticiIsmi=scan.next();

            System.out.print("Urunun birimini giriniz : ");
            String birim=scan.next();

            Urunler urun=new Urunler(isim,ureticiIsmi,birim);

            mapList.put(id,urun);

            id++;

            System.out.print("Tekrar urun tanımlamak isterseniz  \n 1' e basınız \n yoksa 0'a basınız :");
            int devamEtme=scan.nextInt();
            if (devamEtme==0){
                System.out.println("isleminiz gercekleşti.....");
                break;
            }

        }while(true);





        Thread.sleep(3000);





    }

    @Override
    public  void cıkıs() {
        System.out.println("Cıkış işleminiz gerçekleşti....");

    }


   /*








    private static void cıkıs() {

    }
*/

}
