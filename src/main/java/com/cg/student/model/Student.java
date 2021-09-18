package com.cg.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id @Column( name = "id")
	Integer sId;
	@Column(name = "sname" ,length = 20)
	String sName;
	@Column(name = "marks")
	Integer sMarks;
	public Student() {
		super();
	}
	public Student(Integer sId, String sName, Integer sMarks) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sMarks = sMarks;
	}
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Integer getsMarks() {
		return sMarks;
	}
	public void setsMarks(Integer sMarks) {
		this.sMarks = sMarks;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sMarks=" + sMarks + "]";
	}
	
	
	

}
