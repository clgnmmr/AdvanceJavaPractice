package Projects.P07a_GeometrikHesaplama;

public class Runner {
    public static void main(String[] args) {

        Cember c1=new Cember(2);
       /* c1.cevreBul();
        c1.alanHesaplama();*/
      System.out.printf("Cember'in cevresi : %3.2f   Cember'in alanı : %3.2f",c1.cevreBul(),c1.alanHesaplama());

        System.out.println("");

        Dikdortgen d1 = new Dikdortgen(2,3);
      /*  d1.cevreHesaplama();
        d1.alanHesaplama();*/
      System.out.printf("Dikdörtgen'in cevresi : %3.1f   Dikdörtgen'in alanı : %3.1f",d1.cevreHesaplama(), d1.alanHesaplama());

        System.out.println("");

        Kare k1=new Kare(9,9);
       /* k1.cevreHesaplama();
        k1.alanHesaplama();*/
      System.out.printf("Karenin'in cevresi : %3.1f   Karenin'in alanı : %3.1f",k1.cevreHesaplama(), k1.alanHesaplama());
        System.out.println("");
        System.out.println(k1);

    }



}
