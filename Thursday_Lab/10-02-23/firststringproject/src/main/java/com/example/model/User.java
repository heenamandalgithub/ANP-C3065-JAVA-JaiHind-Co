package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
	@Table(name = "userdetails")
	public class User {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		@Column(length = 30 , nullable = false)
		@NotBlank(message="Please Enter Your UserName!!!")
		private String uName;

		@Column(length = 30 , nullable = false, unique = true)
		@NotBlank(message="Please Enter Your UserName!!!")
		@Email
		private String userEmail;
		
		@Column(length = 10 , nullable = false, unique = true)
		private long phnNumber;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getuName() {
			return uName;
		}

		public void setuName(String uName) {
			this.uName = uName;
		}

		public String getUserEmail() {
			return userEmail;
		}

		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		public long getPhnNumber() {
			return phnNumber;
		}

		public void setPhnNumber(long phnNumber) {
			this.phnNumber = phnNumber;
		}
		
		
	}

