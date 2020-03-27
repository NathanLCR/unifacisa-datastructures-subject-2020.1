import lombok.Data;

@Data
public class Subject {
	private char id;
	private String name;
	private char classId;
	
	private Admin admin;
	
	public void displaySubject() {
		//TODO implementation
	}
}
