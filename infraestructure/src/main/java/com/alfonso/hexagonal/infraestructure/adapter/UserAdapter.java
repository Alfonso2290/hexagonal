package com.alfonso.hexagonal.infraestructure.adapter;

import com.alfonso.hexagonal.application.dto.UserDto;
import com.alfonso.hexagonal.application.port.UserOutPort;
import com.alfonso.hexagonal.application.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserAdapter implements UserOutPort {

	private final UserRepository userRepository;

	@Override
	public String login(UserDto userDto) {
		return userRepository.login(userDto);
	}
}
