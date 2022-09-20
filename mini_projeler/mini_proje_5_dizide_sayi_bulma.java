package intro;

public class mini_proje_5_dizide_sayi_bulma {

	public static void main(String[] args) {
		
		int[] dizi= {1,2,5,7,9,11,12,15};
		int arananSayi = 8;
		
		boolean sayiBulunduMu =false;
		
		for(int i=0; i< dizi.length ;i++) {
			
			if(dizi[i]==arananSayi) {
				
				System.out.println("aranan sayi "+i+". indeksdedir.");
				sayiBulunduMu=true;
				
			}
			
			
		}
		
		if(sayiBulunduMu==false) System.out.println("aranan sayi bulunamadi.");
		

	}

}
