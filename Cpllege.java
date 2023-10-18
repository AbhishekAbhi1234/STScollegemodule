package com.cg.cm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {

	private int id;
	private String collegeAdmin;
	private String collegeName;
	private String location;
	
	
	public College() {
		super();
	}


	public College(int id, String collegeAdmin, String collegeName, String location) {
		super();
		this.id = id;
		this.collegeAdmin = collegeAdmin;
		this.collegeName = collegeName;
		this.location = location;
	}

	@Id

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCollegeAdmin() {
		return collegeAdmin;
	}


	public void setCollegeAdmin(String collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "College [id=" + id + ", collegeAdmin=" + collegeAdmin + ", collegeName=" + collegeName + ", location="
				+ location + ", getId()=" + getId() + ", getCollegeAdmin()=" + getCollegeAdmin() + ", getCollegeName()="
				+ getCollegeName() + ", getLocation()=" + getLocation() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
