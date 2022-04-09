package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;

public class Kullancı {
    String name;
    LocalDateTime kayıtZamanı;

    public Kullancı() {

    }

    public Kullancı(String name, LocalDateTime kayıtZamanı) {
        this.name = name;
        this.kayıtZamanı = kayıtZamanı;
    }
}
