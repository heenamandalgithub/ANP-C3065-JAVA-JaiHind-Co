	package org.hitech.service;

	import java.util.HashMap;

	import org.hitech.dao.Student_Course_DAO;
	import org.hitech.model.Course;
	import org.hitech.model.Student;

		public class Student_Course_Service {
			
		Student_Course_DAO dao=new Student_Course_DAO();
		
		public void addStudentCourseDetails(Student studentobj,Course courseobj){
			dao.addStudentCourseDetails(studentobj, courseobj);
		}
		
		public HashMap<Student,Course> getStudentCourseDetails() {
			
			return dao.getStudentCourseDetails();
		}
		public void deleteStudentCourseDetails(Student studentobj) {
			dao.deleteStudentCourseDetails(studentobj);
		}
	}

