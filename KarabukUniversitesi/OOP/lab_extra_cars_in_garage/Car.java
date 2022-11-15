package lab_extra_cars_in_garage;

public class Car {
	
	private Person owner;
	private String color;
	private String model;
	
	
	public Car(Person owner, String color, String model) {
		
		this.color = color;
		this.model = model;
		this.owner = owner;
		
	}
	
	public void changeOwner(Person newPerson) {
		
		this.owner = newPerson;
		
	}
	
	public Person getOwner() {
		return this.owner;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getColor() {
		return this.color;
	}

}
