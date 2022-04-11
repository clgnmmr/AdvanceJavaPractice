package Projects.P07a_GeometrikHesaplama;

public class Kare extends Dikdortgen {

    public Kare(double uzunluk,double genislik) {

        super(uzunluk,genislik);

    }

    public double cevreHesaplama() {

        return super.cevreHesaplama();
    }


    public double alanHesaplama() {

        return super.alanHesaplama();
    }

    @Override
    public String toString() {
        return "Kenar = " + uzunluk + ", \nkare cevre = " + cevreHesaplama()
                + ", \nkare alan = " + alanHesaplama();
    }
}
