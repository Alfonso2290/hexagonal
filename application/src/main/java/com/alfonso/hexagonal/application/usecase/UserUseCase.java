package com.alfonso.hexagonal.application.usecase;

import com.alfonso.hexagonal.application.dto.UserDto;

public interface UserUseCase {

	String login(UserDto userDto);
}
