package service;

import java.util.List;

import model.Student;

public interface StudentService {

	public int saveStudentRecords(Student student);
	public int removeStudent(String sid);
	public List<Student> getAllStudent();

}
