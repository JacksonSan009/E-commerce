package com.example.ecommerce;

import com.example.ecommerce.model.User;
import com.example.ecommerce.repository.IUserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class EcommerceApplicationTests {

	@Autowired
	private IUserRepository userRepository;

	@Test
	@Disabled
	void createUserTest() {
		User user = new User(); user.setName("Jackson"); user.setLastName("Arango");
		user.setEmail("jacksonsan@"); user.setPassword("123");

		User response = userRepository.save(user);

		assertTrue(response.getPassword().equalsIgnoreCase(user.getPassword()));
	}

}
