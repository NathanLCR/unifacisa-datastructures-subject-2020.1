import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

import lombok.Data;

@Data
public class Teachers {
	private char id;
	private String name;
	private int phNo;
	private char address;
	
	private Admin admin;
	private ArrayList<Students> studentsEnrolled = new ArrayList<Students>();
	private Stack<TestPaper> tests = new Stack<TestPaper>();
	
	public Teachers(char id, String name, int phNo, char address, Admin admin) {
		super();
		this.id = id;
		this.name = name;
		this.phNo = phNo;
		this.address = address;
		this.admin = admin;
	}
	
}
