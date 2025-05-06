package com.examtest.rest.dao;

import java.util.List;

import com.examtest.rest.pojos.User;

public interface UserDao {
    void save(User user);
    void delete(int id);
    User findById(int id);
    List<User> findByName(String name);
}
