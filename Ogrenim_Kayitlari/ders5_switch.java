package intro;

public class ders5_switch {

	public static void main(String[] args) {
		
		char grade='B';
		
		switch(grade) { //switch(,,,) burda parantez içindeki değişkenin eşit olduğu case yapısının içi çalışır
		
			case 'A':
				System.out.println("notunuz 82'nin uzerinde,gectiniz.");
			break;
			
			case 'B':
				System.out.println("Notunuz 65-82 arasinda,gectiniz.");
			break;
			
			case 'C':
				System.out.println("Notunuz 50-65 arasinda,gectiniz.");
			break;
			
			case 'D':
				System.out.println("Notunuz 35-50 arasinda, sorumlu gectiniz. ");
			break;
			
			case 'E':
				System.out.println("Notunuz 20-35 arasinda, kaldiniz.");
			break;
			
			case 'F':
				System.out.println("Notunuz 0-20 arasinda, kaldiniz.");
			break;
			
			default: //eğer herhangi bir case içine girmezse default çalışır
				System.out.println("Not hatali.");
			break;
			
		}
		
		
		

	}

}
