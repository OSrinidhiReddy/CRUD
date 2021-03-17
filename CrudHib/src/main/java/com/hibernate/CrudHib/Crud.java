package com.hibernate.CrudHib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table(name="stu_data")
public class Crud 
{
	@Id
	private int sl_no;
//	@Transient becz of this the name column ill not be printed
	private String student_name;
	//@Column(name="student_id")
	private String student_id;
	private String course;
	
	
	public int getSl_no() {
		return sl_no;
	}
	public void setSl_no(int sl_no) {
		this.sl_no = sl_no;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	//to fecthing values not address
	@Override
	public String toString() {
		return "Crud [sl_no=" + sl_no + ", student_name=" + student_name + ", student_id=" + student_id + ", course="
				+ course + "]";
	}

}
