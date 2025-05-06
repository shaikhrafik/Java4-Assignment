package com.examtest.rest.service;

import java.util.List;

import com.examtest.rest.pojos.User;

public interface UserService {
    void registerUser(User user);
    User getUser(int id);
    void removeUser(int id);
    List<User> searchUsers(String name);
}

