package lab3_exercise2_Creating_Exception;

public class Worker {

	private String name;
	private double salary;
	static int counter=0;

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		
		try {
			
			if(salary<0)
				throw new IllegalArgumentException();
			
			this.salary=salary;
			
		}catch (Exception e) {

			this.salary=0;
			System.out.println("salary amount must be greater than zero");
			
		}
	}

}
