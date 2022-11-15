
public class Main {

	public static void main(String[] args) {

		Student s1 = new Student(1); 
		Student s2 = new Student(2, "Bedo"); 
		Student s3 = new Student(3, "sefer" , "erdugan", 22); 
		Student s4 = new Student(4);
		
		Student[] students = {s1,s2,s3,s4};
		
		for (Student temp : students) {
			
			temp.getInfo();
			
		}
		
	}

}
