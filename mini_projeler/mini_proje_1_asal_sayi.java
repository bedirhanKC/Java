package intro;

public class mini_proje_1_asal_sayi {

	public static void main(String[] args) {
		
		int sayi;
		sayi=20;
		boolean asalMi=true; //kontrol yapısı
		
		if(sayi==1) asalMi=false; // sayı 1 mi diye kontrol ediyorum
		
		
		for(int i=2;i<sayi;i++) { //bu for içinde 2'den başlayıp sayiya kadar olan bütün sayılar döngünün içine giriyor
			
			if(sayi%i==0) {  //ve eğer bu sayılardan biri bizim sayımızı bölüyorsa bu durumda bizim sayımız asal olmayacağı için kontrol ediyoruz
				
				 asalMi=false;
				 break;
				 
			}
			
		}
		
		if(sayi<0) System.out.println("sayi negatif."); //bu kısımda da yazdırıyoruz. eğer 0den küçükse negatif oluyor.
		else if(asalMi==true) System.out.println("Sayi asaldir.");
		else System.out.println("Sayi asal degildir.");
		

	}

}
