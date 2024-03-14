package com.example.demon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demon.domain.login;
import com.example.demon.repository.loginrepo;

@Service
public class logservice {
    @Autowired
    private loginrepo repo;

    public login log(String username, String password) {
        login user = repo.findByUsernameAndPassword(username, password);
        return user;
    }
}
