package com.luvina.anhlvt.coursemanager.mapper;

import org.springframework.stereotype.Component;

import com.luvina.anhlvt.coursemanager.dto.UserDto;
import com.luvina.anhlvt.coursemanager.dto.UserResponseDto;
import com.luvina.anhlvt.coursemanager.entity.Student;
import com.luvina.anhlvt.coursemanager.entity.Teacher;
import com.luvina.anhlvt.coursemanager.entity.User;

@Component
public class UserMapper {

    public User convertToTeacher(UserDto userDto){
        Teacher teacher = new Teacher();
        teacher.setEmail(userDto.getEmail());
        teacher.setName(userDto.getName());
        teacher.setPassword(userDto.getPassword());
        teacher.setExperiences(userDto.getTeacher().getExperiences());
        teacher.setPhone(userDto.getTeacher().getPhone());

        return teacher;
    }

    public User convertToStudent(UserDto userDto){
        Student student = new Student();
        student.setEmail(userDto.getEmail());
        student.setName(userDto.getName());
        student.setPassword(userDto.getPassword());
        student.setYear(userDto.getStudent().getYear());

        return student;
    }

	public UserResponseDto convertToUserResponseDto(User createdUser) {
		UserResponseDto responseDto = new UserResponseDto();
		responseDto.setEmail(createdUser.getEmail());
		responseDto.setName(createdUser.getName());
		return responseDto;
	}
}
