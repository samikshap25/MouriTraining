package com.example.assignment2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment2.dto.UserDTO;
import com.example.assignment2.entity.User;
import com.example.assignment2.exception.*;
import com.example.assignment2.repository.UserRepository;
import com.example.assignment2.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repo;

    @Override
    public User createUser(UserDTO dto) {
        User user = new User();
        user.setFname(dto.getFname());
        user.setLname(dto.getLname());
        user.setAge(dto.getAge());
        user.setCity(dto.getCity());
        return repo.save(user);
    }

    @Override
    public User updateUser(Long id, UserDTO dto) {
        User user = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));

        user.setFname(dto.getFname());
        user.setLname(dto.getLname());
        user.setAge(dto.getAge());
        user.setCity(dto.getCity());

        return repo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
    }

    @Override
    public void deleteUser(Long id) {
        if (!repo.existsById(id)) {
            throw new ResourceNotFoundException("User not found with id: " + id);
        }
        repo.deleteById(id);
    }
}
