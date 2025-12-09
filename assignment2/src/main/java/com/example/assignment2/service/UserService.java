package com.example.assignment2.service;

import java.util.List;
import com.example.assignment2.dto.UserDTO;
import com.example.assignment2.entity.User;

public interface UserService {

    User createUser(UserDTO dto);

    User updateUser(Long id, UserDTO dto);

    List<User> getAllUsers();

    User getUserById(Long id);

    void deleteUser(Long id);
}
