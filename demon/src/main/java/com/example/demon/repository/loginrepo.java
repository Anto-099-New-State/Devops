package com.example.demon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demon.domain.login;

@Repository
public interface loginrepo extends JpaRepository<login, String> {
    login findByUsernameAndPassword(String username, String password);
}
