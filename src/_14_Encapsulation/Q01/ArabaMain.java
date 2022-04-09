package _14_Encapsulation.Q01;

import java.util.Arrays;

public class ArabaMain {

    public static void main(String[] args) {
       Araba wolswagen = new Araba();
       wolswagen.setModel("Passet");
       wolswagen.setRenk("Siyah");
       wolswagen.setMotor(1500);
       wolswagen.setYil(2018);

        Araba volvo=new Araba("XC90","kırmızı",900,2022);

        Araba ford=new Araba("FOCUS","Mavi",800,2021);

        System.out.println("wolswagen :"+wolswagen);
        System.out.println(volvo);

        System.out.println("modeli :"+ford.getModel()+" motor :"+ford.getMotor());
    }

}
