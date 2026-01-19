package com.alfonso.hexagonal.infraestructure.controller;

import com.alfonso.hexagonal.application.usecase.UserUseCase;
import com.alfonso.hexagonal.infraestructure.util.UserHelper;
import com.alfonso.hexagonal.infraestructure.webdto.UserRequestWebDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

	private final UserUseCase userUseCase;

	@GetMapping("/login")
	public String login(@RequestBody UserRequestWebDto userRequestWebDto){
		return userUseCase.login(UserHelper.buildUserDto(userRequestWebDto));
	}
}

