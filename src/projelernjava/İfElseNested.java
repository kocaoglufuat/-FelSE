package projelernjava;

import java.util.Scanner;

public class ÝfElseNested {

	public static void main(String[] args) {
		
		/*//Verilen cinsiyet ve yas icin kiþinin emekli olup olmadýgýný yazdýran bir java programý yazýnýz
            //eger calýsan kadýnsa 60 yasýndan buyuk oldugunda emekli olabýlýr,
           // calýsan erkekse 65 yasýndan buyukse emekli olabilir
                                          */
		 
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("lütfen cinsiyetinizi girin");
		 String kisi = scan.nextLine();
		System.out.println("lütfen yasýnýzý giriniz");
		int yas=scan.nextInt();
		 //  calýsanýn cýnsýyetý check edýlýr
		if( kisi.equalsIgnoreCase("erkek")){			
				//yas 65 den buyuk mu check edýlýr.
				if(  yas > 65) {		 
					System.out.println("erkek calýsan emekli olabilir");
				}else {
					System.out.println("erkek calýsan emeklý olamaz");
				}
				
		} else if(kisi.equalsIgnoreCase("kadýn")) {
			
				if(  yas >= 60) {		 
					System.out.println("kadýn calýsan emekli olabilir");
				}else {
					System.out.println("kadýn calýsan emeklý olamaz");
				}

		}
		
		System.out.println("erkek kelýmesý "+kisi.length()+ " harflidir.");		
		scan.close();

}
}
