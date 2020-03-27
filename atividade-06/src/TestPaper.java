import java.util.HashSet;
import lombok.Data;

@Data
public class TestPaper {
	private int id;
	private String name;
	private float duration;
	private char classId;
	
	private Teachers teacher;
	private HashSet<Students> students = new HashSet<Students>();
	
}
