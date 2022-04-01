package _05_StringManipulation;

import java.util.Locale;

public class Q11 {
    public static void main(String[] args) {
	/*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int a=pickName.indexOf("A");

        int l=pickName.indexOf("L");

        int i=pickName.indexOf("I");


      char aBuldu=pickName.charAt(a);

        String lBuldu=pickName.substring(l,l+1);

        String iBuldu=pickName.substring(i,i+1);

        String dondu=iBuldu.toLowerCase(Locale.forLanguageTag("tr"));

        System.out.println(aBuldu+" "+lBuldu+" "+dondu);
    }

}
