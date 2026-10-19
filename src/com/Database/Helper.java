package com.Database;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class Helper {

	public static Date javaDateToSqDate(LocalDate date) {
		return Date.valueOf(date);
	}
	
	public static LocalDate stringDateTojavaDate(String date) {
		return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
	}
	
}
