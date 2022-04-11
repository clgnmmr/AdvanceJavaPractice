package Projects.P07a_GeometrikHesaplama;

public class Dikdortgen extends Sekil {


    public Dikdortgen(double uzunluk, double genislik) {

        super(uzunluk, genislik);

    }


    public double cevreHesaplama() {


        return 2*(uzunluk +genislik);
    }



    public double alanHesaplama() {
        return uzunluk*genislik;
    }
}
