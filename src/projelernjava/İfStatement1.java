package projelernjava;

import java.util.Scanner;

public class �fStatement1 {

	public static void main(String[] args) {
/*Kullan�c�dan b�r d�kdortgen�n �k� kenar uzunlugunu al�n
  kenar uzunluklar� es�tse"KARE"
  esit degilse "dikd�rtgen" yazd�r�n
 	*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen dikdortegen�n iki kenar uzunlugunu g�r�n�z");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("kare");			
		} else {
			System.out.println("dikd�rtgen");
		}
	
	}

}
