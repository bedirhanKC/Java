package intro;

public class ornek1_ders4_en_buyuk_sayiyi_bulma {

	public static void main(String[] args) {
		
		int sayi1,sayi2,sayi3;
		sayi1=12;
		sayi2=23;
		sayi3=9;
		
		//en büyük sayıyı bulma
		
		int enBuyuk=sayi1; //ilk sayıyı en büyük olarak atıyoruz
		
		if(enBuyuk<=sayi2) { // ikinci sayı eğer daha büyükse ikinci sayı en büyük sayı oluyor.
			
			enBuyuk=sayi2;
			
		}
		
		if(enBuyuk<=sayi3) { // üçüncü sayı eğer daha büyükse üçüncü sayı en büyük sayı oluyor
			
			enBuyuk=sayi3;
			
		}
		
		System.out.println("en buyuk sayi : "+ enBuyuk );
		

	}

}
