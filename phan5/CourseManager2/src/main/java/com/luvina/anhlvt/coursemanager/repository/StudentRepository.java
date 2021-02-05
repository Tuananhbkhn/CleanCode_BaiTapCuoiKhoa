package com.luvina.anhlvt.coursemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luvina.anhlvt.coursemanager.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
