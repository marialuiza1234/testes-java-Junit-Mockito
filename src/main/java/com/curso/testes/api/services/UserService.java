package com.curso.testes.api.services;

import com.curso.testes.api.domain.User;
import com.curso.testes.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
    void delete(Integer id);
}
