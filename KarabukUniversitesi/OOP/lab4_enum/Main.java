package lab4_enum;

public class Main {

	public static void main(String[] args) {

		Teacher newTeacher1 = new Teacher(1, "Merer", Branch.PHYSICS);
		Teacher newTeacher2 = new Teacher(2, "Caner", Branch.CS);
		Teacher newTeacher3 = new Teacher(3, "ADIL", Branch.MATH);
		Teacher newTeacher4 = new Teacher(1, "Şirin", Branch.ENG);
		
		Teacher[] teachers = {newTeacher1,newTeacher2,newTeacher3,newTeacher4};
		
		for(Teacher temp : teachers) {
			
			temp.getInfo();
			
		}
		
	}

}
