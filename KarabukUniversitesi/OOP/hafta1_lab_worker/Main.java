package lab_1_OOP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Worker worker1 = new Worker();
		
		worker1.name="bedirhan";
		worker1.socialSecurityNumber=1;
		worker1.wage= 250;
		worker1.workingHours = 4;
		
		
		Worker worker2 = new Worker();
		
		System.out.println("");
		System.out.println("worker 2 icin : ");
		
		System.out.println("isim giriniz : ");
		worker2.name = input.nextLine();
		
		System.out.println("güvenlik numarasi giriniz : ");
		worker2.socialSecurityNumber = input.nextInt();
		
		System.out.println("saatlik ucret giriniz : ");
		worker2.wage = input.nextFloat();
		
		System.out.println(" calisma saati giriniz : ");
		worker2.workingHours = input.nextInt();
		
		System.out.println("--------");
		System.out.println("LIST");
		
		System.out.println("worker 1 ;");
		
		worker1.displayInfo();
		System.out.println(worker1.displaySalary());
		
		System.out.println("");
		System.out.println("worker 2 ;");
		
		worker2.displayInfo();
		System.out.println(worker2.displaySalary());
		
		
			
	}

}
