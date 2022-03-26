package projelernjava;

import java.util.Scanner;

public class ÝfStatement1 {

	public static void main(String[] args) {
/*Kullanýcýdan býr dýkdortgenýn ýký kenar uzunlugunu alýn
  kenar uzunluklarý esýtse"KARE"
  esit degilse "dikdörtgen" yazdýrýn
 	*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen dikdortegenýn iki kenar uzunlugunu gýrýnýz");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("kare");			
		} else {
			System.out.println("dikdörtgen");
		}
	
	}

}
