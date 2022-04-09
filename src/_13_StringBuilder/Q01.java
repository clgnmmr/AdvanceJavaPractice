package _13_StringBuilder;

public class Q01 {
    public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */
       StringBuilder str=new StringBuilder("I love Java");


       str.reverse();
        System.out.println("Reversed sentence : "+str);

        if (str.toString().equalsIgnoreCase(str.reverse().toString())){
            System.out.println("Girdiginiz  String palindromdur.");
        }else System.out.println("Girdiginiz String palindrom degildir");

    }

}
