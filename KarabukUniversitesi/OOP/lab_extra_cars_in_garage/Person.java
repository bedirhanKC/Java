package lab_extra_cars_in_garage;

import java.util.ArrayList;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	private String job;
	private ArrayList<Car> garage;
	
	
	public Person(String firstName, String lastName, int age, String job) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.job = job;
		garage = new ArrayList<Car>();
		
	}
	
	public void showInfo() {
		
		System.out.println(firstName + " " + lastName + " : " + age + " : " + job +"\n---Garage---");
		showCarsinGarage();
		
	}
	
	public void addCarToGarage(Car car) {
		
		garage.add(car);
		
	}
	
	public void showCarsinGarage() {
		
		for(Car temp : garage) {
			
			System.out.println(temp.getModel() + " : " + temp.getColor());
			
		}
	}
}
