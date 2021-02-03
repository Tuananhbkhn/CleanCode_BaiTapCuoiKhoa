package com.luvina.anhlvt.coursemanager.entity;

import lombok.Data;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String description;

    private String location;

    private Date opened;

    @ManyToMany(mappedBy = "course")
    private Set<Student> students;

    @ManyToOne()
    @JoinColumn(name = "idTeacher")
    private Teacher teacher;

}
