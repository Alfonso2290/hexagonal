package com.alfonso.hexagonal.application.service;

import com.alfonso.hexagonal.application.dto.UserDto;
import com.alfonso.hexagonal.application.port.UserInPort;
import com.alfonso.hexagonal.application.port.UserOutPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class ServiceImpl implements UserInPort {

	private final UserOutPort userOutPort;


	@Override
	public String login(UserDto userDto) {
		return userOutPort.login(userDto);
	}
}
