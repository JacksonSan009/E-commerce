package com.example.ecommers.Data.Controller;

import com.example.ecommers.Data.Entity.User;
import com.example.ecommers.Data.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/home")
public class MainController {
    @Autowired

    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email,
                                           @RequestParam String password){

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }
}
