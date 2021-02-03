package com.luvina.anhlvt.coursemanager.dto;

import lombok.Data;

@Data
public class UserDto {

	protected String name;
	protected String email;
	protected String password;
	protected String mode;
	private StudentDto student;
	private TeacherDto teacher;

}
