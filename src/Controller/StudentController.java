package Controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.Database.Helper;
import model.Student;
import service.StudentService;
import service.StudentServiceImpl;

public class StudentController 
{
	Scanner sc = new Scanner(System.in);
	StudentService studentservice = new StudentServiceImpl();
	
	public void insertEmployeeRecord() {
			System.out.print("Enter the student id: ");
	        String sid = sc.next();
	        sc.nextLine();

	        System.out.print("Enter the student name : ");
	        String name = sc.nextLine();

	        System.out.print("Enter the student email : ");
	        String email = sc.next();

	        System.out.print("Enter the course ID: ");
	        Integer cid = sc.nextInt();

	        System.out.print("Enter dob (yyyy/mm/dd) : " );
	        String dob = sc.next();

	        Student student = new Student(sid,name,email,cid, Helper.stringDateTojavaDate(dob), LocalDateTime.now());

	        int row = studentservice.saveStudentRecords(student);
	        if(row>0)
	            System.out.println("*** Record Inserted ***");
	        else
	            System.err.println("*** Record Not insererd ***");
	}
	
	public void studentRemovebyId()
    {
        System.out.print("Enter the student id  to remove  : ");
        String sid = sc.next();
        int row  = studentservice.removeStudent(sid);

        if(row>0)
            System.out.println("=== Record Deleted ======");
        else
            System.err.println("====Record Not Deleted====");
    }

	public void getAllStudents() {

        List<Student> allStudents = studentservice.getAllStudent();

        allStudents.stream()
                .forEach(System.out::println);


    }
	
}
