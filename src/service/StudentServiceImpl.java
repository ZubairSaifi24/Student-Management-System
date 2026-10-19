package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.Database.DatabaseConnection;
import com.Database.Helper;

import model.Student;

public class StudentServiceImpl implements StudentService {

	Connection connection = DatabaseConnection.getConnection();
	
	public int saveStudentRecords(Student student) {
		
		String sql = "insert into student Values(?,?,?,?,?,?)";
		System.out.println(connection+" ******");
		try(PreparedStatement ps = connection.prepareStatement(sql)) 
		{
			ps.setString(1,student.getSid());
            ps.setString(2,student.getSname());
            ps.setString(3,student.getSemail());
            ps.setInt(4,student.getCid());
            ps.setDate(5, Helper.javaDateToSqDate(student.getDob()));
            ps.setDate(6,Helper.javaDateToSqDate(LocalDate.now()));
            int rows = ps.executeUpdate();
         return rows;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public int removeStudent(String sid) {
		Connection connection = DatabaseConnection.getConnection();
        String sql = "delete from student where sid = ?";
        try(PreparedStatement ps = connection.prepareStatement(sql))
        {
            ps.setString(1,sid);
            int rows = ps.executeUpdate();
            return rows;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return 0;	}

	@Override
	public List<Student> getAllStudent() {
		 Connection connection = DatabaseConnection.getConnection();
	        List<Student> students= new ArrayList<>();
	        String sql = "select * from student";
	        try(PreparedStatement ps = connection.prepareStatement(sql))
	        {
	            ResultSet rs = ps.executeQuery();
	            while (rs.next())
	            {
	                Student student = new Student(
	                        rs.getString(1),
	                        rs.getString(2),
	                        rs.getString(3),
	                        rs.getInt(4),
	                        rs.getDate(5).toLocalDate(),
	                        rs.getObject(6, LocalDateTime.class)
	                        );
	                students.add(student);
	            }

	        }
	        catch(Exception ex)
	        {
	            ex.printStackTrace();
	        }
	        return students;
	    }

	

	
}
