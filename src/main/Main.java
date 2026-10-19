package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import Controller.StudentController;

public class Main 
{
	public static void main(String[] args) throws SQLException 
	{	
	Scanner sc = new Scanner(System.in);
	System.out.println("1. Add Student\n2. remove Student\n3. Show all Student");
	System.out.print("Choose option : ");
	int ch = sc.nextInt();
	
	switch (ch) 
	{
	case 1:  new StudentController().insertEmployeeRecord();
				break;
	case 2: new StudentController().studentRemovebyId();
		break;
	
	case 3: new StudentController().getAllStudents();
		break;
	default: 
		System.out.println("invalid choice !!!");
		break;
	}
	
	
		
	}

}
