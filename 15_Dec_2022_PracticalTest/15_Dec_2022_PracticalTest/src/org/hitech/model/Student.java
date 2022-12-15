package org.hitech.model;
	import java.util.Objects;

	public class Student {

		private int studentId;
		private String studentName;
		private String qualification;
		 
		 public Student() {
		  
		 }

		public Student(int studentId, String studentName, String qualification) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.qualification = qualification;
		}

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentName=" + studentName + ", qualification=" + qualification
					+ ", getStudentId()=" + getStudentId() + ", getStudentName()=" + getStudentName()
					+ ", getQualification()=" + getQualification() + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(qualification, studentId, studentName);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return Objects.equals(qualification, other.qualification) && studentId == other.studentId
					&& Objects.equals(studentName, other.studentName);
		}

		}


