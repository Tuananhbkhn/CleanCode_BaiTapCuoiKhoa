package com.luvina.anhlvt.coursemanager.service;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luvina.anhlvt.coursemanager.dto.UserDto;
import com.luvina.anhlvt.coursemanager.dto.UserResponseDto;
import com.luvina.anhlvt.coursemanager.entity.User;
import com.luvina.anhlvt.coursemanager.error.ErrorCodes;
import com.luvina.anhlvt.coursemanager.error.ServiceRuntimeException;
import com.luvina.anhlvt.coursemanager.factory.UserFactory;
import com.luvina.anhlvt.coursemanager.mapper.UserMapper;
import com.luvina.anhlvt.coursemanager.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;
	private final UserFactory userFactory;
	private final UserMapper userMapper;

	public User findByEmail(String email) {
		return userRepository.findByEmail(email).orElse(null);
	}

	@Transactional()
	public UserResponseDto createUser(UserDto userDto) throws RuntimeException {
		if (findByEmail(userDto.getEmail()) == null) {
			User user = userFactory.createUser(userDto);
			User createdUser = userRepository.save(user);
			UserResponseDto userResponse = userMapper.convertToUserResponseDto(createdUser);
			return userResponse;
		} else {
			throw new ServiceRuntimeException(HttpStatus.BAD_REQUEST, ErrorCodes.USER_E001,
					"Email has already been taken");
		}
	}

}
