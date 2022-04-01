package _10_List;

public class Q07 {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
        int arr1[] = { 1, 2, 3, 4,5,6, 4, 3, 2, 1 };

        if (arr1.length%2!=0){
            System.out.println("simetrik olabilmesi icin çift uzunlukta olması gerekli " );
        }else if(arr1.length%2==0){
            int sayac=0;
            for(int i=0;i<arr1.length/2;i++){

                if(arr1[i]==arr1[arr1.length-1-i]){
                    sayac++;

                }



            }
            if (sayac==arr1.length/2){
                System.out.println("girdigininiz liste simetriktir");
            }else {
                System.out.println("girdiginiz liste çift uzunlukta ama simetrik değil");
            }




        }

    }

}
