import java.util.HashSet;
import lombok.Data;

@Data
public class Class {
	private char id;
	private String name;
	private String division;
	
	public Admin admin;
	public HashSet<Students> studentsEnrolled = new HashSet<Students>();
	
	public void addStudents(Students student) {
		studentsEnrolled.add(student);
	}
	
	public void displayDivisions() {
		System.out.println(this.id+" "+this.name);
	}
}
