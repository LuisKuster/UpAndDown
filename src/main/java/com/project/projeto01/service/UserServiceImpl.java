package com.project.projeto01.service;

import com.project.projeto01.models.UserModel;
import com.project.projeto01.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);





    }
}
