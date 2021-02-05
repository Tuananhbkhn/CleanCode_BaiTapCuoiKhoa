package com.luvina.anhlvt.coursemanager.factory;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;

import com.luvina.anhlvt.coursemanager.dto.UserDto;
import com.luvina.anhlvt.coursemanager.entity.User;
import com.luvina.anhlvt.coursemanager.enums.UserType;
import com.luvina.anhlvt.coursemanager.mapper.UserMapper;

@Component
@RequiredArgsConstructor
public class UserFactory {

    private final UserMapper userMapper;

    public User createUser(UserDto userDto) {
        User user = null;
        if (UserType.STUDENT.toString().equals(userDto.getMode())) {
            user = userMapper.convertToStudent(userDto);
        } else if (UserType.TEACHER.toString().equals(userDto.getMode())) {
            user = userMapper.convertToTeacher(userDto);
        }
        return user;
    }

}
