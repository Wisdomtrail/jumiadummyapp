package com.example.jumia;

import com.example.jumia.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JumiaApplicationTests {

	@Autowired
	private UserService userService;
}
