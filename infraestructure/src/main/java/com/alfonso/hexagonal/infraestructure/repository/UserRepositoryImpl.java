package com.alfonso.hexagonal.infraestructure.repository;

import com.alfonso.hexagonal.application.dto.UserDto;
import com.alfonso.hexagonal.application.repository.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
	@Override
	public String login(UserDto userDto) {
		if(userDto.getUser().equals("cura") && userDto.getPassword().equals("123")) return "Login correcto";
		return "Login incorrecto";
	}
}
