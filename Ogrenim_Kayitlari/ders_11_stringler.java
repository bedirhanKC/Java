package intro;

public class ders_11_stringler {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çoksel.";
		System.out.println(mesaj);
		
		System.out.println("eleman sayisi : "+ mesaj.length()); //.length eleman sayisi
		System.out.println("5. eleman : "+ mesaj.charAt(4));  //.charAt(i) i. indeksli char
		System.out.println(mesaj.concat(" yaşasın!")); //.concat yanına metin ekleme
		System.out.println(mesaj.startsWith("B")); //.startsWith("i") ile mi başlıyor
		System.out.println(mesaj.endsWith(".")); //.startsWith("i") ile mi bitiyor
		System.out.println(mesaj.indexOf("a")); //.indexOf("a") a'yı bulana kadar metinde ilerler
		System.out.println(mesaj.lastIndexOf("a")); //.indexOf("a") a'yı bulana kadar metinde sondan ilerler
		System.out.println(mesaj.replace(" ","-")); // virgülün sol tarafındaki verileri bulup sağ taraftaki veriler ile değiştiriyor
		System.out.println(mesaj.substring(2,5)); // virgülün sol tarafindaki indeksdeki harften sağ tarafındaki indekse kadar yazdırıyor
		System.out.println(mesaj.toLowerCase()); //metinin tamamındaki harfleri küçük harfe çevirir
		System.out.println(mesaj.toUpperCase()); //metinin tamamındaki harfleri büyük harfe çevirir
		System.out.println(mesaj.trim()); //metinin başındaki ve sonundaki boşlukları siler
		
		
		char[] karakterler = new char[5];
		mesaj.getChars(0,5, karakterler, 0); // getchars(mesajın 0. indeksinden, 5. indeksine kadar olan metni, karakterler isimli char dizisine 0dan başlayacak şekilde yazdırma
		System.out.println(karakterler);

	}

}
