package com.my.spacemanagement.service;

import com.google.common.collect.ImmutableList;
import com.my.spacemanagement.model.Repository.UserRepository;
import com.my.spacemanagement.model.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return ImmutableList.copyOf(userRepository.findAll());
    }
}
