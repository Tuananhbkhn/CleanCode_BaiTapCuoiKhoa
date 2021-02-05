package com.luvina.anhlvt.coursemanager.mapper;

import org.springframework.stereotype.Component;

import com.luvina.anhlvt.coursemanager.dto.CourseResDto;
import com.luvina.anhlvt.coursemanager.entity.Course;

@Component
public class CourseMapper {

	public CourseResDto convertToCourseResponseDto(Course course) {
		CourseResDto responseDto = new CourseResDto();
		responseDto.setId(course.getId());
		responseDto.setName(course.getName());
		responseDto.setLocation(course.getLocation());
		responseDto.setTeacherName(course.getTeacher().getName());
		
		return responseDto;
	}

}
