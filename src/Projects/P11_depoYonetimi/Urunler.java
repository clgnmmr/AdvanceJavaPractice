package Projects.P11_depoYonetimi;

public class Urunler {
    int id;
  private  String urunIsmi;
  private  String uretici;
  private  double miktar;
  private  String birim;
  private   String raf="-";

    public Urunler() {


    }

    public Urunler(String urunIsmi, String uretici, String birim) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.birim = birim;
    }

    public Urunler(String urunIsmi, String uretici, double miktar, String birim, String raf) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public double getMiktar() {
        return miktar;
    }

    public void setMiktar(double miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "Urunler{" +
                "urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +
                '}';
    }
}
