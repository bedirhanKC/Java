package intro;

public class ders9_array {

	public static void main(String[] args) {
		
		String[] ogrenciler = new String[4]; //burda bir dizi oluşturuyoruz. VERİ_TİPİ[] dizinin_adi = new VERİ_TİPİ[ELEMAN_SAYİSİ]
		
		ogrenciler[0]="bedirhan";
		ogrenciler[1]="sefer";
		ogrenciler[2]="ufuk";
		ogrenciler[3]="kalafato";
		
		for(int i=0;i<ogrenciler.length;i++) { // döngüler içinde dizinin elmanlarını sırayla yazdırıyoruz
			
			System.out.println(ogrenciler[i]);
			
		}
		
		System.out.println("----------");
		
		for(String ogrenci:ogrenciler) {
			
			System.out.println(ogrenci);
			
		}

	}

}
