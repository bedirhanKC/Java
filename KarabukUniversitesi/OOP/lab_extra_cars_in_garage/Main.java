package lab_extra_cars_in_garage;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person("bedirhan", "kc", 21, "computer engineer");
		Car c1 = new Car(p1, "purple", "bmw m4");
		Car c2 = new Car(p1, "black","69 charger");
		Car c3 = new Car(p1, "rainbow", "subaru brz");
		p1.addCarToGarage(c1);
		p1.addCarToGarage(c2);
		p1.addCarToGarage(c3);
		
		p1.showInfo();

		

	}

}
