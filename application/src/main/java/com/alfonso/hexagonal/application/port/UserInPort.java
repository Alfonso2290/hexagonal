package com.alfonso.hexagonal.application.port;

import com.alfonso.hexagonal.application.dto.UserDto;

public interface UserInPort {
	String login(UserDto userDto);
}
