package intro;

public class ders_10_matrisler {

	public static void main(String[] args) {
		
		String[][] sehirler = new String[2][2]; //burda bir matris oluşturuyoruz. VERİ_TİPİ[][] matrisin_adi = new VERİ_TİPİ[SATIR_SAYISI][SÜTUN SAYISI]
		
		sehirler[0][0]="Ankara";
		sehirler[0][1]="istanbul";
		sehirler[1][0]="izmir";
		sehirler[1][1]="konya";
		
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<2;j++) {
				
				System.out.println(sehirler[i][j]);
				
			}
			
			System.out.println("-----------------");
		}

	}

}
