import java.util.Stack;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class Students {
	
	@EqualsAndHashCode.Include
	private char id;
	private String name;
	private int phNo;
	private String address;
	
	private Admin admin;
	private Teachers teacher;
	
	private Stack<TestPaper> tests = new Stack<TestPaper>(); 
	private Class classEnrolled;
	
	public void fillAdmissionForm() {
		//TODO Implementation
	}
	
	public void getEnrolled(Class classEnrolled) {
		classEnrolled.addStudents(this);
		this.classEnrolled = classEnrolled;
	}
	
	public void writeExam() {
		//TODO Implementation
	}
	
}
