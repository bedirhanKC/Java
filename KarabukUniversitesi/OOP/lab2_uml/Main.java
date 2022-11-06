package lab2_exercise1_UML;

public class Main {

	public static void main(String[] args) {
		
		Account musteri1 = new Account("bedirhan",150,1234);
		
		System.out.println(musteri1.getOwnerName());
		System.out.println(musteri1.getBalance());
		
		musteri1.add(350);
		
		System.out.println("yeni bakiye : " + musteri1.getBalance());
		
		musteri1.withdraw(100);
		
		System.out.println("yeni bakiye : " + musteri1.getBalance());
		
		musteri1.setOwnerName("sefer");
		
		System.out.println("yeni musteri ismi : " + musteri1.getOwnerName());

	}

}
