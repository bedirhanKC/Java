package lab4_enum;

public class Teacher {
	
	private int id;
	private String name;
	private Branch branch;
	
	public Teacher(int id, String name, Branch branch) {
		
		this.id = id;
		this.name = name;
		this.branch = branch;
		
	}
	
	public void getInfo() {
		
		System.out.printf("%d : %s ; %s : %s\n",id,name,branch,branch.getExplanation());
		
	}


}
