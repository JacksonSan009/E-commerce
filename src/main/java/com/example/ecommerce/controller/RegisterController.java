package com.example.ecommerce.controller;

import com.example.ecommerce.model.User;
import com.example.ecommerce.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class RegisterController {
	@Autowired
	private IUserRepository userRepository;

	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("User", new User()); return "register";
	}

	@PostMapping("/process_registration")
	public String processRegistration(User user, @RequestParam(
			"inputImage") MultipartFile multipartFile) throws IOException {
		//Encrypt the password
		user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));

		String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
		user.setImagePath(fileName); User savedUser = userRepository.save(user);

		String uploadDir = "src/main/resources/images/user-profile-photo/user-" + savedUser.getId();

		FileUploadUtil.saveImage(uploadDir, fileName, multipartFile);

		return "login";
	}
}
