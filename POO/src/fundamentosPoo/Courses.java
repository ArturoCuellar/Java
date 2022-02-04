package fundamentosPoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;



public class Courses {
	
	private String courseName;
	private String professorName;
	private int year;
	private Student[] students;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Courses course = new Courses("JAVA", "Felipe", 2022);
	}
		
	 public Courses(String courseName, String professorName, int year) {
		super();
		this.courseName = courseName;
		this.professorName = professorName;
		this.year = year;
		this.students = new Student[10];
	}

	public void enroll(Student student){
	      //TODO add the student to the collection
		
		
	   }

	   public void unEnroll(Student student){
	       //TODO remove this student from the collection
	       // Hint: check if that really is this student
	   }

	   public int countStudents(){
	       //TODO implement
	       return 0;
	   }
	   
	   public int bestGrade(){
	       //TODO implement
	       return 0;
	   }
	   
	   public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public String getProfessorName() {
			return professorName;
		}

		public void setProfessorName(String professorName) {
			this.professorName = professorName;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

	   
}
