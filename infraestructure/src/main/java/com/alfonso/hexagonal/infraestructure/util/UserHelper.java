package com.alfonso.hexagonal.infraestructure.util;

import com.alfonso.hexagonal.application.dto.UserDto;
import com.alfonso.hexagonal.infraestructure.webdto.UserRequestWebDto;

public class UserHelper {

	public static UserDto buildUserDto(UserRequestWebDto userRequestWebDto){
		UserDto userDto = new UserDto();
		userDto.setUser(userRequestWebDto.getUser());
		userDto.setPassword(userRequestWebDto.getPassword());
		return userDto;
	}
}
