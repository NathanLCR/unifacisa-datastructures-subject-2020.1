import java.util.HashSet;

import exceptions.ClassAlreadyExistException;
import exceptions.ClassDoesNotExistException;
import exceptions.DivisionAlreadyExistException;
import exceptions.DivisionDoesNotExistException;
import exceptions.StudentAlreadyExistsException;
import exceptions.StudentDoesNotExistException;
import exceptions.SubjectAlreadyExistsException;
import exceptions.SubjectDoesNotExistException;
import exceptions.TeacherAlreadyExistsException;
import exceptions.TeacherDoesNotExistException;

import lombok.Data;

@Data
public class Admin {
	private char id;
	private String name;
	private String password;
	private boolean isLogged;
		
	private HashSet<Students> studentsList = new HashSet<Students>();
	private HashSet<Teachers> teachersHired = new HashSet<Teachers>();
	private HashSet<Subject> subjectList = new HashSet<Subject>();
	private HashSet<Class> classList = new HashSet<Class>();
	private HashSet<Division> divisionList = new HashSet<Division>();
	
	public void login() {
		//TODO implementation
	}
	
	public void logout() {
		//TODO implementation
	}
	
	public void addNewTeachers(Teachers newTeacher) throws TeacherAlreadyExistsException{
		if(teachersHired.contains(newTeacher)) {
			throw new TeacherAlreadyExistsException();
		}		
		teachersHired.add(newTeacher);
	}
	
	public void modifyTeachers(Teachers teacher) throws TeacherDoesNotExistException{
		if(!teachersHired.contains(teacher)) {
			throw new TeacherDoesNotExistException();
		}
		teachersHired.remove(teacher);
		teachersHired.add(teacher);
	}
	
	public void addNewStudent(Students newStudent) throws StudentAlreadyExistsException{
		if(studentsList.contains(newStudent)) {
			throw new StudentAlreadyExistsException();
		}
		studentsList.add(newStudent);
	}
	
	public void modifyStudent(Students student) throws StudentDoesNotExistException{
		if(!studentsList.contains(student)) {
			throw new StudentDoesNotExistException();
		}
		studentsList.remove(student);
		studentsList.add(student);
	}
	
	public void addNewSubject(Subject newSubject) throws SubjectAlreadyExistsException{
		if(subjectList.contains(newSubject)) {
			throw new SubjectAlreadyExistsException();
		}
		subjectList.add(newSubject);
	}
	
	public void modifySubject(Subject subject) throws SubjectDoesNotExistException{
		if(!subjectList.contains(subject)) {
			throw new SubjectDoesNotExistException();
		}
		subjectList.remove(subject);
		subjectList.add(subject);
	}
	
	public void addNewClass(Class newClass) throws ClassAlreadyExistException{
		if(classList.contains(newClass)) {
			throw new ClassAlreadyExistException();
		}		
		classList.add(newClass);
	}
	
	public void modifyClass(Class newClass) throws ClassDoesNotExistException{
		if(!classList.contains(newClass)) {
			throw new ClassDoesNotExistException();
		}
		classList.remove(newClass);
		classList.add(newClass);
	}
	
	public void addNewDivision(Division newDivision) throws DivisionAlreadyExistException{
		if(divisionList.contains(newDivision)) {
			throw new DivisionAlreadyExistException();
		}		
		divisionList.add(newDivision);
	}
	
	public void modifyDivision(Division division) throws DivisionDoesNotExistException{
		if(!divisionList.contains(division)) {
			throw new DivisionDoesNotExistException();
		}
		divisionList.remove(division);
		divisionList.add(division);
	}
}
