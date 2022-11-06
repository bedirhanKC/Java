package lab2_exercise1_UML;

import java.util.Scanner;

public class Account {
	
	private double balance;
	private String ownerName;
	private int sifre;
	int[] dizi = new int[6];
	
	public Account() {
		
	}
	
	public Account(String name , double balance , int sifre) {
		
		this.balance= balance;
		this.ownerName = name;
		this.sifre = sifre;
		
	}
	
	public void setOwnerName(String name) {
		
		this.ownerName=name;
		
	}
	
	public String getOwnerName() {
		
		return this.ownerName;
		
	}
	
	public void add(double amount) {
		
		Scanner input = new Scanner(System.in);
		int girilenSifre,hak=3;
		
		while(true) {
			
			System.out.println("please enter the 4-digits pass for adding : ");
			girilenSifre = input.nextInt();
			
			if(girilenSifre == this.sifre) {
				
				this.balance = this.balance + amount;
				return;
				
			}else {
				
				hak--;
				if(hak==0) {
					
					System.out.println("your account has been blocked. please try again");
					return;
					
				}
			}
			
			
		}
		
	}
	
	public void withdraw(double amount) {

		Scanner input = new Scanner(System.in);
		int girilenSifre,hak=3;
		
		while(true) {
			
			System.out.println("please enter the 4-digits pass for deleting : ");
			girilenSifre = input.nextInt();
			
			if(girilenSifre == this.sifre) {
				
				this.balance = this.balance - amount;
				return;
				
			}else {
				
				hak--;
				if(hak==0) {
					
					System.out.println("your account has been blocked. please try again");
					return;
					
				}
			}
			
			
		}
		
	}
	
	public double getBalance() {
		
		return this.balance;
		
	}
	
	
	

}
