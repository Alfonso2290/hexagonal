package com.alfonso.hexagonal.application.port;

import com.alfonso.hexagonal.application.dto.UserDto;

public interface UserOutPort {
	String login(UserDto userDto);
}
