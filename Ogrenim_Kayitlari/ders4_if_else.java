package intro;

public class ders4_if_else {

	public static void main(String[] args) {

		int sayi;
		sayi = 20;
		
		// kontrol yapısı
		
		if(sayi<15) { //eğer şartını(burda sayının 15den küçük olma durumu) sağlıyorsa bu if bloğunun içine girer
			
			System.out.println("sayi 15'den kucuktur");
			
		}else if(sayi>15) {
			
			System.out.println("sayi 15'den buyuktur");
			
		}else {
			
			System.out.println("sayi 15'e esittir");
			
		}
		
	}

}
