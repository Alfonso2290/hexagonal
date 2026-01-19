package com.alfonso.hexagonal.application.service;

import com.alfonso.hexagonal.application.dto.UserDto;
import com.alfonso.hexagonal.application.port.UserInPort;
import com.alfonso.hexagonal.application.usecase.UserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserInteractor implements UserUseCase {

	private final UserInPort userInPort;

	@Override
	public String login(UserDto userDto) {
		return userInPort.login(userDto);
	}
}
