package projelernjava;

import java.util.Scanner;

public class �fStatement {

	public static void main(String[] args) {
		//Kullan�c�dan b�r tamsay� �stey�n
        //say� pozitif ise "say� pozitif" yazd�r�n 
		//say� 100'den kucukse "kucuk say�" yazd�r�n
		//say� 1000'den buyuk ise "buyuk say�" yazd�r�n
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("l�tfen bir tam say� giriniz");
		int say�=scan.nextInt();
		if(say�>0) {
			System.out.println("say� pozitiftir");
		}else {
			System.out.println("say� negatiftir l�tfen pozitif say� giriniz");
		}
		
		if(say�<100) {
			System.out.println("k�c�k say�");			
		}
				
		if(say�>1000){
			System.out.println("buyuk say�");			
		}
		
		
	}

}
