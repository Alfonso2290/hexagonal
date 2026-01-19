package com.alfonso.hexagonal.application.repository;

import com.alfonso.hexagonal.application.dto.UserDto;

public interface UserRepository {

	String login(UserDto userDto);
}
