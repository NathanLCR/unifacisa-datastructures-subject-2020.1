import lombok.Data;

@Data
public class Division {
	private char id;
	private String name;
	private Admin admin;
	
	public void displayDivision() {
		System.out.println(this.id+" "+this.name);
	}
}
