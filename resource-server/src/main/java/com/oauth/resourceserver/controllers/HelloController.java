package com.oauth.resourceserver.controllers;

import com.nimbusds.jwt.JWT;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@GetMapping
	public String hello(
			@AuthenticationPrincipal
			Jwt jwt
	) {
		return "Hello World!\n" + jwt.getTokenValue();
	}
}
