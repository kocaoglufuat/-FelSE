package projelernjava;

import java.util.Scanner;

public class �fElseNested {

	public static void main(String[] args) {
		
		/*//Verilen cinsiyet ve yas icin ki�inin emekli olup olmad�g�n� yazd�ran bir java program� yaz�n�z
            //eger cal�san kad�nsa 60 yas�ndan buyuk oldugunda emekli olab�l�r,
           // cal�san erkekse 65 yas�ndan buyukse emekli olabilir
                                          */
		 
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("l�tfen cinsiyetinizi girin");
		 String kisi = scan.nextLine();
		System.out.println("l�tfen yas�n�z� giriniz");
		int yas=scan.nextInt();
		 //  cal�san�n c�ns�yet� check ed�l�r
		if( kisi.equalsIgnoreCase("erkek")){			
				//yas 65 den buyuk mu check ed�l�r.
				if(  yas > 65) {		 
					System.out.println("erkek cal�san emekli olabilir");
				}else {
					System.out.println("erkek cal�san emekl� olamaz");
				}
				
		} else if(kisi.equalsIgnoreCase("kad�n")) {
			
				if(  yas >= 60) {		 
					System.out.println("kad�n cal�san emekli olabilir");
				}else {
					System.out.println("kad�n cal�san emekl� olamaz");
				}

		}
		
		System.out.println("erkek kel�mes� "+kisi.length()+ " harflidir.");		
		scan.close();

}
}
