package com.examtest.rest.dao;

import org.springframework.stereotype.Repository;

import com.examtest.rest.pojos.User;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class UserDaoImpl implements UserDao {
    private Map<Integer, User> userMap = new HashMap<>();

    @Override
    public void save(User user) {
        userMap.put(user.getUserId(), user);
    }

    @Override
    public void delete(int id) {
        userMap.remove(id);
    }

    @Override
    public User findById(int id) {
        return userMap.get(id);
    }

    @Override
    public List<User> findByName(String name) {
        return userMap.values().stream()
                .filter(u -> u.getUserName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }
}

