package lab1_worker;

public class Worker {

	String name;
	int socialSecurityNumber;
	float wage;
	int workingHours;
	
	
	public void displayInfo(){
		
		System.out.println(name +"  " + socialSecurityNumber);
		
	}
	
	public float displaySalary(){
		
		float salary;
		salary = wage * workingHours;
		
		return salary;
		
	}

	
}
