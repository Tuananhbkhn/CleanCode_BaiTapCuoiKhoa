package com.luvina.anhlvt.coursemanager.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.luvina.anhlvt.coursemanager.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{
	
	@Query()
	List<Course> findAllByName(String query);
	
	List<Course> findAllByNameLike(String name);

	List<Course> findAllByNameLike(Sort sort, String keyword);

}
