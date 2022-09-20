package intro;

public class mini_proje_3_mukemmel_sayi {

	public static void main(String[] args) {
		
		int sayi=28;
		int toplam=0;
		boolean mukemmelMi=false;
		
		for(int i=1 ; i<sayi ; i++) {
			
			if(sayi%i==0) toplam+=i;
			
		}
		
		if(toplam==sayi) mukemmelMi=true;
		
		if(mukemmelMi==true) System.out.println("sayi mukemmel sayidir.");
		else System.out.println("sayi mukemmel sayi degildir.");
		
		
	}

}
