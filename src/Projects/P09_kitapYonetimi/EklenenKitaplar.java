package Projects.P09_kitapYonetimi;

public class EklenenKitaplar {

   private  int  kitapNo;
   private  String kitapAdı;
   private String kitapYazar;
   private  String kitapFiyati;

    @Override
    public String toString() {
        return "EklenenKitaplar{" +
                "kitapNo=" + kitapNo +
                ", kitapAdı='" + kitapAdı + '\'' +
                ", kitapYazar='" + kitapYazar + '\'' +
                ", kitapFiyati='" + kitapFiyati + '\'' +
                '}';
    }

    public int getKitapNo() {
        return kitapNo;
    }

    public String getKitapAdı() {
        return kitapAdı;
    }

    public String getKitapYazar() {
        return kitapYazar;
    }

    public String getKitapFiyati() {
        return kitapFiyati;
    }



    public EklenenKitaplar() {


    }

    public EklenenKitaplar(int kitapNo, String kitapAdı, String kitapYazar, String kitapFiyati) {
        this.kitapNo = kitapNo;
        this.kitapAdı = kitapAdı;
        this.kitapYazar = kitapYazar;
        this.kitapFiyati = kitapFiyati;
    }


}
