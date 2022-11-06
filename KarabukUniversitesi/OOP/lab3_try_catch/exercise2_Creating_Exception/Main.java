package lab3_exercise2_Creating_Exception;

public class Main {

	public static void main(String[] args) {

		Worker w1 = new Worker();

		w1.setName("bedirhan");
		w1.setSalary(-500);
		w1.counter++;

		Worker w2 = new Worker();

		w2.setName("ufuk");
		w2.setSalary(1200);
		w2.counter++;

		Worker w3 = new Worker();

		w3.setName("sefer");
		w3.setSalary(5000);
		w3.counter++;
		
		System.out.println("worker count : " + w1.counter);

	}

}
