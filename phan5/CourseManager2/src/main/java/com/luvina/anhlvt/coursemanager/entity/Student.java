package com.luvina.anhlvt.coursemanager.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Student extends User {

	private int year;

	@ManyToMany
	@JoinTable(
	  name = "enroll", 
	  joinColumns = @JoinColumn(name = "idStudent"), 
	  inverseJoinColumns = @JoinColumn(name = "idCourse"))
	private Set<Course> courses;

}
