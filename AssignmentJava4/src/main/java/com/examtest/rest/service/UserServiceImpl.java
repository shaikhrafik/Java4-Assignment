package com.examtest.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examtest.rest.dao.UserDao;
import com.examtest.rest.pojos.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDAO;

    @Override
    @Transactional
    public void registerUser(User user) {
        userDAO.save(user);
    }

    @Override
    public User getUser(int id) {
        return userDAO.findById(id);
    }

    @Override
    @Transactional
    public void removeUser(int id) {
        userDAO.delete(id);
    }

    @Override
    public List<User> searchUsers(String name) {
        return userDAO.findByName(name);
    }
}

