package com.niit.JavaHibernate1;
import javax.persistence.Transient;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="student")

public class Student {
	@Id
	int id;
	//@Transient
	StudentName name;
	//@Column(name="semester")
	int sem;
	int average;
	
	
	public Student() {
		super();
	}
	public Student(int id, StudentName sname, int sem, int average) {
		super();
		this.id = id;
		this.sem = sem;
		this.name=sname;
		this.average = average;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public String toString() {
		return "\n"+id+"\t"+name+"\t"+sem+"\t"+average;
	}
	
}
