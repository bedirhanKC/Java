package intro;

public class ornek2_ders10_dizideki_en_buyuk_ve_toplam {

	public static void main(String[] args) {
		
		double[] Sayilar = {1.1 , 2.5 , 5.3, 7.1 , 3.4}; //sayı dizisi oluşturuyoruz
		double toplam,max;
		
		toplam=0; //toplam değerine başta sıfır veriyoruz
		max=Sayilar[0]; // dizinin ilk elemanını en büyük sayı olarak seçiyoruz
		
		for(double sayi:Sayilar) { //bu döngü sırayla dizideki bütün elemanlara bakıyor
			
			if(max<sayi) max=sayi; //bu satırda eğer döngüye giren eleman maxdan büyükse yeni max o değer oluyor
			
			toplam += sayi; //burda da sırayla döngüye giren bütün sayıları topluyoruz
			
		}
		
		System.out.println("sayilar toplami : "+toplam);
		System.out.println("en buyuk sayi : "+max);

	}

}
