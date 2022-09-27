package ders_17_inheritance;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		customer.firstName = ""; //ortak değişken
		customer.email = ""; //farklı değişken
		
		employee.firstName =""; //ortak değişken
		employee.salary=0; //farklı değişken

	}

}
