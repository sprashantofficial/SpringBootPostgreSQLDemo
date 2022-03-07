package com.example.SpringBootPostgres.controller;

import com.example.SpringBootPostgres.entity.User;
import com.example.SpringBootPostgres.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository repo;

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("user", new User());
        return "home";
    }

    @PostMapping("/save")
    public String saveUser(User user) {
        repo.save(user);

        return "home";
    }

}
