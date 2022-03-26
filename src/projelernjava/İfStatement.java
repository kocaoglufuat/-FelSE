package projelernjava;

import java.util.Scanner;

public class ÝfStatement {

	public static void main(String[] args) {
		//Kullanýcýdan býr tamsayý ýsteyýn
        //sayý pozitif ise "sayý pozitif" yazdýrýn 
		//sayý 100'den kucukse "kucuk sayý" yazdýrýn
		//sayý 1000'den buyuk ise "buyuk sayý" yazdýrýn
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("lütfen bir tam sayý giriniz");
		int sayý=scan.nextInt();
		if(sayý>0) {
			System.out.println("sayý pozitiftir");
		}else {
			System.out.println("sayý negatiftir lütfen pozitif sayý giriniz");
		}
		
		if(sayý<100) {
			System.out.println("kücük sayý");			
		}
				
		if(sayý>1000){
			System.out.println("buyuk sayý");			
		}
		
		
	}

}
