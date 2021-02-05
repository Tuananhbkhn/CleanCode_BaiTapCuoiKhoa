package com.luvina.anhlvt.coursemanager.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luvina.anhlvt.coursemanager.dto.CourseReqSearchDto;
import com.luvina.anhlvt.coursemanager.dto.CourseResDto;
import com.luvina.anhlvt.coursemanager.entity.Course;
import com.luvina.anhlvt.coursemanager.enums.CourseSortType;
import com.luvina.anhlvt.coursemanager.mapper.CourseMapper;
import com.luvina.anhlvt.coursemanager.repository.CourseRepository;
import com.luvina.anhlvt.coursemanager.strategy.SortCourseByNameStrategy;
import com.luvina.anhlvt.coursemanager.strategy.SortCourseByOpenedStrategy;
import com.luvina.anhlvt.coursemanager.strategy.SortCourseStrategy;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CourseService {

	private final CourseRepository courseRepository;
	private final CourseMapper courseMapper;
	private SortCourseStrategy sortCourseStrategy;

	public void setSortCourseStrategy(SortCourseStrategy sortCourseStrategy) {
		this.sortCourseStrategy = sortCourseStrategy;
	}

	@Transactional(readOnly = true)
	public List<CourseResDto> getCourses(CourseReqSearchDto courseDto) {
		String keyword = courseDto.getKeyword();
		String sortBy = courseDto.getSortBy();

		List<Course> courses = new ArrayList<Course>();


		if (sortBy == null) {
			if (keyword == null) {
				courses = courseRepository.findAll();
			} else if (keyword != null) {
				courses = courseRepository.findAllByNameLike("%" + keyword + "%");
			}
		} else if (sortBy != null) {
			if (CourseSortType.OPENED.toString().equals(sortBy)) {
				sortCourseStrategy = new SortCourseByOpenedStrategy();
			} else {
				sortCourseStrategy = new SortCourseByNameStrategy();
			}
			Sort sort = sortCourseStrategy.getSort();
			if (keyword == null) {
				courses = courseRepository.findAll(sort);
			} else if (keyword != null) {
				courses = courseRepository.findAllByNameLike(sort, "%" + keyword + "%");
			}
		}

		return courses.stream().map(course -> courseMapper.convertToCourseResponseDto(course))
				.collect(Collectors.toList());
	}

}
