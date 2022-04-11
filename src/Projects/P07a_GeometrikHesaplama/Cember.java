package Projects.P07a_GeometrikHesaplama;

public class Cember extends Sekil {


    public Cember(double yariCap) {

        super(yariCap);

    }

    public double cevreBul(){
        return 2*3.14*yariCap;
    }

    public double alanHesaplama() {
        return 3.14*yariCap*yariCap;
    }

}
