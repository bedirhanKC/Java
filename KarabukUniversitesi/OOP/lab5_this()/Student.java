
public class Student {

	private int id;
	private String name;
	private String surname;
	private int age;

	public Student(int id, String name, String surname, int age) {

		this.id = id;
		this.age = age;
		this.name = name;
		this.surname = surname;

	}

	public Student(int id, String name) {

		this(id, name, "unknown", -1);

	}

	public Student(int id) {

		this(id, "unknown", "unknown", -1);

	}

	public void getInfo() {

		System.out.printf("%d : %s %s : %d \n", id, name, surname, age);

	}

}
