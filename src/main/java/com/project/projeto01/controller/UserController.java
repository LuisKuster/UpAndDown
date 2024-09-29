package com.project.projeto01.controller;


import com.project.projeto01.models.UserModel;
import com.project.projeto01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UserModel")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/addUser")
    public String add(@RequestBody UserModel user){

        userService.saveUser(user);
        return "Usuario Adicionado";

    }


}
