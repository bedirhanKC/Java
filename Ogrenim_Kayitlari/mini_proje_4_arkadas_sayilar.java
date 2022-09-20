package intro;

public class mini_proje_4_arkadas_sayilar {

	public static void main(String[] args) {
		
		int sayi1,sayi2;
		int toplam1=0,toplam2=0;
		
		sayi1=220;
		sayi2=284;
		
		// sayi1'in bölenleri toplamı sayi2'ye; sayi 2'nin bölenleri toplami sayi1'e eşitse, bu sayılar arkadaş sayılardır.
		
		for(int i=1 ; i<sayi1 ; i++) if(sayi1%i==0) toplam1+=i; 

		
		for(int i=1 ; i<sayi2 ; i++) if(sayi2%i==0) toplam2+=i;
		
		boolean kontrol=false;
		
		if(toplam1==sayi2 && toplam2==sayi1) kontrol=true;
		
		if(kontrol==true) System.out.println("bu sayilar arkadastir");
		else System.out.println("bu sayilar normaldir");
		

	}

}
