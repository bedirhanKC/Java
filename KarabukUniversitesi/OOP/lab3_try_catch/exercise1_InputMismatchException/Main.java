package lab3_exercise1_InputMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int sayi;
		
		System.out.println("bir sayi giriniz : ");
		
		try {
			
			sayi=input.nextInt();
			System.out.println("girdiginiz sayi : " + sayi + "'dir");
			
		} catch (InputMismatchException e) {
			
			System.out.println("\nHata! \nString bir deger girdiniz.");
		
		}
		
		
		
	}

}
